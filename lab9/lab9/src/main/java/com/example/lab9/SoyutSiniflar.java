package com.example.lab9;


public class SoyutSiniflar {
    public static void main(String[] args) {

        ders matematik= new Matematik("mat", 1);
        ders kimya= new Kimya("kimya", 2);
        ders fizik= new Fizik("fizik", 5);
        
        System.out.println();
        matematik.SozluSunum();
        matematik.yaziliSunum();
        System.out.println(matematik.isimGetir() +" "+ matematik.sinifGetir());

        kimya.SozluSunum();
        kimya.yaziliSunum();
        System.out.println(kimya.isimGetir() +" "+ kimya.sinifGetir());

        fizik.SozluSunum();
        fizik.yaziliSunum();
        System.out.println(fizik.isimGetir() + " "+fizik.sinifGetir());


    }
}