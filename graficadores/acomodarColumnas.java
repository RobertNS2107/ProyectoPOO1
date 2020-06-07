package graficadores;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class acomodarColumnas extends DefaultTableCellRenderer {

    
    /** 
     *Componente para que los Jtable se vean mas ordenados
    *@param table JTable 
    *@param value Object 
    *@param isSelected boolean 
    *@param hasFocus boolean 
    *@param row int 
    *@param column int 
    */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setVerticalAlignment(SwingConstants.NORTH);
        setHorizontalAlignment(SwingConstants.CENTER);

        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
