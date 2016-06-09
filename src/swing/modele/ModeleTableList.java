/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.modele;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import velov.modele.Station;

/**
 *
 * @author Jean-Mouloud
 */
public class ModeleTableList extends AbstractTableModel{
    private List<Station> listeStation;
    private final String[] columnNames ={"Numéro station", "Nom station", "Numéro arrondissement", "Localisation"};
    
    public ModeleTableList (){
    listeStation = new ArrayList<>();
    }
    
    public ModeleTableList (ArrayList<Station> liste){
    listeStation = liste;
    }

    @Override
    public int getRowCount() {
        return listeStation.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int index) {
        return columnNames[index];
    }
    
    public List<Station> getStation(){
        return listeStation;
    }
    
    public void setStation (List<Station> liste){
        this.listeStation=liste;
        fireTableStructureChanged();
    }
    
    public void addStation(Station s){
        listeStation.add(s);
        fireTableStructureChanged();
    }

    public void remStation(int[] index){
        int lol;
        int tamere=0;
        for(int i : index){
            listeStation.remove(i-tamere++);
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listeStation.get(rowIndex).getNumero();
            case 1:
                return listeStation.get(rowIndex).getNom();
            case 2:
                return listeStation.get(rowIndex).getNumeroArrondissementVille();
            case 3:
                return listeStation.get(rowIndex).getLocalisation();
            default :
                return null;
        }
    }
    
    
    
}
