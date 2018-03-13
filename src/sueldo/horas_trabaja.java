/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

/**
 *
 * @author orlando
 */
public class horas_trabaja {
    
    private double pago_semanal;
    private int horas_trabaja;
    private double pago_x_horas;

    public horas_trabaja(double pago_semanal, int horas_trabaja, double pago_x_horas) {
        this.pago_semanal = pago_semanal;
        this.horas_trabaja = horas_trabaja;
        this.pago_x_horas = pago_x_horas;
    }

    public horas_trabaja() {
    }

    public double getPago_semanal() {
        return pago_semanal;
    }

    public void setPago_semanal(double pago_semanal) {
        this.pago_semanal = pago_semanal;
    }

    public int getHoras_trabaja() {
        return horas_trabaja;
    }

    public void setHoras_trabaja(int horas_trabaja) {
        this.horas_trabaja = horas_trabaja;
    }

    public double getPago_x_horas() {
        return pago_x_horas;
    }

    public void setPago_x_horas(double pago_x_horas) {
        this.pago_x_horas = pago_x_horas;
    }
    
    
}
