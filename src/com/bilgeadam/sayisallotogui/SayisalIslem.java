package com.bilgeadam.sayisallotogui;


import java.util.Arrays;
import java.util.Random;

public class SayisalIslem {

    public static final int MAX_SAYI=49;
    public static final int KAC_SAYI=6;


    public int rastgeleSatiGetir()
    {
        Random rnd = new Random();
        int sayi = rnd.nextInt(MAX_SAYI)+1;
        return sayi;
    }

    public boolean arraydeVarmi(int[] sayilar, int sayi)
    {
        // Aramak icin binarySearch kullanilir,
        // onun sartida once sort edilmis olmasi.
        Arrays.sort(sayilar);
        int sonuc = Arrays.binarySearch(sayilar, sayi);

        if (sonuc >= 0)
            return true;
        else
            return false;



    }

    public int[] arrayDoldur()
    {
        int[] sayilar = new int[KAC_SAYI];

        int rastgeleSayi = 0;

        for (int i = 0; i < sayilar.length; i++) {

            rastgeleSayi = rastgeleSatiGetir();

            boolean sonuc = arraydeVarmi(sayilar,rastgeleSayi);
            while (sonuc == true)
            {
                rastgeleSayi = rastgeleSatiGetir();
                sonuc = arraydeVarmi(sayilar,rastgeleSayi);
            }

            sayilar[0] = rastgeleSayi;
        }
       // son yazdigimiz sayiyi 6 sirayi siralamak icin koyduk
        Arrays.sort(sayilar);

        return sayilar;

    }

}
