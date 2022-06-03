/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.santin.poo;

/**
 *
 * @author Administrator
 */
public class ContaTest {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.cliente   = "Ricardo";
        conta.saldo     = 10_000.00;
        conta.exibeSaldo();
        
        conta.saca (1000);
        conta.exibeSaldo();
        
        conta.deposito(500);
        conta.exibeSaldo();
        
        Conta destino = new Conta();
        destino.cliente = "Caio";
        destino.saldo = 8_000.00;
        destino.exibeSaldo();
        
        conta.transferePara(destino, 1500);
        destino.exibeSaldo();
        conta.exibeSaldo();
        
        
    }
}
