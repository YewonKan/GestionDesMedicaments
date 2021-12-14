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

/**
 *
 * @author ruth9
 */
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
            ps= maCnx.prepareStatement("select MED_DEPOTLEGAL, MED_NOMCOMMERCIAL,FAM_CODE, MED_COMPOSITION, MED_EFFETS, MED_CONTREINDIC, MED_PRIXECHANTILLON from medicament");
            rs= ps.executeQuery();
            
            while(rs.next())
            {
                Medicament m = new Medicament(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getFloat(7));
                mesMedicaments.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
            return mesMedicaments;   
      }

  
}

    
    

