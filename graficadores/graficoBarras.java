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
    
    public ChartPanel graficar(String titulo,boolean mostrar, String datosHorizontales, String datosVerticales){
        
        DefaultCategoryDataset  datos = new DefaultCategoryDataset();
        
        for (int i = 0; i < listaNumeros.length; i++) {
            datos.setValue(listaNumeros[i],listaPalabras[i], "");            
        }
        
        JFreeChart grafico = ChartFactory.createBarChart(titulo, datosVerticales
                , datosHorizontales, datos, PlotOrientation.HORIZONTAL, true, true, true);
        
        if (mostrar){
            ChartFrame frame = new ChartFrame("GraficoBarras", grafico);
            frame.pack();
            frame.setVisible(true);
        }
        
        ChartPanel graficoParaPanel = new ChartPanel(grafico);
        
        return graficoParaPanel;
         

    }
}
