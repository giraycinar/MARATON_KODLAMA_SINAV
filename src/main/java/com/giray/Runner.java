package com.giray;


import com.giray.entity.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        /**
         * Bir felaket senaryosunda insanlar hastalanmakta ve bir birbirlerine hastal�k bula�t�rmaktad�rlar.
         * Bizim uygulamam�zda; tedavi ve a��lama yap�lacak insanlar belirlenir ve a��lamalar� yap�larak kay�t alt�na al�n�rlar.
         * Sizden beklenenler, insanlar gruplara ayr�lacakt�r;
         * Normal insan; hastal��� ta��yabilir, hasta olabilir
         * Doktor, hastal��a kar�� a��l�d�r ancak hastal��� bula�t�rabilir.
         * Super insan, hastalanmaz ya da hastal��� bula�t�rmaz.
         * Sorular;
         * 1- bu insan tiplerini kal�t�m� i�erecek �ekilde tan�mlay�n�z.   +
         * 2- Bir sa�l�k s�n�f� tan�mlayarak i�ine "asilamaYap" methodu ekleyiniz. Bu method i�ine insan nesneleri alabilsin.
         * Sadece Hastal�k bula�abilecek Normal  Insanlar� a��las�n ve a��lad��� insanlar� bir listeye eklesin.
         * (Polimorphism ile kullanan +10 puan al�r)
         * 3- a��lanan insanlar� listesini g�rebilece�imiz bir rapor ekran� olsun. (consol a ��kt� verecek �ekilde ayarlayal�m.)
         *
         * 1- Insan --> insan array
         * 2- Sa�l�kl�-Hasta-Ta��y�c�
         * 3- Sa�l�k S�n�f� --> asilamaYap mothodu ekle --> insan nesnelerini als�n
         * 4- Sadece Hastal�k bula�abilecek Normal  Insanlar� a��las�n. --> a��lanan array
         *
         */


        int secimYap;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("************************************************");
            System.out.println("****************    DOOMSDAY    ****************");
            System.out.println("************************************************");
            System.out.println();
            System.out.println("1- NormalInsan Bilgilerini G�ster...");
            System.out.println("2- Doktor Bilgilerini G�ster...");
            System.out.println("3- SuperInsan Bilgilerini G�ster...");
            System.out.println("4- A��lanan Insan Bilgilerini G�ster...");
            System.out.println("5- A��lanan Insan Say�s�n� G�ster...");
            System.out.println("0- ****    �IKIS    ****");
            System.out.println("Bir Se�im Yap�n�z...(1-2-3-4-5-0)...: ");
            Insan insan = new Insan();

            secimYap = scanner.nextInt();
            switch (secimYap) { //methodlarla switch-case i�erisine att�k. Bu �ekilde daha d�zenli oldu.
                case 1: NI();  break;
                case 2: D();   break;
                case 3: SI();  break;
                case 4: Asi(); break;
                case 5: Asi2();break;
                case 0: System.out.println("DOOMSDAY Program�ndan ��k�ld�...");break;
                default: System.out.println("��lem Tan�ml� De�il")            ;break;
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











     public static void Asi(){ // bir a�� methodu olu�tural�m. Onuda switch-case e ekleyelim.
         Saglik saglikMerkezi = new Saglik();

         Insan insan1 = new NormalInsan(true);
         Insan insan2 = new NormalInsan(false);
         Insan insan3 = new Doktor(true);
         Insan insan4 = new SuperInsan();


         saglikMerkezi.asilamaYap(insan1);
         saglikMerkezi.asilamaYap(insan2);
         saglikMerkezi.asilamaYap(insan3);
         saglikMerkezi.asilamaYap(insan4);

         // A��lanan insanlar� rapor et
         saglikMerkezi.raporEt();


     }
     public static void Asi2(){
        Saglik saglikMerkezi2= new Saglik();
        saglikMerkezi2.raporEt2();



        System.out.println(Saglik.asilananInsanSayisi);



     }
}
