package com.example.apilicores.apiManager;


import com.example.apilicores.models.Slug;
import com.example.apilicores.models.Whiskyes;
import com.example.apilicores.models.distillery;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
//la conexion a la url base y a los enpoint
public interface Api {
    String BASE_URL = "https://whiskyhunter.net/api/";

    @GET ("distilleries_info")
    Call<List<distillery>> getDestilerias();

    @GET("auctions_info")
    Call<List<Whiskyes>> getWhiskyes();

    @GET("auction_data/{slug}")
    Call<List<Slug>> getSlug(@Path ("slug") String slug);
}
