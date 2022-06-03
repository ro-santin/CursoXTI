/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoxti;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ArraySimples {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add("Vermelho");
        cores.add(0, "Amarelo"); //Isso adiciona a cor no local 0 do Array
        cores.add("Azul");
        cores.add("Rosa");
        System.out.println(cores.toString());
        
        System.out.println(cores.size()); //Mostra quantos elementos tem no Array
        System.out.println("O elemento 2 = " + cores.get(2)); //Recupera array no elemento 2
        System.out.println("Indice do elemento Branco = " + cores.indexOf("Branco")); //Pesquisa elemento especifico
        
        cores.remove("Azul"); //remove o elemento especificado
        
        //o comando abaixo faz a pesquisa sobre certo elemento e retorna verdadeiro ou falso
        System.out.println("Tem a cor Verde "+ cores.contains("Verde"));
        
        
    }
    
}
