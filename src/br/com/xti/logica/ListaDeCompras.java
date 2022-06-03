package br.com.xti.logica;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ListaDeCompras {
   public static void main(String[] args) { 

  /* FALTA TERMINAR */

  //String Palpite = JOptionPane.showInputDialog("Informe o número desejado");
    ArrayList<String> produtos = new ArrayList<String>();
    Scanner s = new Scanner(System.in);
    System.out.println("Liste seus produtos : Para sair digite FIM");

    String produto;

    while (!"FIM".equals(produto = s.nextLine())){
      produtos.add(produto);
    }
    System.out.println(produtos.toString());
    s.close();
  }  
}
