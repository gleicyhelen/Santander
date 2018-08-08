package com.example.gleic.santander;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gleic.santander.json.Fund;
import com.example.gleic.santander.retrofit.Retrofit;
import com.example.gleic.santander.retrofit.Services;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Investimento extends Fragment {

    private TextView fundoMes;
    private TextView fundoAno;
    private TextView fundoMeses;

    private TextView cdiMes;
    private TextView cdiAno;
    private TextView cdiMeses;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(container,R.layout.informacoes_investimento,false);

        fundoMes = view.findViewById(R.id.fundoMes);
        fundoAno = view.findViewById(R.id.fundoAno);
        fundoMeses = view.findViewById(R.id.fundoMeses);

        cdiMes = view.findViewById(R.id.cdiMes);
        cdiAno = view.findViewById(R.id.cdiAno);
        cdiMeses = view.findViewById(R.id.cdiMeses);


        return view;
    }

    private void init(){
        Services services = Retrofit.retrofit.create(Services.class);

        final Call<Fund> fund = services.getFund();

        //forma assincrona :
        fund.enqueue(new Callback<Fund>() {
            @Override
            public void onResponse(Call<Fund> call, Response<Fund> response) {

                Fund fundReturn = response.body();


                fundoMes.setText(fundReturn.getScreen().getTitle());
                fundoAno.setText(fundReturn.getScreen().getTitle());
                fundoMeses.setText(fundReturn.getScreen().getTitle());

                cdiMes.setText(fundReturn.getScreen().getTitle());
                cdiAno.setText(fundReturn.getScreen().getTitle());
                cdiMeses.setText(fundReturn.getScreen().getTitle());

            }

            @Override
            public void onFailure(Call<Fund> call, Throwable t) {

            }
        });


    }}
