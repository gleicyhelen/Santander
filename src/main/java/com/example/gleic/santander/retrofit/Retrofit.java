package com.example.gleic.santander.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface Retrofit {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://floating-mountain-50292.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}

}
