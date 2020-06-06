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
public class datosTablaFecha {
    /* La fecha por obligacion tiene que venir en formato aaaa-mm-dd, y 
    específicamente separado con un "-", tambien los mese y días tienen que son menores a 10 tienen que venir con 0
    */
    public String[][]  clasificar(ArrayList<Sismo> listaSismos, String fechaIn, String fechaF){
        String[] fechaInicio = fechaIn.split("-");
        String[] fechaFin = fechaF.split("-");
        
        ArrayList<Sismo> lista = new ArrayList();
        

        String[] arrayDatos;
        
        for (int i = 0; i < listaSismos.size(); i++) {
            
            arrayDatos = listaSismos.get(i).getFecha().split("-");
            
            if(compararFechas(fechaInicio, fechaFin, arrayDatos))
               lista.add(listaSismos.get(i));
            
        }
        String[][] listaFinal = new String[lista.size()][];
        
        for (int i = 0; i < lista.size(); i++) {
            listaFinal[i] = lista.get(i).toStringPegado().split("mmmmm");            
        }
        return listaFinal;
    
    }
    
    private boolean compararFechas(String[] fechaInicio, String[] fechaFin, String[] fechaComparar){
        if(Integer.parseInt(fechaInicio[0].replaceAll(" ", "")) <  Integer.parseInt(fechaComparar[0].replaceAll(" ", "")) && 
                    Integer.parseInt(fechaFin[0].replaceAll(" ", "")) >  Integer.parseInt(fechaComparar[0].replaceAll(" ", "")))
            return true;
        else if((Integer.parseInt(fechaInicio[0].replaceAll(" ", "")) ==  Integer.parseInt(fechaComparar[0].replaceAll(" ", "")) || 
                    Integer.parseInt(fechaFin[0].replaceAll(" ", "")) == Integer.parseInt(fechaComparar[0].replaceAll(" ", ""))))
        {
            if(Integer.parseInt(fechaInicio[1].replaceAll(" ", "")) <  Integer.parseInt(fechaComparar[1].replaceAll(" ", "")) && 
                    Integer.parseInt(fechaFin[1].replaceAll(" ", "")) >  Integer.parseInt(fechaComparar[1].replaceAll(" ", "")))
                return true;
            else if((Integer.parseInt(fechaInicio[1].replaceAll(" ", "")) ==  Integer.parseInt(fechaComparar[1].replaceAll(" ", "")) || 
                    Integer.parseInt(fechaFin[1].replaceAll(" ", "")) == Integer.parseInt(fechaComparar[1].replaceAll(" ", ""))))
            {
                if(Integer.parseInt(fechaInicio[2].replaceAll(" ", "")) <  Integer.parseInt(fechaComparar[2].replaceAll(" ", "")) && 
                    Integer.parseInt(fechaFin[2].replaceAll(" ", "")) >  Integer.parseInt(fechaComparar[2].replaceAll(" ", "")))
                    return true;
                else if((Integer.parseInt(fechaInicio[2].replaceAll(" ", "")) ==  Integer.parseInt(fechaComparar[2].replaceAll(" ", "")) || 
                    Integer.parseInt(fechaFin[2].replaceAll(" ", "")) == Integer.parseInt(fechaComparar[2].replaceAll(" ", ""))))
                    return true;
            }
        }
        

        return false;
                
    }        
}
