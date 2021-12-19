/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public class MedicamentFamNom
{
     private int idMedicament;
    private String nomMedicament;
    private String nomFamMedicament;
    private String composition;
    private String effet;
    private String contreIndic;
    private float Prix;
    
    
    public MedicamentFamNom(int unId, String unNom, String unCode, String unComposition, String unEffet, String unContreIndic, float unPrix){
        idMedicament = unId;
        nomMedicament = unNom;
        nomFamMedicament = unCode;
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
     * @return the nomFamMedicament
     */
    public String getNomFamMedicament() {
        return nomFamMedicament;
    }

    /**
     * @param nomFamMedicament the nomFamMedicament to set
     */
    public void setNomFamMedicament(String nomFamMedicament) {
        this.nomFamMedicament = nomFamMedicament;
    }

    /**
     * @return the composition
     */
    public String getComposition() {
        return composition;
    }

    /**
     * @param composition the composition to set
     */
    public void setComposition(String composition) {
        this.composition = composition;
    }

    /**
     * @return the effet
     */
    public String getEffet() {
        return effet;
    }

    /**
     * @param effet the effet to set
     */
    public void setEffet(String effet) {
        this.effet = effet;
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
    public void setPrix(float Prix) {
        this.Prix = Prix;
    }
}
