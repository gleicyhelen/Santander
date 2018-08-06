package com.example.gleic.santander.json;

//informacoes dentro do screen :


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Screen {

    //declarando as classes,que pertencem ao screen no Json:


    private String title;
    private String fundName;
    private String whatIs;
    private String definition;
    private String riskTitle;
    @SerializedName("risk")
    private Risk risk;
    private String infoTitle;
    private MoreInfo moreInfo;
    private List<Info> info;
    private List<CDI> cdi;

    //criando os metodos para a classe :


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }

    public List<CDI> getCdi() {
        return cdi;
    }

    public void setCdi(List<CDI> cdi) {
        this.cdi = cdi;
    }
}
