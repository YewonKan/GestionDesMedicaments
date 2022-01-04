/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruth9
 */
public class ConnexionBdd 
{
   private static Connection cnx;

   
    
    public ConnexionBdd(){
        try {
            String chaine = "com.mysql.jdbc.Driver";
            Class.forName(chaine);
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/projet_java?serverTimezone="
                    + TimeZone.getDefault().getID(), "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionBdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBdd.class.getName()).log(Level.SEVERE, null, ex);
        } 
} 
    public static Connection getCnx() {
        return cnx; 
}
}
