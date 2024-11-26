package com.example.lab6;

import java.util.ArrayList;
public class ogrenci {
    String ad;
    int sinif;
    int dersSayisi;
    ArrayList<ders> derslistesi;
    static int ogrenciSayisi=0;
    public ogrenci(){
        dersSayisi=0;
        ogrenciSayisi++;
        ogrenciBilgisiYaz();
    }
    public ogrenci(String ad, ArrayList<ders> derslistesi){
        this.ad=ad;
        this.derslistesi=derslistesi;
        dersSayisi=derslistesi.size();
        ogrenciSayisi++;
        ogrenciBilgisiYaz();
    }
    public ogrenci(String ad,ArrayList<ders> derslistesi , int sinif){
        ogrenciSayisi++;
        this.ad=ad;
        this.sinif=sinif;
        this.derslistesi=derslistesi;
        dersSayisi=derslistesi.size();
        ogrenciBilgisiYaz();
    }
    private void ogrenciBilgisiYaz(){
        System.out.println("Ogrencinin adi "+ad);
        System.out.println("ogrencinin sinifi "+sinif);
        System.out.println("ogrencinin aldigi ders sayisi"+ dersSayisi);
        System.out.println("ogrenci sayisi: "+ ogrenciSayisi);
        
        System.out.println();
    }
    public void ogrenciDersBilgisiYaz(){
        if(derslistesi!=null)
        for(int i=0; i<derslistesi.size(); i++){//foreach de kullanılabilir
            System.out.println((i+1)+". ders"); 
            
            ders CurrentDers=derslistesi.get(i);
            CurrentDers.DersBilgisiYaz();
            
            
        }
    }
}
