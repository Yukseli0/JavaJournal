package com.example.lab9;

public class Fizik extends ders{
    public Fizik(String dersAdi, int dersSinif) {
        super(dersAdi, dersSinif);
    }

    @Override
    public String isimGetir() {
        return dersAdi;
    }

    @Override
    public int sinifGetir() {
        return dersSinif;
    }

    @Override
    public void SozluSunum() {
        System.out.println("Fizik dersi sözlü sunumu yapıldı.");
    }

    @Override
    public void yaziliSunum() {
        System.out.println("Fizik dersi yazılı sunumu yapıldı.");
    }

}
