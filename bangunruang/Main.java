/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author ZUNAIRA
 */
public class Main {
     public static void main(String[] args) {

        Bangunruang bangunruang = new Bangunruang();

        Bola bola = new Bola();
        bola.r = 4;
        bola.volume();

        Kubus kubus = new Kubus();
        kubus.s = 6;
        kubus.volume();

        Tabung tabung = new Tabung();
        tabung.r = 21;
        tabung.t = 34;
        tabung.volume();

        LimasSegitiga limassegitiga = new LimasSegitiga();
        limassegitiga.la = 13;
        limassegitiga.tl = 9;
        limassegitiga.volume();

    }
}
    

