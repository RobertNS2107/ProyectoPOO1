
package graficadores;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;



public class ClasfSismoFecha extends javax.swing.JFrame {

    DefaultTableModel tabla; 
    acomodarColumnas r = new acomodarColumnas();
    
    String[][] datos;
    /**
     *Constructor de la ventana
    * @param listaSismo ArrayList de tipo Sismo
    * @param fechaInicio String 
    * @param fechaFin String 
    * Genera los datos desde la clase datosTablaFehca usando la listaSismo,
    * la fechaInicio  y la fehcahFin
    */
    public ClasfSismoFecha(ArrayList<Sismo> listaSismo, String fechaInicio, String fechaFin) {
        
        
        setTitle("Sismos desde la fecha " + fechaInicio + " hasta " + fechaFin);
        
        this.datos = new datosTablaFecha().clasificar(listaSismo, fechaInicio, fechaFin);
        initComponents();
        tabla  = new DefaultTableModel();
        tabla.addColumn("Fecha");
        tabla.addColumn("Hora");
        tabla.addColumn("Magnitud");
        tabla.addColumn("Profundidad");
        tabla.addColumn("Localización");
        tabla.addColumn("Origen");
        tabla.addColumn("Reportado");
        tabla.addColumn("Latitud");
        tabla.addColumn("Longitud");
        
        
        for (int i = 0; i < datos.length; i++) {
            
            datos[i][4] = "<html>"+ datos[i][4] + "<html>";
            datos[i][5] = "<html>"+ datos[i][5] + "<html>";
            datos[i][6] = "<html>"+ datos[i][6] + "<html>";
            tabla.addRow(datos[i]);            
        }
        
        this.TablaSismos.setModel(tabla);       

        TablaSismos.setRowHeight(80);
        
        TablaSismos.getColumnModel().getColumn(0).setMaxWidth(100);
        TablaSismos.getColumnModel().getColumn(1).setMaxWidth(100);
        TablaSismos.getColumnModel().getColumn(2).setMaxWidth(100);
        TablaSismos.getColumnModel().getColumn(3).setMaxWidth(100);
        TablaSismos.getColumnModel().getColumn(7).setMaxWidth(100);
        TablaSismos.getColumnModel().getColumn(8).setMaxWidth(100);
        

        
        TablaSismos.setDefaultRenderer(Object.class, r);

    
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSismos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 720));

        TablaSismos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Magnitud", "Profundidad", "Localización", "Origen", "Reportado", "Latitud", "Longitud"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaSismos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaSismos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
