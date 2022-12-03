/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.centrale.grandjean_coutier;


import java.io.FileNotFoundException;


/**
 *
 * @author Manon Coutier
 */
public class GRANDJEAN_COUTIER {

    public static void main(String[] args) throws FileNotFoundException {
            
        PGM objet = new PGM();
        objet.lecture("C:\\Users\\Laure\\OneDrive\\Documents\\EI2\\MEDEV\\tp-pgm-grandjean_coutier\\src\\main\\resources\\simple.pgm");
        objet.ecriture("C:\\Users\\Laure\\OneDrive\\Bureau", "filename");
        objet.histogramme("C:\\Users\\Laure\\OneDrive\\Bureau", "histo");
    }   
}
