package com.example.gleic.santander.retrofit;

import com.example.gleic.santander.json.Fund;


import retrofit2.Call;
import retrofit2.http.GET;

public interface Services {

    @GET("fund.json")
    Call<Fund> getFund();

}
