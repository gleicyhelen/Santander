package com.example.gleic.santander.json;

import com.google.gson.annotations.SerializedName;

public class MoreInfo {

    //usando as classes do parametro moreinfo do json
    private Month month;
    private Year year;
    @SerializedName("12months")
    private Months months;

    //criando os contrutores para os parametros:


    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }
}
