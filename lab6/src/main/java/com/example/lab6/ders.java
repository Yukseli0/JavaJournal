package com.example.lab6;

public class ders {
    String ad;
    int sinif;
    String hoca;
    static int dersSayisi;
    
    public ders(){
        dersSayisi++;
    }
    public ders(String ad){
        this.ad=ad;
        dersSayisi++;
    }
    public ders(String ad,String hoca,int sinif ){
        this.ad=ad;
        this.sinif=sinif;
        this.hoca=hoca;
        dersSayisi++;
    }
    public static void dersSayisiYaz(){
        System.out.println("ders Sayisi: "+ dersSayisi);
    }
    public void DersBilgisiYaz(){
        System.out.println("dersin adi "+ad);
        System.out.println("dersin hocasi "+hoca);
        System.out.println("dersin sinif duzeyi "+sinif);
        System.out.println();
    }
}
