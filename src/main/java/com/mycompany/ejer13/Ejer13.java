
package com.mycompany.ejer13;

import javax.swing.JOptionPane;

/**
 Un programa que obtiene la última cifra de un número introducido.
 */
public class Ejer13 {

    public static void main(String[] args) {
        int numero, uCifra; 
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: ")); 
        
        uCifra = Math.abs(numero) % 10 ; 
        JOptionPane.showMessageDialog(null, "El numero es: "+numero+"\nLa ultima cifra es: "+uCifra);
        
        
    }
}
