package ru.avsidorov.restapitemplate.Api;

import java.util.Map;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;
import ru.avsidorov.restapitemplate.Models.ResponceTalker;
import ru.avsidorov.restapitemplate.Models.ResponseTalks;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */
public interface Api {
    @GET("/talks.json")
    ResponseTalks talks(@QueryMap Map<String,String> options);

    @GET("/talks/{id}.json")
    ResponceTalker talker(@QueryMap Map<String,String> options,@Path("id") int id);
}
