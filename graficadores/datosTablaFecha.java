
package graficadores;

import java.util.ArrayList;


public class datosTablaFecha {

    /** 
    *Constructor de los datos para la tabla ordena por fecha
    * @param listaSismos ArrayList de tipo Sismo 
    * @param fechaF String 
    * @param fechaIn String 
    * @return String[][]
    * Utiliza una funcion privada para comparar las fechas
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
        /**Funcion que compara tres fechas para determinar si se encuentrar dentro de un rango en específico*/
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
