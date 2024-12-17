package com.example.lab9;

public abstract class ders implements DersIsle{
    public String dersAdi;
    public int dersSinif;

    public ders(String dersAdi, int dersSinif) {
        this.dersAdi = dersAdi;
        this.dersSinif = dersSinif;
    }

    public void İsmiBuyut() {
        dersAdi = dersAdi.toUpperCase();
    }

    public abstract String isimGetir();
    public abstract int sinifGetir();
}

