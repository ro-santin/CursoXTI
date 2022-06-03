/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifElse;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JogoDados {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Que numero acha que vai cair?");
        
        int Palpite = s.nextInt();
        
         int [] dado = {1, 2, 3, 4, 5, 6};
                
         Random r = new Random();
         
        int dadoJogado = r.nextInt(dado.length);
                
        System.out.println("Saiu o numero " + dadoJogado);
        
        if(Palpite == dadoJogado){
            System.out.println("parabens, acertou");
        }else {
            System.out.println("Errou");
        s.close();
    }
  } 
}
