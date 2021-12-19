/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public class Medicament {
    private int idMedicament;
    private String nomMedicament;
    private int cdFamMedicament;
    private String composition;
    private String effet;
    private String contreIndic;
    private float Prix;
    
    
    public Medicament(int unId, String unNom, int unCode, String unComposition, String unEffet, String unContreIndic, float unPrix){
        idMedicament = unId;
        nomMedicament = unNom;
        cdFamMedicament = unCode;
        composition = unComposition;
        effet = unEffet;
        contreIndic = unContreIndic;
        Prix = unPrix;
    }
    /**
     * @return the idMedicament
     */
    public int getIdMedicament() {
        return idMedicament;
    }

    /**
     * @param idMedicament the idMedicament to set
     */
    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    /**
     * @return the nomMedicament
     */
    public String getNomMedicament() {
        return nomMedicament;
    }

    /**
     * @param nomMedicament the nomMedicament to set
     */
    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    /**
     * @return the cdFamMedicament
     */
    public int getCdFamMedicament() {
        return cdFamMedicament;
    }
    
    /**
     * @param cdFamMedicament the cdFamMedicament to set
     */
    public void setCdFamMedicament(int cdFamMedicament) {
        this.cdFamMedicament = cdFamMedicament;
    }
    
    

    /**
     * @return the composition
     */
    public String getComposition() {
        return composition;
    }

    
    public String getEffet() {
        return effet;
    }

    /**
     * @return the contreIndic
     */
    public String getContreIndic() {
        return contreIndic;
    }

    /**
     * @param contreIndic the contreIndic to set
     */
    public void setContreIndic(String contreIndic) {
        this.contreIndic = contreIndic;
    }

    /**
     * @return the Prix
     */
    public float getPrix() {
        return Prix;
    }

    /**
     * @param Prix the Prix to set
     */
    public void setPrix(Float Prix) {
        this.Prix = Prix;
    }
    
            
}
