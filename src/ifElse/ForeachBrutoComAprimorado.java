/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifElse;

/**
 *
 * @author Administrator
 */
public class ForeachBrutoComAprimorado {
    
   public static void main(String args[]) { 

    /* foreach BRUTO*/ 
    int[] pares = {2, 4, 6, 8};
    for(int i=0; i<pares.length; i++){
      int par = pares[i];
      System.out.println(par);
    } // Codigo acima é o for normal e abaixo o aprimorado
//    int[] pares = {2, 4, 6, 8};
//    for (int par : pares) { //lido da seguinte maneira: percorra cada elemento do tipo int existente dentro de pares 
//      System.out.println(par);
//        }   
    }   
}
