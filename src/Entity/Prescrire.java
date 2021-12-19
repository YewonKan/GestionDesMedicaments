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
public class Prescrire {
    private int idMedicament;
    private int TICode;
    private int DoseCode;
    private String PrePosologie;
    
  

    public Prescrire(int unidMedicament,int unTIcode,int unDoseCode,String unPosologie){
        
        idMedicament = unidMedicament;
        TICode = unTIcode;
        DoseCode = unDoseCode;
        PrePosologie = unPosologie;
    
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
     * @return the TICode
     */
    public int getTICode() {
        return TICode;
    }

    /**
     * @param TICode the TICode to set
     */
    public void setTICode(int TICode) {
        this.TICode = TICode;
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
     * @return the PrePosologie
     */
    public String getPrePosologie() {
        return PrePosologie;
    }

    /**
     * @param PrePosologie the PrePosologie to set
     */
    public void setPrePosologie(String PrePosologie) {
        this.PrePosologie = PrePosologie;
    }
}