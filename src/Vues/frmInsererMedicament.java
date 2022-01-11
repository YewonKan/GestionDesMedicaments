/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.Famille;
import Entity.FonctionsMetier;
import Entity.Medicament;
import com.mysql.jdbc.StringUtils;
import java.awt.Color;
import javax.swing.JOptionPane;

public class frmInsererMedicament extends javax.swing.JFrame
{

    FonctionsMetier fm;

    public frmInsererMedicament() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel3 = new javax.swing.JPanel();
        txtInterdiction = new javax.swing.JTextField();
        txtprix = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDepot = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCompo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEffet = new javax.swing.JTextField();
        txtNomCommercial = new javax.swing.JTextField();
        btnInserer = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        btnMed = new javax.swing.JButton();
        btnInter = new javax.swing.JButton();
        btnPresc = new javax.swing.JButton();
        btnPers = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(89, 136, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtInterdiction.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtInterdiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInterdictionActionPerformed(evt);
            }
        });

        txtprix.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Depot Legal");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Famille");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Composition");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Effet");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Contre Interdiction");

        txtDepot.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDepot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepotActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Prix");

        txtCompo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Nom Commercial");

        txtEffet.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtNomCommercial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnInserer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnInserer.setText("INSERER");
        btnInserer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsererMouseClicked(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnMed.setBackground(new java.awt.Color(89, 136, 255));
        btnMed.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnMed.setText("MEDICAMENT");
        btnMed.setFocusable(false);
        btnMed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedMouseClicked(evt);
            }
        });
        btnMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMed);

        btnInter.setBackground(new java.awt.Color(255, 255, 255));
        btnInter.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnInter.setText("INTERDICTION");
        btnInter.setFocusable(false);
        btnInter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInterMouseClicked(evt);
            }
        });
        jToolBar1.add(btnInter);

        btnPresc.setBackground(new java.awt.Color(255, 255, 255));
        btnPresc.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnPresc.setText("PRESCRIPTION");
        btnPresc.setFocusable(false);
        btnPresc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPresc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPresc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrescMouseClicked(evt);
            }
        });
        jToolBar1.add(btnPresc);

        btnPers.setBackground(new java.awt.Color(255, 255, 255));
        btnPers.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnPers.setText("TYPE-PERSONNE");
        btnPers.setFocusable(false);
        btnPers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPersMouseClicked(evt);
            }
        });
        jToolBar1.add(btnPers);

        jPanel2.setBackground(new java.awt.Color(89, 136, 255));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSET/chrome_ZpF0AWG32d.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInserer)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtInterdiction, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEffet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)
                            .addComponent(txtNomCommercial, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDepot, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprix))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDepot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEffet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInterdiction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnInserer)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepotActionPerformed

    private void btnInsererMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsererMouseClicked

        if (txtNomCommercial.getText().compareTo("") == 0 || txtCompo.getText().compareTo("") == 0 || txtEffet.getText().compareTo("") == 0 || txtInterdiction.getText().compareTo("") == 0 || txtprix.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Remplir les champs", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
        }
        else if(!StringUtils.isStrictlyNumeric(txtprix.getText())) {
            JOptionPane.showMessageDialog(this, "Le prix doit etre un chiffre", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
        }
        else {

            String unNomMedicament = txtNomCommercial.getText();
            String nomFamMedicament = fm.getNomFamille(jComboBox1.getSelectedIndex() + 1);
            String unComposition = txtCompo.getText();
            String unEffet = txtEffet.getText();
            String unContreIndic = txtInterdiction.getText();
            Float unPrix = Float.parseFloat(txtprix.getText());
            int numFam = fm.getNumFamille(nomFamMedicament);

            Medicament userInputMedicament = new Medicament(fm.getIndexMedicament() + 1, unNomMedicament, numFam, unComposition, unEffet, unContreIndic, unPrix);
            fm.setMedicament(userInputMedicament);
            JOptionPane.showMessageDialog(this, "Suceed", "Suceed", JOptionPane.INFORMATION_MESSAGE);
            frmListerMedicaments frm = new frmListerMedicaments();
            frm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnInsererMouseClicked

    private void txtInterdictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInterdictionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInterdictionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ConnexionBdd bdd = new ConnexionBdd();
        fm = new FonctionsMetier();
        txtDepot.setText(String.valueOf(fm.getIndexMedicament() + 1));
        txtDepot.setEnabled(false);
        for (Famille f : fm.getAllFamille()) {
            jComboBox1.addItem(f.getFamLibelle());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        frmMain frm = new frmMain();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMedActionPerformed

    private void btnMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedMouseClicked
    
    }//GEN-LAST:event_btnMedMouseClicked

    private void btnInterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInterMouseClicked
        frmInsererInteraction frm = new frmInsererInteraction();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterMouseClicked

    private void btnPrescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrescMouseClicked
        frmPrescription frm = new frmPrescription();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPrescMouseClicked

    private void btnPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersMouseClicked
        frmUser frm = new frmUser();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPersMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInsererMedicament.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInsererMedicament.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInsererMedicament.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInsererMedicament.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new frmInsererMedicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInserer;
    private javax.swing.JButton btnInter;
    private javax.swing.JButton btnMed;
    private javax.swing.JButton btnPers;
    private javax.swing.JButton btnPresc;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtCompo;
    private javax.swing.JTextField txtDepot;
    private javax.swing.JTextField txtEffet;
    private javax.swing.JTextField txtInterdiction;
    private javax.swing.JTextField txtNomCommercial;
    private javax.swing.JTextField txtprix;
    // End of variables declaration//GEN-END:variables
}
