/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadores;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author Usuario
 */

//La documentacion de esta clase es la misma que la del graficoPastel

public class graficoBarras {
     private float[] listaNumeros; 
     private String[] listaPalabras;
     
     public graficoBarras(float[] listaNumeros, String[] listaPalabras) {
        this.listaNumeros = listaNumeros;
        this.listaPalabras = listaPalabras;
    }
    
    public ChartPanel graficar(String titulo,boolean mostrar, String datosHorizontals, String datosVerticales){
        
        DefaultCategoryDataset  datos = new DefaultCategoryDataset();
        
        
        datos.setValue(listaNumeros[0],listaPalabras[0],"");
        datos.setValue(listaNumeros[1],listaPalabras[1],"");    
        datos.setValue(listaNumeros[2],listaPalabras[2],"");    
        datos.setValue(listaNumeros[3],listaPalabras[3],"");    
        datos.setValue(listaNumeros[4],listaPalabras[4],"");    
        
        JFreeChart grafico = ChartFactory.createBarChart(titulo, datosVerticales
                , datosHorizontals, datos, PlotOrientation.HORIZONTAL, true, true, true);
        
        if (mostrar){
            ChartFrame frame = new ChartFrame("GraficoBarras", grafico);
            frame.pack();
            frame.setVisible(true);
        }
        
        ChartPanel graficoParaPanel = new ChartPanel(grafico);
        
        return graficoParaPanel;
         

    }
}
