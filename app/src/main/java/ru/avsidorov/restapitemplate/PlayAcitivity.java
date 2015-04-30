package ru.avsidorov.restapitemplate;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import com.afollestad.materialdialogs.MaterialDialog;


public class PlayAcitivity extends ActionBarActivity implements Constants {
    VideoView mPlayer;
    MaterialDialog mMaterialDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_acitivity);
        mPlayer = (VideoView) findViewById(R.id.player);
        Uri uri = Uri.parse(getIntent().getStringExtra(URI));
        if (!uri.toString().isEmpty()) {
            playTedVideo(uri);
        }
    }

    private void playTedVideo(Uri uri) {

        mPlayer.setVideoURI(uri);
        mPlayer.setMediaController(new MediaController(this));
        mPlayer.requestFocus();

        mPlayer.start();
    }

    @Override
    public void onBackPressed() {
        mPlayer.pause();
        mMaterialDialog = new MaterialDialog.Builder(this)
                .title(R.string.back)
                .content(R.string.sure_question)
                .autoDismiss(false)
                .positiveText(R.string.ok)
                .negativeText(R.string.cancel)
                .callback(new MaterialDialog.ButtonCallback() {
                    @Override
                    public void onPositive(MaterialDialog dialog) {
                        super.onPositive(dialog);
                        finish();
                    }

                    @Override
                    public void onNegative(MaterialDialog dialog) {
                        super.onNegative(dialog);
                        dialog.dismiss();
                        mPlayer.start();
                    }
                })
                .show();

    }

    @Override
    protected void onDestroy() {
        if (mMaterialDialog != null) {
            mMaterialDialog.dismiss();

        }
        super.onDestroy();
    }
}
