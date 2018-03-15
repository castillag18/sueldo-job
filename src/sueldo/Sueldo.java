package sueldo;

import javax.swing.JOptionPane;
import sueldo.horas_trabaja;

public class Sueldo {

    public static void main(String[] args) {

        horas_trabaja h1 = new horas_trabaja();

        h1.setHoras_trabaja(Integer.parseInt(JOptionPane.showInputDialog("diga las horas trabajadas")));
        h1.setPago_x_horas(Double.parseDouble(JOptionPane.showInputDialog("diga el valor de la hora")));
        h1.getPagoSemanal();
        
    }

}
