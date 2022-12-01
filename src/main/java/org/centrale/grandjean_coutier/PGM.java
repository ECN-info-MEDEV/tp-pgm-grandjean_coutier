/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.grandjean_coutier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    private ArrayList<ArrayList<Integer>> image;
    
    /**
     * Méthode permettant de lire un fichier pour initialiser les valeurs de l'objet PGM
     * en fonction de celui-ci
     * @param pathname : adresse du fichier image PGM
     * @throws FileNotFoundException 
     */
    public void Lecture(String pathname) throws FileNotFoundException{
        File doc = new File(pathname);
        Scanner obj = new Scanner(doc);
        int numLigne = 0;
        String[] listeNombreString;

        while (obj.hasNextLine()){
            numLigne += 1;
            if (numLigne > 4){
                listeNombreString = obj.nextLine().split(" ");
                for (String s: listeNombreString){
                image.add(Integer.parseInt(s));
                }
            }
            else if (numLigne == 3){
                
            }
            
        }
    }
    
}
