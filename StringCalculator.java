/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucc;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Toooooomi
 */
public class StringCalculator {

    private String elvalaszto;

    public int add(String numbers) {

        if (numbers == null) {

            System.out.println("Üres String");
            return 0;
        }

        String[] szamok;
        szamok = numbers.split(elvalaszto);

//        if (szamok.length > 2) {
//            System.out.println("Túl sok számot adott meg");           
//        }

        int osszeg = 0;
        
        try {
            for (String szamok1 : szamok) {
                osszeg += Integer.parseInt(szamok1);
            }
        } catch (Exception e) {
            System.out.println("Hiba a string szétválasztásakor");
            return 0;
        }

        return osszeg;
    }

    public String getElvalaszto() {
        return elvalaszto;
    }

    public void setElvalaszto(String elvalaszto) {
        this.elvalaszto = elvalaszto;
    }
}
