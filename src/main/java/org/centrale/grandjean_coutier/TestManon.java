/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.grandjean_coutier;

import java.io.FileNotFoundException;

/**
 *
 * @author Manon Coutier
 */
public class TestManon {
    public static void main(String[] args) {
        try{
            PGM pgm1 = new PGM();          
            pgm1.lecture("D:\\Documents\\Centrale\\EI2\\P2\\MEDEV\\TP3\\GRANDJEAN_COUTIER\\GRANDJEAN_COUTIER\\src\\main\\resources\\baboon.pgm");
            PGM pgm2 = new PGM();  
            pgm2.lecture("D:\\Documents\\Centrale\\EI2\\P2\\MEDEV\\TP3\\GRANDJEAN_COUTIER\\GRANDJEAN_COUTIER\\src\\main\\resources\\coins.pgm");
            PGM diff = new PGM();
            diff = pgm1.difference(pgm2);
            diff.ecriture("D:\\Documents\\Centrale\\EI2\\P2\\MEDEV\\TP3\\GRANDJEAN_COUTIER\\GRANDJEAN_COUTIER\\src\\main\\resources", "baboonDiff");
        }catch(FileNotFoundException ex){
            System.out.println("error");
        }
        
    }

}
