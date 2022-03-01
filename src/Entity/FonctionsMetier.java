/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Entity.Medicament;

public class FonctionsMetier implements IMetier
{

    private ResultSet rs;
    private PreparedStatement ps;
    private Connection maCnx;

    
    @Override
    public ArrayList<Medicament> getAllMedicament() {
        ArrayList<Medicament> mesMedicaments = new ArrayList<Medicament>();
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select MED_DEPOTLEGAL, MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON from medicament");
            rs = ps.executeQuery();

            while (rs.next()) {
                Medicament m = new Medicament(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
                mesMedicaments.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesMedicaments;
    }

    @Override
    public ArrayList<TypeIndividu> getAllIndividu() {
        ArrayList<TypeIndividu> lesTypesIndividu = new ArrayList<TypeIndividu>();
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT TIN_CODE, TIN_LIBELLE FROM type_individu");
            rs = ps.executeQuery();

            while (rs.next()) {
                TypeIndividu tyIn = new TypeIndividu(rs.getInt(1), rs.getString(2));
                lesTypesIndividu.add(tyIn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesTypesIndividu;
    }

    @Override
    public ArrayList<Interagis> getAllInteragis() {
        ArrayList<Interagis> lesInteragis = new ArrayList<Interagis>();
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT MED_PERTURBATEUR, MED_MED_PERTURBE FROM interagis;");
            rs = ps.executeQuery();

            while (rs.next()) {
                Interagis Inter = new Interagis(rs.getInt(1), rs.getInt(2));
                lesInteragis.add(Inter);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesInteragis;
    }

    @Override
    public int getNumFamille(String nomFam) {
        int FamilyNum = 0;
        //if you don't find any FamilyName match with Name, return 0 so we have to block 
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select FAM_CODE from famille where FAM_LIBELLE = '" + nomFam + "';");
            rs = ps.executeQuery();

            if (rs.next()) {
                FamilyNum = (rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return FamilyNum;
    }

    @Override
    public ArrayList<MedicamentFamNom> getAllMedicamentWithFamName() {
        ArrayList<MedicamentFamNom> mesMedicaments = new ArrayList<>();
        String FamilyName = null;
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select m.MED_DEPOTLEGAL, m.MED_NOMCOMMERCIAL,f.FAM_LIBELLE, m.MED_COMPOSITION, m.MED_EFFETS, m.MED_CONTREINDIC, m.MED_PRIXECHANTILLON from medicament m LEFT JOIN famille f ON m.FAM_CODE = f.FAM_CODE");

            rs = ps.executeQuery();

            while (rs.next()) {
                MedicamentFamNom m = new MedicamentFamNom(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
                mesMedicaments.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesMedicaments;
    }

    @Override
    public void setMedicament(Medicament med) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("insert into medicament(MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON) values('" + med.getNomMedicament() + "','" + med.getCdFamMedicament() + "','" + med.getComposition() + "','" + med.getEffet() + "','" + med.getContreIndic() + "'," + med.getPrix() + ")");
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setPrescrire(Prescrire prescrption) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("insert into prescrire(MED_DEPOTLEGAL,TIN_CODE,DOS_CODE,PRE_POSOLOGIE) values(" + prescrption.getIdMedicament() + "," + prescrption.getTICode() + "," + prescrption.getDoseCode() + ",'" + prescrption.getPrePosologie() + "')");
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setTypePersonne(TypeIndividu typePersonne) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("insert into type_individu(TIN_LIBELLE) values('" + typePersonne.getTIlibelle() + "')");
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getIndexTypeIndividu() {
        int indexType = 99999;
        // if the result is 99999 that means sql is not connected
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT MAX(TIN_CODE) FROM type_individu");
            rs = ps.executeQuery();

            if (rs.next()) {
                indexType = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexType;
    }

    @Override
    public int getIndexMedicament() {
        int indexMedicine = 99999;
        // if the result is 99999 that means sql is not connected
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT MAX(MED_DEPOTLEGAL) FROM medicament");
            rs = ps.executeQuery();

            if (rs.next()) {
                indexMedicine = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexMedicine;
    }

    /* @author Yewon
     * 
     */
    @Override
    public void setInteragis(int med1, int med2) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("insert into interagis(MED_PERTURBATEUR,MED_MED_PERTURBE) values(" + med1 + "," + med2 + ")");
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getMatchedIndex(String medNom) {
        int index = 0;
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select MED_DEPOTLEGAL, MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON from medicament");
            rs = ps.executeQuery();

            while (rs.next()) {
                if (medNom.compareTo(rs.getString(2)) == 0) {
                    index = Integer.parseInt(rs.getString(1));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (index);
    }

    @Override
    public void ModifierMedicament(Medicament med) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("UPDATE medicament SET MED_NOMCOMMERCIAL= '" + med.getNomMedicament() + "', FAM_CODE = " + med.getCdFamMedicament() + ",MED_COMPOSITION='" + med.getComposition() + "',MED_EFFETS = '" + med.getEffet() + "', MED_CONTREINDIC = '" + med.getContreIndic() + "',MED_PRIXECHANTILLON = " + med.getPrix() + " WHERE MED_DEPOTLEGAL = " + med.getIdMedicament());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifierTypePerson(TypeIndividu type) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("UPDATE type_individu SET TIN_LIBELLE= '" + type.getTIlibelle() + "' WHERE TIN_CODE = " + type.getTIcode());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Famille> getAllFamille() {
        ArrayList<Famille> lesFamille = new ArrayList<Famille>();
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select FAM_CODE, FAM_LIBELLE from famille");
            rs = ps.executeQuery();

            while (rs.next()) {
                Famille f = new Famille(rs.getInt(1), rs.getString(2));
                lesFamille.add(f);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesFamille;
    }

    @Override
    public String getNomFamille(int indexFam) {
        String FamilyLabel = "";
        //if you don't find any FamilyName match with Name, return 0 so we have to block 
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select FAM_LIBELLE from famille where FAM_CODE = " + indexFam + ";");
            rs = ps.executeQuery();

            if (rs.next()) {
                FamilyLabel = (rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return FamilyLabel;
    }

    @Override
    public ArrayList<MedicamentFamNom> getMedicamentSearch(String rn) {

        ArrayList<MedicamentFamNom> mesMedicaments = new ArrayList<>();
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select m.MED_DEPOTLEGAL, m.MED_NOMCOMMERCIAL,f.FAM_LIBELLE, m.MED_COMPOSITION, m.MED_EFFETS, m.MED_CONTREINDIC, m.MED_PRIXECHANTILLON  from medicament m LEFT JOIN famille f ON m.FAM_CODE = f.FAM_CODE where MED_NOMCOMMERCIAL like '%" + rn + "%'");
            rs = ps.executeQuery();

            while (rs.next()) {
                MedicamentFamNom m = new MedicamentFamNom(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
                mesMedicaments.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesMedicaments;
    }

    @Override
    public ArrayList<TypeIndividu> getTypeIndividuSearch(String rn) {
        ArrayList<TypeIndividu> mesIndividu = new ArrayList<>();
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select TIN_CODE, TIN_LIBELLE from type_individu where TIN_LIBELLE like '%" + rn + "%'");
            rs = ps.executeQuery();

            while (rs.next()) {
                TypeIndividu m = new TypeIndividu(rs.getInt(1), rs.getString(2));
                mesIndividu.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesIndividu;
    }

    @Override
    public users VerfierIdentifiants(String login, String mdp) {

        users user = null;
        try {

            maCnx = ConnexionBdd.getCnx();

            ps = maCnx.prepareStatement("SELECT idUser, login, password from users where login = ? and password = ? ");
            ps.setString(1, login);
            ps.setString(2, mdp);
            rs = ps.executeQuery();

            if (rs.next()) {
                user = new users(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;

    }
    
    @Override
    public String getNomMedicament(int index) {
        String nom = "";
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select MED_DEPOTLEGAL, MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON from medicament");
            rs = ps.executeQuery();

            while (rs.next()) {
                if (index == rs.getInt(1)) {
                    nom = rs.getString(2);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (nom);
    }

    @Override
    public HashMap<String,Integer> GetDatasGraph1() {
        HashMap<String,Integer> lesDatas = new HashMap<>();
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT famille.FAM_LIBELLE ,COUNT(*) "
                    + "FROM medicament inner join famille on famille.FAM_CODE = medicament.FAM_CODE "
                    + "GROUP BY medicament.FAM_CODE;");
            rs = ps.executeQuery();
           
            while (rs.next()) {
                lesDatas.put(rs.getString(1),rs.getInt(2));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDatas;
    }

    @Override
    public Medicament getMedicamentByIndex(int index) {
        Medicament resMed = null;
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select MED_DEPOTLEGAL, MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON from medicament where MED_DEPOTLEGAL = '"+index+"'");
            rs = ps.executeQuery();

            if (rs.next()) {
                resMed = new Medicament(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resMed;
    }

    @Override
    public TypeIndividu getTypeIndividuByIndex(int index) {
         TypeIndividu resType = null;
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT TIN_CODE, TIN_LIBELLE FROM type_individu where TIN_CODE = '"+index+"'");
            rs = ps.executeQuery();

            if (rs.next()) {
                resType = new TypeIndividu(rs.getInt(1),rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resType;
    }
    
    @Override
    public HashMap<String,Integer> GetDatasGraph2()
    {
        HashMap<String,Integer> lesDatas = new HashMap<>();
        try {
            
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT medicament.MED_NOMCOMMERCIAL ,COUNT(*) FROM `prescrire` INNER JOIN medicament on prescrire.MED_DEPOTLEGAL = medicament.MED_DEPOTLEGAL GROUP BY prescrire.MED_DEPOTLEGAL");
            rs = ps.executeQuery();
            while(rs.next())
            {
                lesDatas.put(rs.getString(1),rs.getInt(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDatas;
    }
    
    @Override
    public HashMap<String,Integer> GetDatasGraph3()
    {
        HashMap<String,Integer> lesDatas = new HashMap<>();
        try {
            
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT famille.FAM_LIBELLE ,COUNT(*) FROM `prescrire` INNER JOIN medicament on prescrire.MED_DEPOTLEGAL = medicament.MED_DEPOTLEGAL INNER JOIN famille on medicament.FAM_CODE = famille.FAM_CODE GROUP BY medicament.FAM_CODE;");
            rs = ps.executeQuery();
            while(rs.next())
            {
                lesDatas.put(rs.getString(1),rs.getInt(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDatas;
    }

    @Override
    public HashMap<String, Integer> GetDatasGraph4() {
     HashMap<String,Integer> lesDatas = new HashMap<>();
        try {
            
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT medicament.MED_NOMCOMMERCIAL, COUNT(*) FROM `interagis` INNER JOIN medicament ON interagis.MED_PERTURBATEUR = medicament.MED_DEPOTLEGAL GROUP BY MED_PERTURBATEUR;");
            rs = ps.executeQuery();
            while(rs.next()){
                    lesDatas.put(rs.getString(1),rs.getInt(2));  
            }
             ps = maCnx.prepareStatement("SELECT medicament.MED_NOMCOMMERCIAL, COUNT(*) FROM `interagis` INNER JOIN medicament ON interagis.MED_PERTURBATEUR = medicament.MED_DEPOTLEGAL GROUP BY interagis.MED_MED_PERTURBE;");           
            rs = ps.executeQuery();
            while(rs.next()){
                      lesDatas.replace(rs.getString(1),lesDatas.get(rs.getString(1))+rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDatas;
    }

    @Override
    public boolean VerifierTypeExist(String type) {
        boolean resultat = false;
        
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT TIN_LIBELLE FROM type_individu");
            rs = ps.executeQuery();

            while (rs.next()) {
                if(type.compareTo(rs.getString(1))==0){
                    resultat = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
    }
     @Override
    public boolean VerifierMedicamentExist(String med) {
        boolean resultat = false;
        
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("SELECT MED_NOMCOMMERCIAL FROM medicament");
            rs = ps.executeQuery();

            while (rs.next()) {
                if(med.compareTo(rs.getString(1))==0){
                    resultat = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
    }
}

