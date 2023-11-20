package com.giray.entity;

import java.util.UUID;

public class Insan {
    public String id;
    public String ad;
    public String soyad;
    public String kimlikNo;
    public String telefon;
    public String email;
    public String profilResmi;


    public Insan() {
        this.id= UUID.randomUUID().toString();
    }

    public Insan(String ad, String soyad, String kimlikNo, String telefon, String email, String profilResmi) {
        this.id= UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.telefon = telefon;
        this.email = email;
        this.profilResmi = profilResmi;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", profilResmi='" + profilResmi + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilResmi() {
        return profilResmi;
    }

    public void setProfilResmi(String profilResmi) {
        this.profilResmi = profilResmi;
    }
}
