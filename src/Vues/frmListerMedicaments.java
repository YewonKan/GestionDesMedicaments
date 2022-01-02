/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.FonctionsMetier;
import Entity.Medicament;
import Model.ModelMedicament;
import Model.ModelPersonne;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTypePersonne = new javax.swing.JTable();
        btnMedicament = new javax.swing.JRadioButton();
        btnTypePersnonne = new javax.swing.JRadioButton();

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

        tblTypePersonne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTypePersonne);

        buttonGroup1.add(btnMedicament);
        btnMedicament.setText("medicament");
        btnMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnTypePersnonne);
        btnTypePersnonne.setText("Type-Personne");
        btnTypePersnonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTypePersnonneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btnTypePersnonne, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedicament)
                    .addComponent(btnTypePersnonne))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fm = new FonctionsMetier();
        mdlMed = new ModelMedicament();
        mdlMed.loadDatas(fm.getAllMedicamentWithFamName());
        tblMedicament.setModel(mdlMed);
        
        mdlPersonne = new ModelPersonne();
        mdlPersonne.loadDatas(fm.getAllIndividu());
        tblTypePersonne.setModel(mdlPersonne);
    }//GEN-LAST:event_formWindowOpened

    private void btnMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentActionPerformed
        tblMedicament.setVisible(true);
        tblTypePersonne.setVisible(false);
    }//GEN-LAST:event_btnMedicamentActionPerformed

    private void btnTypePersnonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTypePersnonneActionPerformed
        tblMedicament.setVisible(false);
        tblTypePersonne.setVisible(true);
    }//GEN-LAST:event_btnTypePersnonneActionPerformed

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
    private javax.swing.JRadioButton btnMedicament;
    private javax.swing.JRadioButton btnTypePersnonne;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMedicament;
    private javax.swing.JTable tblTypePersonne;
    // End of variables declaration//GEN-END:variables
}
