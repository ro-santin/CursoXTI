/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.santin.poo;

/**
 *
 * @author Administrator
 */
public class CachorroTest {
  
    public static void main(String[] args) {
        
        Cachorro pitbull = new Cachorro();
        pitbull.raça = "Pit Bull";
        pitbull.tamanho = 40;
        pitbull.latir();
        
        Cachorro viralata = new Cachorro();
        viralata.raça = "Vira-lata";
        viralata.tamanho = 30;
        viralata.latir();
    }
    
}
