/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.logica;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class ExemploArrayWhile {
    
      public static void main(String[] args) { 

  /* EXEMPLO ARRAY USANDO WHILE */

    ArrayList<String> produtos = new ArrayList<String>();
    Scanner s = new Scanner(System.in);
    System.out.println("Liste seus produtos : Para sair digite FIM");

    String produto;

    while (!"FIM".equals(produto = s.nextLine())){
      produtos.add(produto);
    }
    System.out.println(produtos.toString());
    
  }
    
}
