/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadores;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class acomodarColumnas extends DefaultTableCellRenderer {

    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setVerticalAlignment(SwingConstants.NORTH);
        setHorizontalAlignment(SwingConstants.CENTER);

        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}