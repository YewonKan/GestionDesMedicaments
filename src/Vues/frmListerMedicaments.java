/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Entity.Medicament;
import Model.ModelMedicament;
import Model.ModelPersonne;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;

public class frmListerMedicaments extends javax.swing.JFrame
{

    FonctionsMetier fm;
    ModelMedicament mdlMed;
    ModelPersonne mdlPersonne;

    public frmListerMedicaments() {
        initComponents();
    }
    static Medicament leMedicament;

    public frmListerMedicaments(Medicament unMedicament) {
        initComponents();
        leMedicament = unMedicament;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicament = new javax.swing.JTable();
        btnMedicament = new javax.swing.JRadioButton();
        btnTypePersnonne = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblMedicament.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMedicament);

        buttonGroup1.add(btnMedicament);
        btnMedicament.setText("medicament");
        btnMedicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedicamentMouseClicked(evt);
            }
        });
        btnMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnTypePersnonne);
        btnTypePersnonne.setText("Type-Personne");
        btnTypePersnonne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTypePersnonneMouseClicked(evt);
            }
        });
        btnTypePersnonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTypePersnonneActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(89, 136, 255));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSET/chrome_ZpF0AWG32d.png"))); // NOI18N
        btnHome.setText("jButton1");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSET/chrome_jyONPH5W2D.png"))); // NOI18N
        btnModifier.setText("jButton2");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTypePersnonne, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedicament)
                    .addComponent(btnTypePersnonne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fm = new FonctionsMetier();
        ConnexionBdd cnx = new ConnexionBdd();

        mdlMed = new ModelMedicament();
        mdlMed.loadDatas(fm.getAllMedicamentWithFamName());
        tblMedicament.setModel(mdlMed);

        btnMedicament.setSelected(true);
    }//GEN-LAST:event_formWindowOpened

    private void btnMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentActionPerformed

    }//GEN-LAST:event_btnMedicamentActionPerformed

    private void btnTypePersnonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTypePersnonneActionPerformed

    }//GEN-LAST:event_btnTypePersnonneActionPerformed

    private void btnMedicamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedicamentMouseClicked

    }//GEN-LAST:event_btnMedicamentMouseClicked

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnTypePersnonneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypePersnonneMouseClicked
        frmListerTypePers frm = new frmListerTypePers();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTypePersnonneMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        frmMain frm = new frmMain();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new frmListerMedicaments().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JRadioButton btnMedicament;
    private javax.swing.JButton btnModifier;
    private javax.swing.JRadioButton btnTypePersnonne;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMedicament;
    // End of variables declaration//GEN-END:variables
}
