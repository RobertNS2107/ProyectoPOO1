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
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Usuario
 */
public class graficoPastel {
    
    private float[] listaNumeros; //lista de números se refiere a la parte contable de los datos, por ejemplo cantidad de terremotos
    private String[] listaPalabras;//Lista de palabras se refiere a la parte escrita del grafico, ejemplo magnitud o lugares de terremotos
    /*Las lista tienen que ir uno a uno, es decir el indice uno de la listaNumeros tiene que estar relacionado con el indice
    uno de la listaPalabras, ejemplo; listaNumeros[0] retorna 10, listaPalabras[0] retorna "cantidad de terremostos de maginitud
    3.2"
    */

    public graficoPastel(float[] listaNumeros, String[] listaPalabras) {
        this.listaNumeros = listaNumeros;
        this.listaPalabras = listaPalabras;
    }
    
    public ChartPanel graficar(String titulo, boolean mostrar){
        //titulos es el titulo que llevará la ventada del grafico
        // mostrar en caso de no querer usarlo en un jFrame para que se muestre directamente
        DefaultPieDataset datos = new DefaultPieDataset();
        
        for (int i = 0; i < listaNumeros.length; i++) 
            datos.setValue(listaPalabras[i],listaNumeros[i]);            
        
        JFreeChart grafico = ChartFactory.createPieChart(titulo,datos,true,true,false);
        
        // Mostrar 
        if (mostrar){
            ChartFrame frame = new ChartFrame("Gráfico de pastel", grafico);
            frame.pack();
            frame.setVisible(true);
        }
        
        ChartPanel graficoParaPanel = new ChartPanel(grafico);
        
        return graficoParaPanel;
        /*
        Lo que retorna la funcion grafica se puede agregar a un JPanel de una ventana cualquiera, lo que se tiene que hacer
        es lo siguiente
        digamos que el JPanel se llama panel
        panel.add(graficoParaPanel);
        y listo, se agregó al panel, no se exatamente como quedaria XD, pero se que funciona
        
        */
        
    }
    
    
    

    
    
}

