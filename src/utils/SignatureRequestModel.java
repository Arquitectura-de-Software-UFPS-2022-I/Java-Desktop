/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.SignatureRequestDto;

/**
 *
 * @author USUARIO
 */
public class SignatureRequestModel extends AbstractTableModel {

    protected List<SignatureRequestDto> requests;

    private final String[] columnNames = {"ID", "Subject", "Create Date"};
    private final Class[] columnClasses = {Integer.class, String.class, String.class};

    public SignatureRequestModel(List<SignatureRequestDto> requests) {
        this.requests = requests;
    }

    @Override
    public int getRowCount() {
        return requests.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SignatureRequestDto usuario = this.requests.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getId();
            case 1:
                return usuario.getSubject();
            case 2:
                return usuario.getCreate_date();
        }
        return ("");

    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}
