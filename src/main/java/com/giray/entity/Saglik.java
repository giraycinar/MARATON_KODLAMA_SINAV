package com.giray.entity;

public class Saglik {

    /**
     * 2- Bir saðlýk sýnýfý tanýmlayarak içine "asilamaYap" methodu ekleyiniz. Bu method içine insan nesneleri alabilsin.
     * Sadece Hastalýk bulaþabilecek Normal  Insanlarý aþýlasýn ve aþýladýðý insanlarý bir listeye eklesin.
     */
    public static NormalInsan[] asilananInsanlar = new NormalInsan[10];
    public static int asilananInsanSayisi=0;



    public void asilamaYap(Insan insan) {

        if (insan instanceof NormalInsan) {
            NormalInsan normalInsan = (NormalInsan) insan;
            if (normalInsan.hastalikTasiyor) {
                normalInsan.hastalikTasiyor = false; // Hastalýðý geçirmediðini varsayalým
                asilananInsanlar[asilananInsanSayisi++] = normalInsan;
                System.out.println(normalInsan + " aþýlandý ve kaydedildi.");
            } else {
                System.out.println(normalInsan + " diðer durum, aþýlanamaz.");
            }
        } else {
            System.out.println(insan + " aþýlanamaz, çünkü sadece Normal Insanlar aþýlanabilir.");
        }
    }

    // Aþýlanan insanlarý raporlama metodu
    public void raporEt() {
        System.out.println("Aþýlanan insanlar:");
        for (Insan insan : asilananInsanlar) {
            System.out.println(insan);

        }
    }
    //Aþýlanan insan Sayýsý.
    public static void raporEt2(){
        System.out.println("Aþýlanan normal insanlar:");
        for (int i = 0; i < asilananInsanSayisi; i++) {
            System.out.println(asilananInsanlar[i]);
            System.out.println("Aþýlanan Kiþi Sayýsý "+asilananInsanSayisi);

        }
    }
}
