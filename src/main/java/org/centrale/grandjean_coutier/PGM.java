/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.grandjean_coutier;

import java.util.ArrayList;

/**
 * Classe assurant la gestion des classes PGM
 * @author Manon Coutier
 */
public class PGM {
    
    //ATTRIBUTS
    /**
     * Taille horizontale de l'image PGM
     */
    private int taille_x;
    /**
     * Taille verticale de l'image PGM
     */
    private int taille_y;
    /**
     * Tableau des valeurs de chaque pixel
     */
    private ArrayList<Integer> image;
    
    //CONSTRUCTEUR
    /**
     * Constructeur par défaut
     */
    public PGM(){
        this.taille_x = 0;
        this.taille_y = 0;
        this.image = new ArrayList<>();
    }
    
    //GETTERS ET SETTERS
    /**
     * Getter taille_x
     * @return taille_x
     */
    public int getTaille_x() {
        return taille_x;
    }
    
    /**
     * Setter taille_x
     * @param taille_x nouvelle valeur de taille_x
     */
    public void setTaille_x(int taille_x) {
        this.taille_x = taille_x;
    }
    
    /**
     * Getter taille_y
     * @return taille_y
     */
    public int getTaille_y() {
        return taille_y;
    }
    
    /**
     * Setter taille_y
     * @param taille_y nouvelle valeur de taille_y
     */
    public void setTaille_y(int taille_y) {
        this.taille_y = taille_y;
    }
    
    /**
     * Getter image
     * @return image
     */
    public ArrayList<Integer> getImage() {
        return image;
    }
    
    /**
     * Setter image
     * @param image nouvelle valeur de image
     */
    public void setImage(ArrayList<Integer> image) {
        this.image = image;
    }
    
    
}
