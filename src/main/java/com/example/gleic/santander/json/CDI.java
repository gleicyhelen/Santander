package com.example.gleic.santander.json;

import com.google.gson.annotations.SerializedName;

public class CDI {

    @SerializedName("cdi")
    private String cdi;

    public String getCdi() {
        return cdi;
    }

    public void setCdi(String cdi) {
        this.cdi = cdi;
    }
}
