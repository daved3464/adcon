
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hollow3464
 */
public class Cuota {
    private Date vencimientoCuota;
    private Double ValorCuota;
    private Vivienda viviendaCuota;
    private Boolean Vencida;
    private Boolean Pagada;
    
    public Cuota(Date fecha, Double valor, Vivienda vivienda){
        
        this.vencimientoCuota=fecha;
        this.ValorCuota=valor;
        this.viviendaCuota = vivienda;
        this.Pagada=false;
        this.Vencida = false;
    
    }

    public Date getVencimientocuota() {
        return vencimientoCuota;
    }

    public void setVencimientocuota(Date fechacuota) {
        this.vencimientoCuota = fechacuota;
    }

    public Double getValorCuota() {
        return ValorCuota;
    }

    public void setValorCuota(Double ValorCuota) {
        this.ValorCuota = ValorCuota;
    }

    public Vivienda getViviendaCuota() {
        return viviendaCuota;
    }

    public void setViviendaCuota(Vivienda viviendaCuota) {
        this.viviendaCuota = viviendaCuota;
    }

    public Boolean getPagada() {
        return Pagada;
    }

    public void setPagada(Boolean Pagada) {
        this.Pagada = Pagada;
    }
            
}
