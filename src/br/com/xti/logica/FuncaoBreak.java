/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.logica;

/**
 * Função Break, nesse caso para quando o resultado chegar a 5
 * Se substituir o Break por continue,  quando chegar à posição 5 ira pular ela e continuar
 * @author Administrator
 */
public class FuncaoBreak {
       public static void main(String args[]) {
    
    for (int i=0; i<10; i++) {
        if (i == 5){
            break; 
         }
         System.out.println(i);
       }
    
    } 
}
