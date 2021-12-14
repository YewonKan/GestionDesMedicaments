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
public class Dosage {
    
    private int DoseCode;
    private String DoseQuantite;
    private String DoseUnite;
    
  

    public Dosage(int unCode,String unQuantite,String unUnite){
        
        DoseCode = unCode;
        DoseQuantite = unQuantite;
        DoseUnite = unUnite;
       
    
    } 

    /**
     * @return the DoseCode
     */
    public int getDoseCode() {
        return DoseCode;
    }

    /**
     * @param DoseCode the DoseCode to set
     */
    public void setDoseCode(int DoseCode) {
        this.DoseCode = DoseCode;
    }

    /**
     * @return the DoseQuantite
     */
    public String getDoseQuantite() {
        return DoseQuantite;
    }

    /**
     * @param DoseQuantite the DoseQuantite to set
     */
    public void setDoseQuantite(String DoseQuantite) {
        this.DoseQuantite = DoseQuantite;
    }

    /**
     * @return the DoseUnite
     */
    public String getDoseUnite() {
        return DoseUnite;
    }

    /**
     * @param DoseUnite the DoseUnite to set
     */
    public void setDoseUnite(String DoseUnite) {
        this.DoseUnite = DoseUnite;
    }
}