/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

public interface IMetier {
    public ArrayList<Medicament> getAllMedicament();
    public ArrayList<TypeIndividu> getAllIndividu();
    public ArrayList<Interagis> getAllInteragis();
    public int getNumFamille(String nomFam);
    public ArrayList<MedicamentFamNom> getAllMedicamentWithFamName();
    public void setMedicament(Medicament med);
    public void ModifierMedicament(Medicament med);
    public void setPrescrire(Prescrire prescrption);
    public void ModifierTypePerson (TypeIndividu type);
    public void setTypePersonne(TypeIndividu typePersonne);
    public void setInteragis(int med1,int med2);
    public int getIndexTypeIndividu();
    public int getIndexMedicament();
    public int getMatchedIndex(String medNom);
}
