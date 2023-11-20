package com.giray;


import com.giray.entity.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        /**
         * Bir felaket senaryosunda insanlar hastalanmakta ve bir birbirlerine hastalýk bulaþtýrmaktadýrlar.
         * Bizim uygulamamýzda; tedavi ve aþýlama yapýlacak insanlar belirlenir ve aþýlamalarý yapýlarak kayýt altýna alýnýrlar.
         * Sizden beklenenler, insanlar gruplara ayrýlacaktýr;
         * Normal insan; hastalýðý taþýyabilir, hasta olabilir
         * Doktor, hastalýða karþý aþýlýdýr ancak hastalýðý bulaþtýrabilir.
         * Super insan, hastalanmaz ya da hastalýðý bulaþtýrmaz.
         * Sorular;
         * 1- bu insan tiplerini kalýtýmý içerecek þekilde tanýmlayýnýz.   +
         * 2- Bir saðlýk sýnýfý tanýmlayarak içine "asilamaYap" methodu ekleyiniz. Bu method içine insan nesneleri alabilsin.
         * Sadece Hastalýk bulaþabilecek Normal  Insanlarý aþýlasýn ve aþýladýðý insanlarý bir listeye eklesin.
         * (Polimorphism ile kullanan +10 puan alýr)
         * 3- aþýlanan insanlarý listesini görebileceðimiz bir rapor ekraný olsun. (consol a çýktý verecek þekilde ayarlayalým.)
         *
         * 1- Insan --> insan array
         * 2- Saðlýklý-Hasta-Taþýyýcý
         * 3- Saðlýk Sýnýfý --> asilamaYap mothodu ekle --> insan nesnelerini alsýn
         * 4- Sadece Hastalýk bulaþabilecek Normal  Insanlarý aþýlasýn. --> aþýlanan array
         *
         */


        int secimYap;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("************************************************");
            System.out.println("****************    DOOMSDAY    ****************");
            System.out.println("************************************************");
            System.out.println();
            System.out.println("1- NormalInsan Bilgilerini Göster...");
            System.out.println("2- Doktor Bilgilerini Göster...");
            System.out.println("3- SuperInsan Bilgilerini Göster...");
            System.out.println("4- Aþýlanan Insan Bilgilerini Göster...");
            System.out.println("5- Aþýlanan Insan Sayýsýný Göster...");
            System.out.println("0- ****    ÇIKIS    ****");
            System.out.println("Bir Seçim Yapýnýz...(1-2-3-4-5-0)...: ");
            Insan insan = new Insan();

            secimYap = scanner.nextInt();
            switch (secimYap) { //methodlarla switch-case içerisine attýk. Bu þekilde daha düzenli oldu.
                case 1: NI();  break;
                case 2: D();   break;
                case 3: SI();  break;
                case 4: Asi(); break;
                case 5: Asi2();break;
                case 0: System.out.println("DOOMSDAY Programýndan Çýkýldý...");break;
                default: System.out.println("Ýþlem Tanýmlý Deðil")            ;break;
            }

        } while (secimYap != 0);
    }


        public static void NI(){
            NormalInsan normalInsan= new NormalInsan(true);

            normalInsan.ad="Xavier";
            normalInsan.soyad="X";
            normalInsan.email="Xmail.com";
            normalInsan.kimlikNo="123456789";
            normalInsan.telefon="45455";
            normalInsan.profilResmi="dd.jpg";
            System.out.println(normalInsan.toString());
        }

        public static void D(){
            Doktor doktor = new Doktor(true);

            doktor.ad="Heisenberg";
            doktor.soyad="Bad";
            doktor.email="Hmail.com";
            doktor.kimlikNo="987654987";
            doktor.profilResmi="klk.jpg";
            doktor.telefon="89898";
            System.out.println(doktor.toString());
        }
        public static void SI(){
             SuperInsan superInsan= new SuperInsan();
             superInsan.ad="Batman";
             superInsan.soyad="Bat";
             superInsan.email="Batmail.com";
             superInsan.kimlikNo="99999999";
             superInsan.profilResmi="bb.jpg";
             superInsan.telefon="121212";
             System.out.println(superInsan.toString());

        }











     public static void Asi(){ // bir aþý methodu oluþturalým. Onuda switch-case e ekleyelim.
         Saglik saglikMerkezi = new Saglik();

         Insan insan1 = new NormalInsan(true);
         Insan insan2 = new NormalInsan(false);
         Insan insan3 = new Doktor(true);
         Insan insan4 = new SuperInsan();


         saglikMerkezi.asilamaYap(insan1);
         saglikMerkezi.asilamaYap(insan2);
         saglikMerkezi.asilamaYap(insan3);
         saglikMerkezi.asilamaYap(insan4);

         // Aþýlanan insanlarý rapor et
         saglikMerkezi.raporEt();


     }
     public static void Asi2(){
        Saglik saglikMerkezi2= new Saglik();
        saglikMerkezi2.raporEt2();



        System.out.println(Saglik.asilananInsanSayisi);



     }
}
