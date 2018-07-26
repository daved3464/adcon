/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria.brand
 */
public class Vivienda {
    String numeroVivienda;
    String tipoVivienda;
    Double valorCuotas;
    Residente Dueño;
    

    public Vivienda(String numeroVivienda, String tipoVivienda) {
        this.numeroVivienda = numeroVivienda;
        this.tipoVivienda = tipoVivienda;
    }
    public Vivienda(String numeroVivienda, String tipoVivienda, Residente Dueño) {
        this.numeroVivienda = numeroVivienda;
        this.tipoVivienda = tipoVivienda;
        this.Dueño = Dueño;
    }

    public String getNumeroVivienda() {
        return numeroVivienda;
    }

    public void setNumeroVivienda(String numeroVivienda) {
        this.numeroVivienda = numeroVivienda;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }
    public Residente getDueño(){
        return Dueño;
    }
    public void setDueño(Residente Dueño){
        this.Dueño = Dueño;
    }
    
    
}
