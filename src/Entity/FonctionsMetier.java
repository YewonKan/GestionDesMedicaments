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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    public String getNameFamille(int numFam) {
        String FamilyName = null;
        //if you don't find any FamilyName match with Name, return null so we have to block
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select FAM_LIBELLE from famille where FAM_CODE = " + numFam + ";");
            rs = ps.executeQuery();

            if (rs.next()) {
                FamilyName = (rs.getNString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return FamilyName;
    }

    @Override
    public int getNumFamille(String nomFam) {
        int FamilyNum = 0;
        //if you don't find any FamilyName match with Name, return 0 so we have to block 
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select FAM_LIBELLE from famille where FAM_LIBELLE = " + nomFam + ";");
            rs = ps.executeQuery();

            if (rs.next()) {
                FamilyNum = (rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return FamilyNum;
    }

    public ArrayList<MedicamentFamNom> getAllMedicamentWithFamName() {
        ArrayList<MedicamentFamNom> mesMedicaments = new ArrayList<>();
        String FamilyName = null;
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select MED_DEPOTLEGAL, MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON from medicament");
            rs = ps.executeQuery();

            while (rs.next()) {
                FamilyName = getNameFamille(rs.getInt(3));
                MedicamentFamNom m = new MedicamentFamNom(rs.getInt(1), rs.getString(2), FamilyName, rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
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
            ps = maCnx.prepareStatement("insert into medicament(MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON) values(" + med.getCdFamMedicament() + "," + med.getComposition() + "," + med.getEffet() + "," + med.getContreIndic() + "," + med.getPrix() + ")");
            rs = ps.executeQuery();

            if (rs.next()) {
                // should we return value to check if this action was executed well (= not void function)
            }

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setPrescrire(Prescrire prescrption) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("insert into prescrire(MED_DEPOTLEGAL,TIN_CODE,DOS_CODE,PRE_POSOLOGIE) values(" + prescrption.getIdMedicament() + "," + prescrption.getTICode() + "," + prescrption.getDoseCode() + "," + prescrption.getPrePosologie() + ")");
            rs = ps.executeQuery();

            if (rs.next()) {
                // should we return value to check if this action was executed well (= not void function)
            }

        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setTypePersonne(TypeIndividu typePersonne) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("insert into type_individu(TIN_LIBELLE) values(" + typePersonne.getTIlibelle() + ")");
            rs = ps.executeQuery();

            if (rs.next()) {
                // should we return value to check if this action was executed well (= not void function)
            }

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



    @Override
    public void setInteragis(int med1, int med2) {
        try {

            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("insert into interagis(TIN_LIBELLE) values() ");
            rs = ps.executeQuery();

            if (rs.next()) {
                // should we return value to check if this action was executed well (= not void function)
            }

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
                if(medNom.compareTo(rs.getString(2))==0){
                    index = Integer.parseInt(rs.getString(1));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (index);
    }

}
