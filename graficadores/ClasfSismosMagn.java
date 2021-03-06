package graficadores;


import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;





public class ClasfSismosMagn extends javax.swing.JFrame {
    DefaultTableModel tabla;
    acomodarColumnas r = new acomodarColumnas();
    
    String[][] datos;
    /**
    *Constructor de la ventana
    *@param listaSismo ArrayList de tipo Sismo 
    * Genera los datos desde la clase datosTablaMagnitud usando la listaSismo
    */
    public ClasfSismosMagn(ArrayList<Sismo> listaSismo) {
        
        
        setTitle("Clasificación de sismos por Magnitud");
        
        this.datos = new datosTablaMagnitud().clasificar(listaSismo);
        initComponents();
        tabla  = new DefaultTableModel();
        tabla.addColumn("Micro",datos[0]);
        tabla.addColumn("Menor",datos[1]);
        tabla.addColumn("Ligero",datos[2]);
        tabla.addColumn("Moderado",datos[3]);
        tabla.addColumn("Fuerte",datos[4]);
        tabla.addColumn("Mayor",datos[5]);
        tabla.addColumn("Gran",datos[6]);
        tabla.addColumn("Epico",datos[7]);
        this.TablaSismos.setModel(tabla);

        

        TablaSismos.setRowHeight(500);
        TablaSismos.setDefaultRenderer(Object.class, r);

    
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSismos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setSize(new java.awt.Dimension(1200, 720));

        TablaSismos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Micro", "Menor", "Ligero", "Moderado", "Fuerte", "Mayor", "Gran", "Epico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaSismos);
        if (TablaSismos.getColumnModel().getColumnCount() > 0) {
            TablaSismos.getColumnModel().getColumn(0).setHeaderValue("Micro");
            TablaSismos.getColumnModel().getColumn(1).setHeaderValue("Menor");
            TablaSismos.getColumnModel().getColumn(2).setHeaderValue("Ligero");
            TablaSismos.getColumnModel().getColumn(3).setHeaderValue("Moderado");
            TablaSismos.getColumnModel().getColumn(4).setHeaderValue("Fuerte");
            TablaSismos.getColumnModel().getColumn(5).setHeaderValue("Mayor");
            TablaSismos.getColumnModel().getColumn(6).setHeaderValue("Gran");
            TablaSismos.getColumnModel().getColumn(7).setHeaderValue("Epico");
        }

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
