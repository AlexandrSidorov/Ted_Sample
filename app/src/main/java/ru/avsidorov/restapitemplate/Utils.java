package ru.avsidorov.restapitemplate;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.HashMap;

/**
 * Created by Alexandr Sidorov on 29.04.2015.
 */
public class Utils implements Constants{
    /**Sorting - descending
     *
     * @param limit numbers entries on page
     * @param offset offset
     * @return HashMap
     */
    public static HashMap<String, String> getQuery(int limit, int offset) {
        HashMap<String, String> query = new HashMap<>();
        query.put(API_KEY, KEY);
        query.put(ORDER, SORT);
        query.put(LIMIT, String.valueOf(limit));
        query.put(OFFSET, String.valueOf(offset));
        return query;
    }

    /**
     * Standart template for query. Include only api key
     * @return HashMap
     */
    public static HashMap<String, String> getBaseQuery(){
        HashMap<String, String> query = new HashMap<>();
        query.put(API_KEY, KEY);
        return query;
    }

    public static boolean isNetworkConnectedOrConnecting(Context context) {
        final ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
