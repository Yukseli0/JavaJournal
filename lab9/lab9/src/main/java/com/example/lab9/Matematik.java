package com.example.lab9;

public class Matematik extends ders{
    public Matematik(String dersAdi, int dersSinif) {
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
        System.out.println("Matematik dersi sozlu sunumu yapildi.");
    }

    @Override
    public void yaziliSunum() {
        System.out.println("Matematik dersi yazili sunumu yapildi.");
    }
}
