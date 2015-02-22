/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucc;

import java.util.ArrayList;
import java.util.List;

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

       
        int osszeg = 0;
        int szam;
        List<Integer> negatives = new ArrayList<>();
        
        try {
            for (String szamok1 : szamok) {
                szam = Integer.parseInt(szamok1);
                //ha negatív a szám akkor belerakja a listába
                if (szam < 0) {
                    negatives.add(szam);
                }
                osszeg += szam;

            }
            if (!negatives.isEmpty()) {
                //ha a lista nem üres akkor kiirja a tartalmát és a visszatérési érték 0
                System.out.print("Negatív szám nem engedélyezett: ");
                for (Integer negative : negatives) {
                    System.out.print(negative);
                }
                return 0;
            }
            return osszeg;
        } catch (Exception e) {
            System.out.println("Hiba a string szétválasztásakor");
            return 0;
        }

    }

    public String getElvalaszto() {
        return elvalaszto;
    }

    public void setElvalaszto(String elvalaszto) {
        this.elvalaszto = elvalaszto;
    }
}
