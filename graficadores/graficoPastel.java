package graficadores;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class graficoPastel {
    
    private float[] listaNumeros; 
    private String[] listaPalabras;
    /**
    *@param listaNumeros float[] 
    *@param listaPalabras String 
    */
    public graficoPastel(float[] listaNumeros, String[] listaPalabras) {
        this.listaNumeros = listaNumeros;
        this.listaPalabras = listaPalabras;
    }
    /**
     *@param titulo String 
     *@param mostrar bolean , si es true muestra la ventana
     *@return *ChartPanel para agregarlo a otra ventana en caso de requerirlo
    */
    public ChartPanel graficar(String titulo, boolean mostrar){

        DefaultPieDataset datos = new DefaultPieDataset();
        
        for (int i = 0; i < listaNumeros.length; i++) 
            datos.setValue(listaPalabras[i],listaNumeros[i]);            
        
        JFreeChart grafico = ChartFactory.createPieChart(titulo,datos,true,true,false);
        

        if (mostrar){
            ChartFrame frame = new ChartFrame("Gráfico de pastel", grafico);
            frame.pack();
            frame.setVisible(true);
        }
        
        ChartPanel graficoParaPanel = new ChartPanel(grafico);
        
        return graficoParaPanel;

        
    }
    
    
    

    
    
}

