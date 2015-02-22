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


public class Main {
    
     private static String szamok="5,5,5";
     private static int eredmeny;
    
   
    public static void main(String... ergs){
    start();
    
    }

    private static void start() {
      
        
       StringCalculator kalkulator= new StringCalculator();
        
       
        
        eredmeny=kalkulator.add(szamok);
        System.out.println("Az eredmény:"+eredmeny);
         
    }
}
