/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifElse;

/**
 *O desafio foi iniciar uma sére com zero e um e obter o próximo número Fibonacci somando-se os 
 * dois números anteriores e, assim sucessivamente, para não ter loop infinito mandou ir até 50
 * exemplo foi 1+2[3]   2+3[5]  3+5[8]  5+8[13] 8+13[23] ...
 *
 */
public class DesafioFibonacci {
    public static void main(String[] args) {
    
       int anterior = 0;
       int proximo = 1;
        System.out.println(anterior);
        
        while(proximo < 50) {
            System.out.println(proximo);
        proximo = proximo + anterior;
        anterior = proximo - anterior;
        }
    }   
}

