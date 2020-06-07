
package graficadores;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class graficoBarras {
     private float[] listaNumeros; 
     private String[] listaPalabras;
     /**
     *@param listaNumeros float[]
     *@param listaPalabras String[] 
     */
     public graficoBarras(float[] listaNumeros, String[] listaPalabras) {
        this.listaNumeros = listaNumeros;
        this.listaPalabras = listaPalabras;
    }
    
     
     /**
     *@param titulo String 
     *@param mostrar bolean , si es true muestra la ventana
     *@param datosHorizontales String  Nombre de los datos horizontales
     *@param datosVerticales String  Nombre de los datos verticales
     *@return ChartPanel para agregarlo a otra ventana en caso de requerirlo
     */
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
