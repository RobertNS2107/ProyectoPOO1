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
public class datosTablaMagnitud {
    
    public String[][]  clasificar(ArrayList<Sismo> listaSismos){
        
        String[] micro; 
        String[] menor;
        String[] ligero;
        String[] moderado;
        String[] fuerte;
        String[] mayor;
        String[] gran;
        String[] epico;
                
        float magnitud;
        
        int microN = 0;
        int menorN = 0;
        int ligeroN = 0;
        int moderadoN = 0;
        int fuerteN = 0;
        int mayorN = 0;
        int granN = 0;
        int epicoN = 0;
        
        
        for (int i = 0; i < listaSismos.size(); i++) {
            magnitud = listaSismos.get(i).getMagnitud();
            
            if(magnitud < 2)
                microN++;
            else if(magnitud <4 )
                menorN++;
            else if(magnitud <5)
                ligeroN++;
            else if(magnitud <6)
                moderadoN++;
            else if(magnitud <7)
                fuerteN++;
            else if(magnitud <8)
                mayorN++;
            else if(magnitud <9)
                granN++;
            else 
                epicoN++;
            
            
        }
        if(microN != 0)
            micro = new String[microN];
        else{
            micro = new String[1];
            micro[0] = "<html>No hay datos de Sismos micros<html>";
        }
        
        if(menorN != 0)
            menor = new String[menorN];
        else{
            menor = new String[1];
            menor[0] = "<html>No hay datos de Sismos menores<html>";
        }
        
        if(ligeroN != 0)
            ligero = new String[ligeroN];
        else{
            ligero = new String[1];
            ligero[0] = "<html>No hay datos de Sismos ligeros<html>";
        }
        
        if(moderadoN != 0)
            moderado = new String[moderadoN];
        else{
            moderado = new String[1];
            moderado[0] = "<html>No hay datos de Sismos moderados<html>";
        }
        
        if(fuerteN != 0)
            fuerte = new String[fuerteN];
        else{
            fuerte = new String[1];
            fuerte[0] = "<html>No hay datos de Sismos fuertes<html>";
        }

        if(mayorN != 0)
            mayor = new String[mayorN];
        else{
            mayor = new String[1];
            mayor[0] = "<html>No hay datos de Sismos mayores<html>";
        }
        
        if(granN != 0)
            gran = new String[granN];
        else{
            gran = new String[1];
            gran[0] = "<html>No hay datos de Sismos grandes<html>";
        }
        
        if(epicoN != 0)
            epico = new String[epicoN];
        else{
            epico = new String[1];
            epico[0] = "<html>No hay datos de Sismos epicos<html>";
        }
        
        microN = 0;
        menorN = 0;
        ligeroN = 0;
        moderadoN = 0;
        fuerteN = 0;
        mayorN = 0;
        granN = 0;
        epicoN = 0;
        
        for (int i = 0; i < listaSismos.size(); i++) {
            magnitud = listaSismos.get(i).getMagnitud();
            
            if(magnitud < 2){
                micro[microN] = (listaSismos.get(i)).toString();
                microN++;
            }
            else if(magnitud <4){
                menor[menorN] = (listaSismos.get(i)).toString();
                menorN++;
            }
            else if(magnitud <5){
                ligero[ligeroN] = (listaSismos.get(i)).toString();
                ligeroN++;
            }
            else if(magnitud <6){
                moderado[moderadoN] = (listaSismos.get(i)).toString();
                moderadoN++;
            }
            else if(magnitud <7){
                fuerte[fuerteN] = (listaSismos.get(i)).toString();
                fuerteN++;
            }
            else if(magnitud <8){
                mayor[mayorN] = (listaSismos.get(i)).toString();
                mayorN++;
            }
            else if(magnitud <9){
                gran[granN] = (listaSismos.get(i)).toString();
                granN++;
            }
            else {
                epico[epicoN] = (listaSismos.get(i)).toString();
                epicoN++;
            }
            
            
        }

        String[][] listafinal = {micro,menor,ligero,moderado,fuerte,mayor,gran,epico};

        
        return listafinal;
        

    }


    

}
