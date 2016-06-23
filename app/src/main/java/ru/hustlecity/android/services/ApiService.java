package ru.hustlecity.android.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by wispoz on 23.06.16.
 */
public class ApiService {
    public static final String API_URL = "http://api.hustlecity.ru";
    public interface RestApi {
        @Headers( "Content-Type: application/json" )
        @GET("/dancers/")
        Call<JSONResponse> getJSON();

        @GET("/dancers/")
        Call<JSONResponse> getMore(@Query("page") int page);

        @GET("/dancers/")
        Call<JSONResponse> getDancer(@Query("dancer") int page);
    }

}
