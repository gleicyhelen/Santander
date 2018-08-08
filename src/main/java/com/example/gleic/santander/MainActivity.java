package com.example.gleic.santander;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.gleic.santander.json.Fund;
import com.example.gleic.santander.retrofit.Retrofit;
import com.example.gleic.santander.retrofit.Services;
import com.example.gleic.santander.

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class
MainActivity extends AppCompatActivity {

    private android.support.v4.app.FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fm = getSupportFragmentManager();


    }



    private void init(){
        Services services = Retrofit.retrofit.create(Services.class);

        Call<Fund> fund = services.getFund();

        //forma assincrona :
        fund.enqueue(new Callback<Fund>() {
            @Override
            public void onResponse(Call<Fund> call, Response<Fund> response) {

                Fund fundReturn = response.body();

            }

            @Override
            public void onFailure(Call<Fund> call, Throwable t) {

            }
        });

}}

