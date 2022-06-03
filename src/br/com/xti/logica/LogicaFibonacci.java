/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.logica;

/**
 *
 * @author Administrator
 */
public class LogicaFibonacci {
    
     public static void main(String args[]) {
      int anterior = 1;
      int proximo = 2;
      System.out.println(anterior);
      
      while(proximo <145) {
          System.out.println(proximo);
          proximo = proximo + anterior;
          anterior = proximo - anterior; 
          
      //    p = 2  + 1  = 3
    //      a = 3  - 1  = 2
     //     p = 3  + 2  = 5
      //    a = 5  - 2  = 3
    //      p = 5  + 3  = 8
     //     a = 8  - 3  = 5
      //    p = 8  + 5  = 13
    //      a = 13 - 5  = 8
     //     p = 13 + 8  = 21
      //    a = 21 - 8  = 13
    //      p = 21 + 13 = 34
     //     a = 34 - 13 = 21
      //    p = 34 + 21 = 55
    //      a = 55 - 21 = 34
     //     p = 55 + 34 = 89
      //    a = 89 - 34 = 55
    //      p = 89 + 55 = 144
     //     a = 144- 55 = 89
                                            
                                
      }
    }   
    
    
    
}
