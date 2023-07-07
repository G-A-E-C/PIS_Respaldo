/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTabla;

import controlador.DAO.VotanteDao;
import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.EmptyException;
import controlador.ed.lista.exception.PositionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import modelo.PadronElectoral;

/**
 *
 * @author Andy
 */
public class ModeloTablaPadron extends AbstractTableModel {

    ListaEnlazada<PadronElectoral> dato = new ListaEnlazada<>();

    public ListaEnlazada<PadronElectoral> getDato() {
        return dato;
    }

    public void setDato(ListaEnlazada<PadronElectoral> dato) {
        this.dato = dato;
    }

    @Override
    public int getRowCount() {
        return dato.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        PadronElectoral p = null;

        try {
            p = dato.get(i);
        } catch (Exception ex) {
        }
        switch (i1) {
            case 0: return "No definido";
            case 1: return "No definido";
            case 2: return "No definido";
            case 3: return "No definido";
            case 4: return "No definido";

            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0: return "Id";
            case 1: return "Cdi";
            case 2: return "Nombre";
            case 3: return "Apellido";
            case 4: return "Ha Votado"; 
                
            default:
                return null;
        }
    }

}
