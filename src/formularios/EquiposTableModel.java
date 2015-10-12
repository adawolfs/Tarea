/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.table.AbstractTableModel;
import main.Equipo;
import main.Tarea;

/**
 *
 * @author adawolfs
 */
public class EquiposTableModel extends AbstractTableModel {
    
    public EquiposTableModel(){
        refresh();
    }
    private String[] columnNames = {"Codigo", "Marca"};
    List<ArrayList> data = new ArrayList<ArrayList>();
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data.get(row).get(col);
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public void refresh(){
        Map<String, Equipo> map = new TreeMap<String, Equipo>(
            new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        map.putAll(Tarea.elements);
        for (Map.Entry<String, Equipo> entrySet : map.entrySet()) {
            Equipo value = entrySet.getValue();
            ArrayList<String> row = new ArrayList<String>();
            row.add(value.getCodigo());
            row.add(value.getMarca());
            data.add(row);
        }
    }
    
}
