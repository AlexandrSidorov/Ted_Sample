package ru.avsidorov.restapitemplate.Service;

import android.app.Application;

import com.octo.android.robospice.persistence.CacheManager;
import com.octo.android.robospice.persistence.exception.CacheCreationException;
import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

import retrofit.converter.Converter;
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
    public CacheManager createCacheManager(Application application) throws CacheCreationException {
        return super.createCacheManager(application);
    }

    @Override
    protected String getServerUrl() {
        return BASE_URL;
    }

    @Override
    protected Converter createConverter() {
        return super.createConverter();
    }
}
