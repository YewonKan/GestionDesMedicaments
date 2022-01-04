/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Medicament;
import Entity.MedicamentFamNom;
import Entity.TypeIndividu;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;


public class ModelMedicament extends AbstractTableModel {
    private String[] nomsColonnes;
    private Vector<String[]> rows;

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nomsColonnes[column]; 
    }
    
    public void loadDatas(ArrayList<MedicamentFamNom> lesMedicaments)
    {
        nomsColonnes = new String[]{"INDEX","NOM COMMERCIAL","NOM DE FAMILLE","COMPOSITION","EFFET","PRIX"};
        rows = new Vector<>();
        
        for(MedicamentFamNom med : lesMedicaments)
        {
            rows.add(new String[]{String.valueOf(med.getIdMedicament()),med.getNomMedicament(),med.getNomFamMedicament(),med.getComposition(),med.getEffet(),String.valueOf(med.getPrix())});
        }
        fireTableDataChanged();
    }
    
    public void LoadDatsOnlyName (ArrayList<Medicament> lesMedicaments){
        nomsColonnes = new String[]{"Nom Medicament"};
        rows = new Vector<>();
        
        for(Medicament med : lesMedicaments){
            rows.add(new String[]{String.valueOf(med.getNomMedicament())});
        }
        fireTableDataChanged();
    }
    
}
