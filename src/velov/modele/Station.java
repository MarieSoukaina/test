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
public class Station {
    private String numeroIdentification;
    private String nomStation;
    private String localisationStation;
    private final Integer numeroArrondissementVille;
    
    public Station(String num, String nom, String localisation,Integer numeroArrond){
        numeroIdentification = String.valueOf(num);
        nomStation=nom;
        localisationStation=localisation;
        numeroArrondissementVille=numeroArrond;
    }
    
    
    
    public String getNumero(){
        return numeroIdentification;
    }    
    public String getNom(){
        return nomStation;
    }    
    public String getLocalisation(){
        return localisationStation;
    }
    
    public void abonnerCourteDurée(){
        
    }
    
    public void emprunterVelo(){
        
    }
    
    public void restituerVelo(){
        
    }

    public Object getNumeroArrondissementVille() {
        return numeroArrondissementVille;
    }
}
