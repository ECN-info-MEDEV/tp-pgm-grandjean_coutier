/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.grandjean_coutier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
    
    
    /**
     * Méthode permettant de lire un fichier pour initialiser les valeurs de l'objet PGM
     * en fonction de celui-ci
     * @param pathname : adresse du fichier image PGM
     * @throws FileNotFoundException 
     */
    public void lecture(String pathname) throws FileNotFoundException{
        File doc = new File(pathname);
        Scanner obj = new Scanner(doc);
        int numLigne = 0;
        String[] listeNombreString;

        while (obj.hasNextLine()){
            numLigne += 1;
            
            //ligne des valeurs de nuances de gris
            if (numLigne > 4){
                listeNombreString = obj.nextLine().split(" ");
                for (String s: listeNombreString){
                    if (!s.equals("")){
                        image.add(Integer.parseInt(s));
                    }
                }
            }
            
            // ligne de la taille de l'image
            else if (numLigne == 3){
                listeNombreString = obj.nextLine().split(" ");
                int coordonnee = 0;
                for (String s: listeNombreString){
                    if (!s.equals("")){
                        if (coordonnee  == 0){
                            taille_x = Integer.parseInt(s);
                        }
                        else{
                            taille_y = Integer.parseInt(s);
                        }
                        coordonnee = 1; 
                    }
                }
                
            }
            
            // ligne d'informations non prise en compte pour notre lecture
            else {
                obj.nextLine();
            }
            
        }
    }
    
    /**
     * Fonction permettant de créer et enregistrer l'histogramme de l'objet PGM
     * @param pathnamehist : chemin du dossier où on veut enregistrer l'histogramme
     * @param nomFichier : nom fichier qui contiendra l'histogramme
     */
    public void histogramme(String pathnamehist, String nomFichier){
        
        ArrayList<Integer> listeValeurs = new ArrayList();
        int valueMax = 0;
        for (int val : this.image){
            if (val > valueMax){
                valueMax = val;
            }
        }
        
        PGM histogramme = new PGM();
        histogramme.setTaille_x(256);
        histogramme.setTaille_y(valueMax);
        
        //initialise listeValeurs avec des zéros partout
        for (int i=0; i<256; i++){
           listeValeurs.add(0);
        }
        
        // complète listeValeurs en fonction du nb de valeurs par couleur
        for (int val : this.image) {
            listeValeurs.set(val, listeValeurs.get(val) + 1);
        }

        
        
        
    }
    
}
