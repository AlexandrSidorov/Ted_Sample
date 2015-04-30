package ru.avsidorov.restapitemplate.Service;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

import ru.avsidorov.restapitemplate.Api.Api;

/**
 * Created by Alexandr Sidorov on 28.04.2015.
 */
public class Service extends RetrofitGsonSpiceService {
    private final static String BASE_URL = "https://api.ted.com/v1";

    @Override
    public void onCreate() {
        super.onCreate();
        addRetrofitInterface(Api.class);
    }


    @Override
    protected String getServerUrl() {
        return BASE_URL;
    }


}
