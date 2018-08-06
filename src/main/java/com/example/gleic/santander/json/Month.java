package com.example.gleic.santander.json;

import com.google.gson.annotations.SerializedName;

public class Month {

    //Recuperando as informações do parametro month do Json:

    private String fund;
    @SerializedName("CDI")
    private String cdi;

   //criando os construtores get e set  para as strings:


    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getCdi() {
        return cdi;
    }

    public void setCdi(String cdi) {
        this.cdi = cdi;
    }
}
