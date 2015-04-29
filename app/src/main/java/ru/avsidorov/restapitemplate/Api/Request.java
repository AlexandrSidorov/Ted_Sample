package ru.avsidorov.restapitemplate.Api;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

import java.util.Map;

import ru.avsidorov.restapitemplate.Models.ResponceTalker;
import ru.avsidorov.restapitemplate.Models.ResponseTalks;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */
@SuppressWarnings("ALL")
public class Request {
    public static class TalksReguest extends RetrofitSpiceRequest<ResponseTalks, Api> {
        Map<String,String>mQuery;

        public TalksReguest(Map<String, String> query) {
            super(ResponseTalks.class, Api.class);
            mQuery = query;
        }

        @Override
        public ResponseTalks loadDataFromNetwork() throws Exception {
            return getService().talks(mQuery);
        }
    }
    public static class TalkerRequest extends RetrofitSpiceRequest<ResponceTalker,Api>{
        Map<String,String>mQuery;
        int mId;

        public TalkerRequest(Map<String, String> query, int id){
            super(ResponceTalker.class, Api.class);
            mId = id;
            mQuery = query;

        }

        @Override
        public ResponceTalker loadDataFromNetwork() throws Exception {
            return getService().talker(mQuery,mId);
        }
    }
}
