/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapersonas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yeiim
 */
public class TableModelPersona extends AbstractTableModel {

    String[] columnas = {"Codigo", "Nombre", "NDocumento"};
    List<Persona> persona = new ArrayList<>();

    public TableModelPersona(List<Persona> p) {
        this.persona = p;
    }

    @Override
    public int getRowCount() {
        return persona.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object resp;

        if (columna == 0) {
            resp = persona.get(fila).getCodigo();
        } else {
            if (columna == 1) {
                resp = persona.get(fila).getNombre();
                return resp;
            } else {
                resp = persona.get(fila).getDocumento();
                return resp;
            }
        }
        return resp;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

    public Persona dameDetalle(int fila) {
        return persona.get(fila);
    }
}
