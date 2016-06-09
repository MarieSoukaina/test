/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velov.modele;

/**
 *
 * @author Jean-Mouloud
 */
public class ArrondissementVille {
    private int numeroArrondissement;
    private String nomArrondissementVille;
    
    public ArrondissementVille(int num, String nom){
        numeroArrondissement =num;
        nomArrondissementVille=nom;
    }
    
    public int getNumeroArrondissement(){
        return numeroArrondissement;
    }
    
    public String getNomArrondissementVille(){
        return nomArrondissementVille;
    }
    
    public void setNumeroArrondissement(int num){
        numeroArrondissement=num;        
    }
    public void setNomArrondissement(String nom){
        nomArrondissementVille=nom;
    }
}
