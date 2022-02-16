/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.HashMap;

public interface IMetier {
    public ArrayList<Medicament> getAllMedicament();
    public ArrayList<TypeIndividu> getAllIndividu();
    public ArrayList<Interagis> getAllInteragis();
    public ArrayList<Famille> getAllFamille();
    public int getNumFamille(String nomFam);
    public String getNomFamille(int indexFam);
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
    public ArrayList<MedicamentFamNom> getMedicamentSearch(String rn);
    public ArrayList<TypeIndividu> getTypeIndividuSearch(String rn);
    public users VerfierIdentifiants(String login, String mdp);
    public String getNomMedicament(int index);
    public Medicament getMedicamentByIndex(int index);
    public TypeIndividu getTypeIndividuByIndex(int index);
    public  HashMap<String,Integer> GetDatasGraph1();
    public HashMap<String,Integer> GetDatasGraph2();
    public HashMap<String,Integer> GetDatasGraph3();
    public HashMap<String,Integer> GetDatasGraph4();
}
