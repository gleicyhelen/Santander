package com.example.gleic.santander;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class
MainActivity extends AppCompatActivity {

    private android.support.v4.app.FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fm = getSupportFragmentManager();


    }

    /*private void init(){
        Services services = Retrofit.retrofit.getClass(Investimento);

                //Retrofit.retrofit.create(Services.class);

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
        });*/

}

