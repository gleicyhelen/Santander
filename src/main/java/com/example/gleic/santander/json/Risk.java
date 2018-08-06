package com.example.gleic.santander.json;

import com.google.gson.annotations.SerializedName;

public enum Risk {

    //grau de risco de 1 a 5 -- CLASSE DO TIPO ENUM

    @SerializedName("1")
    LOW,
    @SerializedName("2")
    LOW_REGULAR,
    @SerializedName("3")
    REGULAR,
    @SerializedName("4")
    REGULAR_HIGH,
    @SerializedName("5")
    HIGH

}
