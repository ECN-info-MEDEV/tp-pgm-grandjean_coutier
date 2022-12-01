/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.grandjean_coutier;

/**
 *
 * @author Manon Coutier
 */
public class TestManon {
    public static void main(String[] args) {
        PGM pgm = new PGM();
        pgm.setTaille_x(90);
        pgm.setTaille_y(2);
        int i;
        for (i=0; i<=180; i++){
            pgm.getImage().add(i);
        }
        pgm.ecriture("D:\\Documents\\Centrale\\EI2\\P2\\MEDEV\\TP3\\GRANDJEAN_COUTIER\\GRANDJEAN_COUTIER\\src\\main\\resources", "test");
    }

}
