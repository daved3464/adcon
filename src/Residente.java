
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hollow3464
 */
public class Residente extends Usuario{
    
    private ArrayList<Vivienda> Viviendas;
    private ArrayList<AreaComun> Areas_Reservadas;
    private ArrayList<Cuota> Cuotas;
    private Boolean Moroso;
    private int cuotasVencidas;
    
    public Residente(String nombre, String cedula, String username, String password) {
        super(nombre, cedula, username, password);
        this.Viviendas = new ArrayList();
        this.Areas_Reservadas = new ArrayList();
        this.Cuotas = new ArrayList();
        this.Moroso = false;
        this.cuotasVencidas=0;
    }
    public Residente(String nombre, String cedula, String username, String password, String moroso) {
        super(nombre, cedula, username, password);
        this.Viviendas = new ArrayList();
        this.Areas_Reservadas = new ArrayList();
        this.Cuotas = new ArrayList();
        if (moroso.equals(false)){
            this.Moroso = false;
        }
        else{this.Moroso = true;}
        
        this.cuotasVencidas=0;
    }
    
    public void checkSlowPayer(){
        do{
        for(Cuota cuota:Cuotas){
            if(cuota.getVencimientocuota().compareTo(new Date()) <0 ) {
                    this.cuotasVencidas++;               
                }
            }
        }
        while(cuotasVencidas !=0);
     if (cuotasVencidas > 0){
        Moroso = true; 
     }   
     
    }

    public ArrayList<Vivienda> getViviendas() {
        return Viviendas;
    }

    public void setViviendas(ArrayList<Vivienda> Viviendas) {
        this.Viviendas = Viviendas;
    }

    public ArrayList<AreaComun> getAreas_Reservadas() {
        return Areas_Reservadas;
    }

    public void setAreas_Reservadas(ArrayList<AreaComun> Areas_Reservadas) {
        this.Areas_Reservadas = Areas_Reservadas;
    }

    public ArrayList<Cuota> getCuotas() {
        return Cuotas;
    }

    public void setCuotas(ArrayList<Cuota> Cuotas) {
        this.Cuotas = Cuotas;
    }

    public Boolean getMoroso() {
        return Moroso;
    }

    public void setMoroso(Boolean Moroso) {
        this.Moroso = Moroso;
    }

    public int getCuotasVencidas() {
        return cuotasVencidas;
    }

    public void setCuotasVencidas(int cuotasVencidas) {
        this.cuotasVencidas = cuotasVencidas;
    }
    
    
}
