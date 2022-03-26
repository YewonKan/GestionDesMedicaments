/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Entity.Interagis;
import Entity.Medicament;
import Model.ModelMedicament;
import Model.ModelPersonne;
import com.mysql.jdbc.StringUtils;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMedicament = new javax.swing.JRadioButton();
        btnTypePersnonne = new javax.swing.JRadioButton();
        btnModifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicament = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listePertubateur = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(89, 136, 255));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnMedicament.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnMedicament);
        btnMedicament.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
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

        btnTypePersnonne.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnTypePersnonne);
        btnTypePersnonne.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
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

        btnModifier.setBackground(new java.awt.Color(255, 255, 255));
        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSET/chrome_jyONPH5W2D.png"))); // NOI18N
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        tblMedicament.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMedicament.setGridColor(new java.awt.Color(255, 255, 255));
        tblMedicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    tblMedicamentMouseClicked(evt);
                }
            }
        }
    );
    jScrollPane1.setViewportView(tblMedicament);

    txtSearch.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    txtSearch.setText("Entrer le nom d' un medicament ");
    txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtSearchMouseClicked(evt);
        }
    });
    txtSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtSearchActionPerformed(evt);
        }
    });

    btnSearch.setBackground(new java.awt.Color(255, 255, 255));
    btnSearch.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    btnSearch.setText("Chercher");
    btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnSearchMouseClicked(evt);
        }
    });

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    jLabel1.setText("double clic : liste des pertubateurs");

    listePertubateur.setText("Interagis");
    listePertubateur.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            listePertubateurActionPerformed(evt);
        }
    });

    jLabel2.setText("Liste des pertubateurs");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                    .addComponent(btnMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTypePersnonne, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(152, 152, 152))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13))
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(listePertubateur, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTypePersnonne, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnMedicament))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(listePertubateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addContainerGap(16, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
        if (tblMedicament.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Choisir un Medicament", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
        }
        else {

            int indexMed = Integer.parseInt(tblMedicament.getValueAt(tblMedicament.getSelectedRow(), 0).toString());
            frmModifMedicament frm = new frmModifMedicament(indexMed);
            frm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnModifierMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

        if (txtSearch.getText() == "") {
            JOptionPane.showMessageDialog(this, "Entrer le nom du médicament svp", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
        }
        else {
            fm = new FonctionsMetier();
            mdlMed = new ModelMedicament();
            mdlMed.loadDatas(fm.getMedicamentSearch(txtSearch.getText()));
            tblMedicament.setModel(mdlMed);
            if (fm.getMedicamentSearch(txtSearch.getText()).isEmpty()) {
                JOptionPane.showMessageDialog(this, "il n'y a aucun résultat correspondant à ce nom de médicament", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
                mdlMed.loadDatas(fm.getAllMedicamentWithFamName());
                tblMedicament.setModel(mdlMed);
            }
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        if (txtSearch.getText().contains("Entrer le nom")) {
            txtSearch.setText("");
        }
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void listePertubateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listePertubateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listePertubateurActionPerformed

    private void tblMedicamentMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedMedIndex = Integer.parseInt(tblMedicament.getValueAt(tblMedicament.getSelectedRow(), 0).toString());
        ArrayList<Interagis> lesInteragis = fm.getAllInteragis();
        ArrayList<String> result = new ArrayList<String>();

        for (Interagis i : lesInteragis) {
            if (i.getMedMedPerturbe() == selectedMedIndex ) {
                String Interagis = fm.getNomMedicament(i.getMedPerturbateur());
                result.add(String.valueOf(Interagis));
            }
            else if (i.getMedPerturbateur()== selectedMedIndex) {
                String Interagis = fm.getNomMedicament(i.getMedMedPerturbe());
                result.add(String.valueOf(Interagis));
            }
        }

        if (result.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Il n'y a pas de pertubateurs pour ce medicament", "Liste des pertubateurs", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String msg = result.get(0);
            for (int i = 1; i < result.size(); i++) {
                msg = msg + ", " + result.get(i);
            }

            listePertubateur.setText(msg);
        }
    }

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
    private javax.swing.JButton btnSearch;
    private javax.swing.JRadioButton btnTypePersnonne;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField listePertubateur;
    private javax.swing.JTable tblMedicament;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
