package com.giray.entity;

public class Saglik {

    /**
     * 2- Bir sa�l�k s�n�f� tan�mlayarak i�ine "asilamaYap" methodu ekleyiniz. Bu method i�ine insan nesneleri alabilsin.
     * Sadece Hastal�k bula�abilecek Normal  Insanlar� a��las�n ve a��lad��� insanlar� bir listeye eklesin.
     */
    public static NormalInsan[] asilananInsanlar = new NormalInsan[10];
    public static int asilananInsanSayisi=0;



    public void asilamaYap(Insan insan) {

        if (insan instanceof NormalInsan) {
            NormalInsan normalInsan = (NormalInsan) insan;
            if (normalInsan.hastalikTasiyor) {
                normalInsan.hastalikTasiyor = false; // Hastal��� ge�irmedi�ini varsayal�m
                asilananInsanlar[asilananInsanSayisi++] = normalInsan;
                System.out.println(normalInsan + " a��land� ve kaydedildi.");
            } else {
                System.out.println(normalInsan + " di�er durum, a��lanamaz.");
            }
        } else {
            System.out.println(insan + " a��lanamaz, ��nk� sadece Normal Insanlar a��lanabilir.");
        }
    }

    // A��lanan insanlar� raporlama metodu
    public void raporEt() {
        System.out.println("A��lanan insanlar:");
        for (Insan insan : asilananInsanlar) {
            System.out.println(insan);

        }
    }
    //A��lanan insan Say�s�.
    public static void raporEt2(){
        System.out.println("A��lanan normal insanlar:");
        for (int i = 0; i < asilananInsanSayisi; i++) {
            System.out.println(asilananInsanlar[i]);
            System.out.println("A��lanan Ki�i Say�s� "+asilananInsanSayisi);

        }
    }
}
