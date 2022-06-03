/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifElse;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class JogoDadoTela {
    
    public static void main(String[] args) {
        
        String Palpite = JOptionPane.showInputDialog("Informe o número desejado");
        
        int convertePalpite = Integer.parseInt(Palpite);
        
        Random r = new Random();
        
        int dado = r.nextInt(6)+1;
         
         System.out.println("Seu Palpite foi " + Palpite); 
         JOptionPane.showMessageDialog(null, "Saiu o numero " + dado);
        System.out.println("Saiu o numero " + dado);
        
        if(convertePalpite == dado){
            System.out.println("parabens, acertou");
            JOptionPane.showMessageDialog(null, "parabens, acertou");
        }else {
            System.out.println("Errou");
            JOptionPane.showMessageDialog(null, "Errou");
         
        }
    } 
}
