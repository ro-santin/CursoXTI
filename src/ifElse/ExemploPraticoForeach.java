/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifElse;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ExemploPraticoForeach {
    
    public static void main(String args[]) { 

  ArrayList <Integer> list = new ArrayList<Integer>();
    for(int i=0; i<10; i++) {
      list.add(i);
    }
    for (Integer numero : list) {
      System.out.println(numero);
      }
    }
}