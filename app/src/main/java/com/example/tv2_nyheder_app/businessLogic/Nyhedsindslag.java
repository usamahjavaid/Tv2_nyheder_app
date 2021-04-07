package com.example.tv2_nyheder_app.businessLogic;

import java.util.Date;

public class Nyhedsindslag {

    String Overskrift;
    String teasertekst;
    String UrlVideo;
    String UrlStilbillede;
    Date Udgivelsesdato;
    boolean Udgivet;
    boolean Slettet;

    public String getOverskrift() {
        return Overskrift;
    }

    public void setOverskrift(String overskrift) {
        Overskrift = overskrift;
    }

    public String getTeasertekst() {
        return teasertekst;
    }

    public void setTeasertekst(String teasertekst) {
        this.teasertekst = teasertekst;
    }

    public String getUrlVideo() {
        return UrlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        UrlVideo = urlVideo;
    }

    public String getUrlStilbillede() {
        return UrlStilbillede;
    }

    public void setUrlStilbillede(String urlStilbillede) {
        UrlStilbillede = urlStilbillede;
    }

    public Date getUdgivelsesdato() {
        return Udgivelsesdato;
    }

    public void setUdgivelsesdato(Date udgivelsesdato) {
        Udgivelsesdato = udgivelsesdato;
    }

    public boolean isUdgivet() {
        return Udgivet;
    }

    public void setUdgivet(boolean udgivet) {
        Udgivet = udgivet;
    }



    public boolean isSlettet() {
        return Slettet;
    }

    public void setSlettet(boolean slettet) {
        Slettet = slettet;
    }

    public Nyhedsindslag(String overskrift, String teasertekst, String urlStilbillede) {
        Overskrift = overskrift;
        this.teasertekst = teasertekst;
        UrlStilbillede = urlStilbillede;
    }

    public Nyhedsindslag() {
    }
}

