/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.logica;

/**
 *
 * @author Administrator
 */
public class comparaIdade {
    public static void main(String[] args) {
        
        int idade = 11;
        
        if(idade <= 11){
            System.out.println("Pia");
        }else if (idade > 11 && idade <= 18)    {
            System.out.println("Aborrecente");
        } else if (idade > 18 && idade <= 60)   {
            System.out.println("Gaga");
        } else if (idade > 60 )                 {
            System.out.println("Pelanca");
        }
                
    }
    
}
