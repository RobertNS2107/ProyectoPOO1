/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadores;

import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Graficadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sismo sismo = new Sismo("13-Mar-2020", "15:53:00", 4f, 8f, "50km al suroeste de Jaco"
                , "Tectonico por subducción", "Playa Hermosa de Garabito, Puntarenas", 9.22f, -84.55f);
        
        Sismo sismo2 = new Sismo("12-Mar-2020", "22:46:39", 5.34f, 25.45f, "6.13 Km al hacia el Noreste de Puerto Armuelles Panamá"
                , "Subducción de la placa de Nazca por debajo de la micro placa de Panama"
                , "Corredores de Puntarenas, Puerto Armuelles, Golfito, Puerto Jiménez, El Valle Central: Alajuela, Heredia, Escazú"
                , 8.289f, -82.81f);
        
        ArrayList listaSismo = new ArrayList();
        listaSismo.add(sismo);
        listaSismo.add(sismo2);
        listaSismo.add(sismo2);
        listaSismo.add(sismo2);
        listaSismo.add(sismo2);
        
//        Ejemplo de la tabla de clasificación por magnitud
//        ClasfSismosMagn ventana = new ClasfSismosMagn(listaSismo);
//        ventana.setVisible(true);
        
//        Ejemplo de la tabla de clasificación por fecha
//        ClasfSismoFecha ventana = new ClasfSismoFecha(listaSismo, "2019-01-12", "2021-01-03");
//        ventana.setVisible(true);


//        Ejemplo del grafico de barras
//        float[] listaNum = {1,2,3,4,5,6,7,8,9,10,11,12};
//        String[] listaPalabras = {"Enero", "Febrero", "Marzo", "Abril" , "Mayo", "Junio", "Julio", "Agosto", "Septiembre"
//                , "Octubre", "Nombiembre" ,"Diciembre"};
//        graficoBarras grafico = new graficoBarras(listaNum, listaPalabras);
//        grafico.graficar("No se que", true, "Meses", "Cantidad Sismos");

//        Ejemplo de grafico pastel        
//        float[] listaNum = {5,2,3};
//        String[] listaPalabras = {"Subduccion", "Induccion", "Falla local"};
//        graficoPastel grafico = new graficoPastel(listaNum, listaPalabras);
//        grafico.graficar("Ejemplo", true);
        
        
    }
    
}
