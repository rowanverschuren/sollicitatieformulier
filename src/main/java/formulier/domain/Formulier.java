/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rowan
 */

//Sets the private attributs (made the mistake to make them dutch)
public class Formulier {
    
    private String ID;
    private String Naam;
    private String Soort;
    private Date Datum;
    private String Reactie;
    private String Commentaar;
    
    
    //Gets the Attributes.
    
    public String getID() {
        return ID;
    }
   
    public String getNaam() {
        return Naam;
    }
public String getSoort() {
        return Soort;
}
    public Date getDatum() {
        return Datum;
    }
    public String getReactie() {
        return Reactie;
   
   }
        
    public String getCommentaar() {
        return Commentaar;
    }
    
    //Sets the Attributes.
    
    public void setID ( String ID) {
        this.ID = ID; 
    }
    public void setNaam ( String Naam) {
        this.Naam = Naam; 
    }
     public void setSoort( String Soort) {
        this.Soort = Soort; 
    }
    
     public void setDatum ( Date Datum) {
         this.Datum = Datum;
     }
        
     public void setReactie ( String Reactie) {
        this.Reactie = Reactie; 
    }
    
     public void setCommentaar ( String Commentaar) {
        this.Commentaar = Commentaar; 
    }
}
  