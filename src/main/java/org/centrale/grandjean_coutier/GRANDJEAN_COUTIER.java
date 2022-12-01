/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.centrale.grandjean_coutier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Manon Coutier
 */
public class GRANDJEAN_COUTIER {

    public static void main(String[] args) throws FileNotFoundException {
            
        PGM objet = new PGM();
        objet.Lecture("C:\\Users\\Laure\\OneDrive\\Documents\\EI2\\MEDEV\\tp-pgm-grandjean_coutier\\src\\main\\resources\\baboon.pgm");
        System.out.println(objet.getTaille_x());
        System.out.println(objet.getTaille_y());
        System.out.println (objet.getImage());
    }   
}
