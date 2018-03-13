package sueldo;


import javax.swing.JOptionPane;
import sueldo.horas_trabaja;

public class Sueldo {

    public static void main(String[] args) {
        
        horas_trabaja h1 = new horas_trabaja ();
        
       double sueldos;
       int horas;
       double pagoh;
       
       horas = Integer.parseInt(JOptionPane.showInputDialog("diga las horas trabajadas"));
       pagoh = Double.parseDouble(JOptionPane.showInputDialog("diga el valor de la hora"));
       
       if(h1.getHoras_trabaja() < 40 ){
          horas = (int) (horas * pagoh * 5) ;
          System.out.println("el saldo a pagar es : " + horas);
       }else
           if(h1.getPago_x_horas() >= 40){
             horas = (int)(horas * Math.pow(pagoh,2)) * 5 ; 
             sueldos = h1.getPago_semanal() + horas ;
             System.out.println("el saldo a pagar es : " + sueldos);
           }
        
    }
    
}
