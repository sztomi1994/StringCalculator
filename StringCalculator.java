/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucc;

/**
 *
 * @author Toooooomi
 */
public class StringCalculator {

    private String elvalaszto = ",";

    public int add(String numbers) {

        if (numbers == null) {

            System.out.println("Nem adott meg egy értéket sem");
            return 0;
        }

        String[] szamok;
        szamok = numbers.split(elvalaszto);

        if (szamok.length > 3) {
            System.out.println("Túl sok számot adott meg");
        }

        int osszeg = 0;
        int szam;

        try {
            for (String szamok1 : szamok) {
                osszeg += Integer.parseInt(szamok1);
            }
        } catch (Exception e) {
            System.out.println("Rossz érték(nem számot adott meg)");
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
