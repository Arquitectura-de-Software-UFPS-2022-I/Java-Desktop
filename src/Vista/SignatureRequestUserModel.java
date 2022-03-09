/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.SignatureRequestDto;
import models.SignatureRequestUserDto;

/**
 *
 * @author USUARIO
 */
public class SignatureRequestUserModel extends AbstractTableModel {

    protected List<SignatureRequestUserDto> requests;

    private final String[] columnNames = {"ID", "User", "Signed", "Signed Date", "Create Date"};
    private final Class[] columnClasses = {Integer.class, String.class, String.class, String.class, String.class};

    public SignatureRequestUserModel(List<SignatureRequestUserDto> requests) {
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
        SignatureRequestUserDto usuario = this.requests.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getId();
            case 1:
                return usuario.getUserDto().getFull_name();
            case 2:
                return usuario.isSigned()?"SI":"NO";
            case 3:
                return usuario.getSignature_date();
            case 4:
                return usuario.getCreated_date();
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
