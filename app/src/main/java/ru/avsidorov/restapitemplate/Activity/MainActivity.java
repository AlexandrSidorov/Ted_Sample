package ru.avsidorov.restapitemplate.Activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.gc.materialdesign.views.ProgressBarCircularIndeterminate;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;
import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayoutDirection;

import java.util.ArrayList;
import java.util.HashMap;

import ru.avsidorov.restapitemplate.Adapters.TalksAdapter;
import ru.avsidorov.restapitemplate.Api.Request;
import ru.avsidorov.restapitemplate.Constants;
import ru.avsidorov.restapitemplate.Models.ResponceTalker;
import ru.avsidorov.restapitemplate.Models.ResponseTalks;
import ru.avsidorov.restapitemplate.Models.Talks_;
import ru.avsidorov.restapitemplate.PlayAcitivity;
import ru.avsidorov.restapitemplate.R;
import ru.avsidorov.restapitemplate.Utils;

public class MainActivity extends AbstractActivity implements Constants {
    private ArrayList<Talks_> mTalkList;
    private TalksAdapter mTalksAdapter;
    private ListView mTalksListView;
    private SwipyRefreshLayout swipeRefreshLayout;
    private Toolbar mToolbar;
    ProgressBarCircularIndeterminate mProgressBarCircularIndeterminate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerReceiver(this.mConnReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        initUI();
        if (savedInstanceState != null) {
            mTalkList = (ArrayList<Talks_>) savedInstanceState.getSerializable("put");
            mProgressBarCircularIndeterminate.setVisibility(View.INVISIBLE);
        }
        setListView();
    }

    private void initUI() {
        mProgressBarCircularIndeterminate = (ProgressBarCircularIndeterminate) findViewById(R.id.progressBarInt);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        swipeRefreshLayout = (SwipyRefreshLayout) findViewById(R.id.swipe);
        mTalksListView = (ListView) findViewById(R.id.talksListView);
        setSupportActionBar(mToolbar);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("put", mTalkList);
    }



    /**
     * Prepare UI for work.
     */
    private void setListView() {

        checkConnection();
        swipeRefreshLayout.setOnRefreshListener(new SwipyRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(SwipyRefreshLayoutDirection swipyRefreshLayoutDirection) {

                getTEDList(Utils.getQuery(20, mTalksAdapter.getCount()));


            }
        });


        if (mTalkList == null) {
            mTalkList = new ArrayList<Talks_>();
            mProgressBarCircularIndeterminate.setVisibility(View.VISIBLE);
            getTEDList(Utils.getQuery(20, 0));

        }
        if (mTalksAdapter != null) {
            mTalksAdapter.notifyDataSetChanged();

        } else {
            mTalksAdapter = new TalksAdapter(this, R.layout.talks_item, mTalkList);
            mTalksListView.setAdapter(mTalksAdapter);
            mTalksAdapter.notifyDataSetChanged();
        }
        mTalksListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mProgressBarCircularIndeterminate.setVisibility(View.VISIBLE);
                int i = ((TalksAdapter) parent.getAdapter()).getItem(position).getId();
                Request.TalkerRequest talkerRequest = new Request.TalkerRequest(Utils.getBaseQuery(), i);
                getSpiceManager().execute(talkerRequest, new RequestListener<ResponceTalker>() {
                    @Override
                    public void onRequestFailure(SpiceException spiceException) {
                        mProgressBarCircularIndeterminate.setVisibility(View.GONE);
                    }

                    @Override
                    public void onRequestSuccess(ResponceTalker responceTalker) {
                        mProgressBarCircularIndeterminate.setVisibility(View.GONE);
                        Intent intent = new Intent(MainActivity.this, PlayAcitivity.class);
                        intent.putExtra("url", responceTalker.getTalk().getMedia().getInternal().get320k().getUri());
                        startActivity(intent);
                    }
                });


            }
        });



    }

    private void checkConnection() {
        if (!(Utils.isNetworkConnectedOrConnecting(this))){
            showConnectionIsFailed();

        }
    }

    private void showConnectionIsFailed() {
        new MaterialDialog.Builder(this).title(R.string.error_title)
                .content(R.string.nointernet)
                .positiveText(R.string.ok)
                .callback(new MaterialDialog.ButtonCallback() {
                    @Override
                    public void onPositive(MaterialDialog dialog) {
                        super.onPositive(dialog);
                        finish();
                    }
                }).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Create request to ted api for response List of Ted Talks
     *
     * @param query Parameters for request (sorting, offset etc...)
     */

    private void getTEDList(HashMap<String, String> query) {

        Request.TalksReguest talksReguest = new Request.TalksReguest(query);
        getSpiceManager().execute(talksReguest, mRequestListener);

    }

    private void updateList(ResponseTalks responseTalks) {
        for (int i = 0; i < responseTalks.getTalks().size(); i++) {
            mTalkList.add(responseTalks.getTalks().get(i).getTalk());
        }

        mTalksAdapter.notifyDataSetChanged();
    }


    RequestListener<ResponseTalks> mRequestListener = new RequestListener<ResponseTalks>() {
        @Override
        public void onRequestFailure(SpiceException spiceException) {
            mProgressBarCircularIndeterminate.setVisibility(View.GONE);
//            Dialogs.showErrors(getBaseContext(), spiceException);
        }

        @Override
        public void onRequestSuccess(ResponseTalks responseTalks) {
            updateList(responseTalks);
            swipeRefreshLayout.setRefreshing(false);
            if (mTalksAdapter.getCount() > 20) {
                mTalksListView.smoothScrollByOffset(3);
            } else {
                mProgressBarCircularIndeterminate.setVisibility(View.GONE);
            }
        }
    };
   // Class from http://stackoverflow.com/
    private BroadcastReceiver mConnReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
             NetworkInfo currentNetworkInfo = (NetworkInfo) intent.getParcelableExtra(ConnectivityManager.EXTRA_NETWORK_INFO);
                if(!currentNetworkInfo.isConnected()){
                showConnectionIsFailed();
            }
        }
    };

}
