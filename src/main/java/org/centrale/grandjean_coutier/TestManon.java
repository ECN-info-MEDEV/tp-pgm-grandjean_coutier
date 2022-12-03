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
            PGM pgm = new PGM();          
            pgm.lecture("D:\\Documents\\Centrale\\EI2\\P2\\MEDEV\\TP3\\GRANDJEAN_COUTIER\\GRANDJEAN_COUTIER\\src\\main\\resources\\baboon.pgm");
            pgm.seuillage(127);
            pgm.ecriture("D:\\Documents\\Centrale\\EI2\\P2\\MEDEV\\TP3\\GRANDJEAN_COUTIER\\GRANDJEAN_COUTIER\\src\\main\\resources", "baboon127");
        }catch(FileNotFoundException ex){
            System.out.println("error");
        }
        
    }

}
