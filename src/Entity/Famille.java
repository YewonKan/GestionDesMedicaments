/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ruth9
 */
public class Famille {
    
    private int FamCode;
    private String FamLibelle;
    
   //constructeur famille 
    public Famille(int unCode, String unLibelle){
        
        FamCode = unCode;
        FamLibelle = unLibelle;
     
    } 

    /**
     * @return the FamCode
     */
    public int getFamCode() {
        return FamCode;
    }

    /**
     * @param FamCode the FamCode to set
     */
    public void setFamCode(int FamCode) {
        this.FamCode = FamCode;
    }

    /**
     * @return the FamLibelle
     */
    public String getFamLibelle() {
        return FamLibelle;
    }

    /**
     * @param FamLibelle the FamLibelle to set
     */
    public void setFamLibelle(String FamLibelle) {
        this.FamLibelle = FamLibelle;
    }
}