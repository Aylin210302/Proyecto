/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sc202.leo4dowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author 50685
 */
public class Lec04dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        int opcion = 0;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer" + "numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo" + "numero"));
        
        JOptionPane.showMessageDialog(null, "Digite cual operacion" + "desea realizar");
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Suma " + "2. Resta 3. Multiplicacion 0. Salir"));
         
            switch(opcion){
                case 1:
                  resultado = numero1 + numero2;
                  JOptionPane.showMessageDialog(null, "El resultado" + "De la suma es" +resultado);
                  break;
                case 2:
                  resultado = numero1 - numero2;
                  JOptionPane.showMessageDialog(null, "El resultado" + "De la resta es" +resultado);
                  break; 
                case 3:
                    resultado = numero1 * numero2;
                  JOptionPane.showMessageDialog(null, "El resultado" + "De la multiplicacion es" +resultado);
                  break;  
                  
               
             
            }//fin del switch
        } while(opcion!=0);
        
        
        
    }//fin del main
    
}//fin de la clase
