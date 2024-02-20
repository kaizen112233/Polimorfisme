/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfisme;

/**
 *
 * @author Tedii
 */
public class Main {

         public static void main(String[] args){
        Polimorfisme bangunDatar = new Polimorfisme();
        Persegi Persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(6,3);
        Lingkaran Lingkaran = new Lingkaran(50);

       bangunDatar.luas();
       bangunDatar.keliling();

        System.out.println("Luas persegi : " + Persegi.luas());
        System.out.println("Keliling persegi : " + Persegi.keliling());
        System.out.println("Luas segitiga : " + segitiga.luas());
        System.out.println("Luas lingkaran : " + Lingkaran.luas());
        System.out.println("Keliling lingkaran : " + Lingkaran.keliling());
    }
}