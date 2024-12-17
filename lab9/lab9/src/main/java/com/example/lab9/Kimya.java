package com.example.lab9;

public class Kimya  extends ders{
    public Kimya(String dersAdi, int dersSinif) {
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
        System.out.println("Kimya Sözlü Sunumu");
    }

    @Override
    public void yaziliSunum() {
        System.out.println("Kimya Yazılı Sunumu");
    }
    
}
