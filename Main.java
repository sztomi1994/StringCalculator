/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toooooomi
 */
public class Main {

    private static String szamok = "5,23,64,23,-65";
    private static int eredmeny;
    private static String elvalaszto;
    private static String alapElvalaszto = ",";

    public static void main(String... ergs) {
        start();

    }

    private static void start() {
        System.out.println("A feldolgozandó string: "+szamok);
        StringCalculator kalkulator = new StringCalculator();
        System.out.println("Adja meg az elvalasztó karaktert! Alapértelmezett elválasztó:,");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            elvalaszto = reader.readLine();
            if (elvalaszto.isEmpty()) {
                kalkulator.setElvalaszto(alapElvalaszto);
            } else {
                kalkulator.setElvalaszto(elvalaszto);
            }

        } 
        catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        eredmeny = kalkulator.add(szamok);
        System.out.println("\nAz eredmény:" + eredmeny);

    }
}
