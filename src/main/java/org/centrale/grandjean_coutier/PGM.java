/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.grandjean_coutier;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    //AUTRES MÉTHODES
    
    /**
     * Méthode créant une image PGM dans un chemin d'accès donné
     * @param sourcePath chemin d'accès où l'image doit être créée
     * @param filename nom de l'image
     */
    public void ecriture(String sourcePath, String filename){
            
        BufferedWriter bufferedWriter=null;

        try{
            //Creation du BufferedWriter
            bufferedWriter = new BufferedWriter(new FileWriter(sourcePath + "\\" + filename +".pgm"));
            //Ecriture du fichier : en-tête
            bufferedWriter.write("P2\n");
            bufferedWriter.write("#\n");
            bufferedWriter.write(this.taille_x + " " + this.taille_y + "\n");
            bufferedWriter.write("255\n");
            
        }catch (FileNotFoundException ex){
            System.out.println("Le fichier image n'a pas pu être créé");
        }catch(IOException ex){
            System.out.println("L'écriture du fichier image a échoué");
        }
        finally{
            try{
                if(bufferedWriter!=null){
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            }catch(IOException ex){
                System.out.println("Erreur");
            }
        }
    }
    
    
}
