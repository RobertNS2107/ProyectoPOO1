/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadores;

/**
 *
 * @author Usuario
 */
public class Sismo {
    private String fecha;
    /* La fecha por obligacion tiene que venir en formato aaaa-mm-dd, y 
    específicamente separado con un "-", tambien los mese y días tienen que son menores a 10 tienen que venir con 0
    */
    
    private String hora;
    private float magnitud;
    private float profundidad;
    private String localizacion;
    private String origen;
    private String reportado;
    private float latitud;
    private float longitud;


    public Sismo(String fecha, String hora, float magnitud, float profundidad, String localizacion, String origen, String reportado, float latitud, float longitud) {
        /* La fecha por obligacion tiene que venir en formato aaaa-mm-dd, y 
        específicamente separado con un "-", tambien los mese y días tienen que son menores a 10 tienen que venir con 0
        */
        this.fecha = fecha;
        this.hora = hora;
        this.magnitud = magnitud;
        this.profundidad = profundidad;
        this.localizacion = localizacion;
        this.origen = origen;
        this.reportado = reportado;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "<html>Fecha:" + fecha + "<p> Hora:" + hora + "<p> Magnitud:" 
                + magnitud + "<p> Profundidad:" + profundidad + "<p> Localizacion:" 
                + localizacion + "<p> Origen:" + origen + "<p> Reportado:" + reportado 
                + "<p> Latitud:" + latitud + "<p> Longitud:" + longitud +" <html>";
    }
    
    public String toStringPegado(){
        return fecha + "mmmmm" + hora + "mmmmm" + magnitud + "mmmmm" +  profundidad + "mmmmm" + localizacion
                + "mmmmm" + origen + "mmmmm" + reportado + "mmmmm" + latitud + "mmmmm" + longitud;
    }
    
  

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(float magnitud) {
        this.magnitud = magnitud;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getReportado() {
        return reportado;
    }

    public void setReportado(String reportado) {
        this.reportado = reportado;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
    
    
    
    
}
