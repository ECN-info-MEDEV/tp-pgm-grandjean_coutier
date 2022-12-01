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
    
    //AUTRES MÉTHODES
    
    /**
     * Méthode créant une image PGM dans un chemin d'accès donné
     * @param sourcePath chemin d'accès où l'image doit être créée
     * @param filename nom de l'image
     */
    public void ecriture(String sourcePath, String filename){
            
        BufferedWriter bufferedWriter=null;
        int i;
        int j;
        int nbChar; //nombre de caractère dans la ligne de texte (test des 70 lignes)
        int firstLine=0; //indice dans image du premier élément de la ligne d'image traitée

        try{
            //Creation du BufferedWriter
            bufferedWriter = new BufferedWriter(new FileWriter(sourcePath + "\\" + filename +".pgm"));
            //Ecriture de l'image : en-tête
            bufferedWriter.write("P2\n");
            bufferedWriter.write("#\n");
            bufferedWriter.write(this.taille_x + " " + this.taille_y + "\n");
            bufferedWriter.write("255\n");
            
            //Ecriture de l'image 
            //pour chaque ligne de l'image
            for (i=0;i<taille_y;i++){
                //initialisation de la ligne
                bufferedWriter.write(" ");
                nbChar = 1;
                //pour chaque caractère de la ligne de l'image
                for (j=firstLine;j<firstLine+taille_x;j++){
                    //compte du nombre de caratère sur la ligne de texte avec ajout d'une nouvelle valeur
                    nbChar += String.valueOf(image.get(j)).length()+1;
                    //test pour le maximum de 70 caractère sur une ligne de texte
                    if (nbChar<=70){
                       //ajout possible
                       bufferedWriter.write(image.get(j)+" ");
                    }else{
                       //ajout impossible, commencement d'une nouvelle ligne de texte
                       bufferedWriter.newLine();
                       //mise à jour du nombre de caractères dans la nouvelle ligne de texte
                       nbChar=String.valueOf(image.get(j)).length()+2;
                       //ajout du pixel
                       bufferedWriter.write(" "+image.get(j)+" ");
                    }
                }
                //initialisation de la prochaine ligne d'image
                bufferedWriter.newLine();
                firstLine=i + taille_x;
            }
            
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
                    if (!s.equals("")){
                        image.add(Integer.parseInt(s));
                    }
                }
            }
            
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
            else {
                obj.nextLine();
            }
            
        }
    }
    
}
