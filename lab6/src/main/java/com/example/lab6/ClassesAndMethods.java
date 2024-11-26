package com.example.lab6;

import java.util.ArrayList;

public class ClassesAndMethods {
    public static void main(String[] args) {

        ArrayList<ders> dersListesi1= new ArrayList<ders>();
        dersListesi1.add(new ders("Ayrik","alev",2));
        dersListesi1.add(new ders("veri","suhap",2)); 
        dersListesi1.add(new ders("NYP","ahmet",2));
       
        ArrayList<ders> dersListesi2= new ArrayList<ders>();
        dersListesi2.add(new ders("matematik","fatih",11));
        dersListesi2.add(new ders("fizik","aykut",11));
        dersListesi2.add(new ders("kimya","murat",11));
        
        ogrenci ogrenci1=new ogrenci();
        ogrenci ogrenci2=new ogrenci("yuksel",dersListesi1);
        ogrenci ogrenci3=new ogrenci("abdullah", dersListesi2, 11);

        ogrenci1.ogrenciDersBilgisiYaz();
        ogrenci2.ogrenciDersBilgisiYaz();
        ogrenci3.ogrenciDersBilgisiYaz();

        ders.dersSayisiYaz();
    }
}
