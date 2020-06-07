package graficadores;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class histograma {
    private float[] listaNumerosEjeX; 
    private float[] listaNumerosEjeY; 

    
    /**
    *@param listaNumerosEjeX float[] 
    *@param listaNumerosEjeY float[]  
    */
    public histograma(float[] listaNumerosEjeX, float[] listaNumerosEjeY) {
        this.listaNumerosEjeX = listaNumerosEjeX;
        this.listaNumerosEjeY = listaNumerosEjeY;
    }
    
    /**
    *@param titulo String 
    *@param mostrar bolean , si es true muestra la ventana
    *@param nombreEJeX String 
    *@param nombreEJeY String 
    *@param nombreDatos String 
    *@return ChartPanel para agregarlo a otra ventana en caso de requerirlo
    */
    public ChartPanel graficar(String titulo, boolean mostrar, String nombreEJeX,String nombreEJeY, String nombreDatos){

        
        XYSeriesCollection datos = new XYSeriesCollection ();
        
        XYSeries serieXY = new XYSeries(nombreDatos);
        
        for (int i = 0; i < listaNumerosEjeX.length; i++) {
            serieXY.add(listaNumerosEjeX[i],listaNumerosEjeY[i]);
        }
        
        datos.addSeries(serieXY);
        
        JFreeChart grafico = ChartFactory.createHistogram(titulo, nombreEJeX, nombreEJeY, datos,
                PlotOrientation.VERTICAL, true, true, false);
        
        
        XYPlot linea = grafico.getXYPlot();
        XYLineAndShapeRenderer estilos = new XYLineAndShapeRenderer();
        estilos.setSeriesPaint(0, Color.RED);
        estilos.setSeriesStroke(0, new BasicStroke(2.0f));
        linea.setRenderer(estilos);
        linea.setBackgroundPaint(Color.white);
        linea.setRangeGridlinesVisible(true);
        linea.setRangeGridlinePaint(Color.BLACK);
        linea.setDomainGridlinesVisible(true);
        linea.setDomainGridlinePaint(Color.BLACK);
        
        grafico.getLegend().setFrame(BlockBorder.NONE);
        grafico.setTitle(new TextTitle(titulo,
                new Font(titulo, java.awt.Font.BOLD, 18))); 
        
        
        if (mostrar){
            ChartFrame frame = new ChartFrame("Histograma", grafico);
            frame.pack();
            frame.setVisible(true);
            
            ChartPanel chartPanel = new ChartPanel(grafico);
            chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            chartPanel.setBackground(Color.white);
            chartPanel.setVisible(true);
            
        }
        
        ChartPanel graficoParaPanel = new ChartPanel(grafico);
        return graficoParaPanel;      
    }


    
}
