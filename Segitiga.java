/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfisme;

/**
 *
 * @author Tedii
 */   
    public class Segitiga extends Polimorfisme{

    int alas;
    int tinggi;

    public Segitiga (int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas(){
        return this.alas * this.tinggi;
}
    }