/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


public class TypeIndividu {

    private int TIcode;
    private String TIlibelle;
    
  
    public TypeIndividu(int unCode,String unLibelle){
        TIcode = unCode;
        TIlibelle= unLibelle;
       
    }

    /**
     * @return the TIcode
     */
    public int getTIcode() {
        return TIcode;
    }

    /**
     * @param TIcode the TIcode to set
     */
    public void setTIcode(int TIcode) {
        this.TIcode = TIcode;
    }

    /**
     * @return the TIlibelle
     */
    public String getTIlibelle() {
        return TIlibelle;
    }

    /**
     * @param TIlibelle the TIlibelle to set
     */
    public void setTIlibelle(String TIlibelle) {
        this.TIlibelle = TIlibelle;
    }
}
