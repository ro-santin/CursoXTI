/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.santin.poo;

/**
 *
 * @author Administrator
 */
public class Conta {
    
    String cliente;
    double saldo;
    
    void exibeSaldo() {
        System.out.println(cliente + " seu saldo é:  R$ " + saldo + " Reais");
    }
    void saca(double valor){
    saldo = saldo - valor;                  /* Ver se tem autorização
// mesma coisa que fazer   saldo -= valor;  * se limite do dia não foi ultrapassado
                                            * se tem saldo na conta
                                            * deduzir do saldo o valor sacado
                                            * atualizado registros do banco
                                            * entregar o dinheiro ao cliente
                                            */
    }   
    void deposito(double valor){
        saldo += valor;
    }
    
    void transferePara(Conta destino, double valor){
        this.saca(valor);
        destino.deposito(valor);
    }
    
}
