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
public class Interagis {
    
    private int MedPerturbateur;
    private int MedMedPerturbe;
   
  

    public Interagis(int unPerturbateur,int unPerturbe){
        
        MedPerturbateur = unPerturbateur;
        MedMedPerturbe = unPerturbe;
       
    } 

    /**
     * @return the MedPerturbateur
     */
    public int getMedPerturbateur() {
        return MedPerturbateur;
    }

    /**
     * @param MedPerturbateur the MedPerturbateur to set
     */
    public void setMedPerturbateur(int MedPerturbateur) {
        this.MedPerturbateur = MedPerturbateur;
    }

    /**
     * @return the MedMedPerturbe
     */
    public int getMedMedPerturbe() {
        return MedMedPerturbe;
    }

    /**
     * @param MedMedPerturbe the MedMedPerturbe to set
     */
    public void setMedMedPerturbe(int MedMedPerturbe) {
        this.MedMedPerturbe = MedMedPerturbe;
    }
}