/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Entity.Interagis;
import Model.ModelMedicament;
import Model.ModelPersonne;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 82103
 */
public class frmInsererInteraction extends javax.swing.JFrame
{

    FonctionsMetier fm;
    ModelMedicament mdlMed;
    ModelPersonne mdlPersonne;

    public frmInsererInteraction() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSelect1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSelect2 = new javax.swing.JTable();
        btnInserer = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        btnMed1 = new javax.swing.JButton();
        btnInter1 = new javax.swing.JButton();
        btnPresc1 = new javax.swing.JButton();
        btnPers1 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(89, 136, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSET/chrome_ZpF0AWG32d.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("SELECTION");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("SELECTION");

        tblSelect1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSelect1.setGridColor(new java.awt.Color(255, 255, 255));
        tblSelect1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSelect1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSelect1);

        tblSelect2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSelect2.setGridColor(new java.awt.Color(255, 255, 255));
        tblSelect2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSelect2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSelect2);

        btnInserer.setBackground(new java.awt.Color(255, 255, 255));
        btnInserer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnInserer.setText("INSERER");
        btnInserer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsererMouseClicked(evt);
            }
        });
        btnInserer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsererActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInserer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnInserer)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setRollover(true);

        btnMed1.setBackground(new java.awt.Color(255, 255, 255));
        btnMed1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnMed1.setText("MEDICAMENT");
        btnMed1.setFocusable(false);
        btnMed1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMed1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMed1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMed1MouseClicked(evt);
            }
        });
        jToolBar2.add(btnMed1);

        btnInter1.setBackground(new java.awt.Color(89, 136, 255));
        btnInter1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnInter1.setText("INTERDICTION");
        btnInter1.setFocusable(false);
        btnInter1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInter1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInter1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnInter1);

        btnPresc1.setBackground(new java.awt.Color(255, 255, 255));
        btnPresc1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnPresc1.setText("PRESCRIPTION");
        btnPresc1.setFocusable(false);
        btnPresc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPresc1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPresc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPresc1MouseClicked(evt);
            }
        });
        jToolBar2.add(btnPresc1);

        btnPers1.setBackground(new java.awt.Color(255, 255, 255));
        btnPers1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnPers1.setText("TYPE-PERSONNE");
        btnPers1.setFocusable(false);
        btnPers1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPers1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPers1MouseClicked(evt);
            }
        });
        jToolBar2.add(btnPers1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fm = new FonctionsMetier();
        ConnexionBdd cnx = new ConnexionBdd();

        mdlMed = new ModelMedicament();
        mdlMed.LoadDatsOnlyName(fm.getAllMedicament());
        tblSelect1.setModel(mdlMed);
        tblSelect2.setModel(mdlMed);
    }//GEN-LAST:event_formWindowOpened

    private void btnInsererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsererActionPerformed


    }//GEN-LAST:event_btnInsererActionPerformed

    private void tblSelect1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelect1MouseClicked
        tblSelect1.setSelectionBackground(Color.PINK);
    }//GEN-LAST:event_tblSelect1MouseClicked

    private void tblSelect2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelect2MouseClicked
        tblSelect2.setSelectionBackground(Color.PINK);
    }//GEN-LAST:event_tblSelect2MouseClicked

    private void btnInsererMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsererMouseClicked
        if ((tblSelect1.getSelectedRowCount() == 0) || (tblSelect2.getSelectedRowCount() == 0)) {
            JOptionPane.showMessageDialog(this, "Sélectionner des medicaments dans deux tables", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String selectedMedNom1 = tblSelect1.getValueAt(tblSelect1.getSelectedRow(), 0).toString();
            String selectedMedNom2 = tblSelect2.getValueAt(tblSelect2.getSelectedRow(), 0).toString();
            int selectedMedIndex1 = fm.getMatchedIndex(selectedMedNom1);
            int selectedMedIndex2 = fm.getMatchedIndex(selectedMedNom2);

            if (selectedMedIndex1 == selectedMedIndex2) {
                JOptionPane.showMessageDialog(this, "Vous ne pouvez pas sélectionner la même médicament", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
            }
            else {
                boolean exist = true;
                ArrayList<Interagis> lesInteragis = fm.getAllInteragis();

                for (Interagis i : lesInteragis) {
                    if (i.getMedMedPerturbe() == selectedMedIndex1 && i.getMedPerturbateur() == selectedMedIndex2 || i.getMedMedPerturbe() == selectedMedIndex2 && i.getMedPerturbateur() == selectedMedIndex1) {
                        exist = false;
                    }
                }

                if (exist) {
                    fm.setInteragis(selectedMedIndex1, selectedMedIndex2);
                    JOptionPane.showMessageDialog(this, "Succeed", "Succeed", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Cette interaction existe déjà ", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnInsererMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        frmMain frm = new frmMain();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnMed1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMed1MouseClicked
        frmInsererMedicament frm = new frmInsererMedicament();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMed1MouseClicked

    private void btnPresc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPresc1MouseClicked
        frmPrescription frm = new frmPrescription();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPresc1MouseClicked

    private void btnPers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPers1MouseClicked
        frmUser frm = new frmUser();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPers1MouseClicked

    private void btnInter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInter1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmInsererInteraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInsererInteraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInsererInteraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInsererInteraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new frmInsererInteraction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserer;
    private javax.swing.JButton btnInter1;
    private javax.swing.JButton btnMed1;
    private javax.swing.JButton btnPers1;
    private javax.swing.JButton btnPresc1;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tblSelect1;
    private javax.swing.JTable tblSelect2;
    // End of variables declaration//GEN-END:variables
}
