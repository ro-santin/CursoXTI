/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.logica;

/**
 *
 * @author Administrator
 */
public class RotuloComBreak2 {
     public static void main(String args[]) {
    
    boolean [] [] matrix =
    {
        {false, true,  false, false, false},
        {false, false, false, false, false}
    };
    busca: //rotulo usado, pode ser qualquer nome
    for ( int a=0; a<matrix.length; a++){
        System.out.print("A "); 
        for (int b=0; b<matrix[a].length; b++){ //Localizar o elemento que tenha valor igual a TRUE
            if (matrix[a][b]){ //Leia-se esse código assim "Se dentro do array [a] na primeira dimensão for TRUE, na linha de baixo imprime TRUE"
                System.out.print("TRUE ");
                break busca; //usado break aqui vai para porém quebra o fluxo soment do primeiro for
            } // pode ser usado continue com rotulos também
            System.out.print("B ");
        }
    }
    
    }   
}
