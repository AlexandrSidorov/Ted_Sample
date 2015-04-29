package ru.avsidorov.restapitemplate.Activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.octo.android.robospice.SpiceManager;

import ru.avsidorov.restapitemplate.R;
import ru.avsidorov.restapitemplate.Service.Service;


public class AbstractActivity extends ActionBarActivity {
    private SpiceManager spiceManager = new SpiceManager(Service.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract);
    }

    @Override
    protected void onStart() {
        spiceManager.start(this);
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        spiceManager.shouldStop();
    }

    public SpiceManager getSpiceManager() {
        return spiceManager;
    }
}
