/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifElse;

/**
 *
 * @author Administrator
 */
public class Switch {
    public static void main(String[] args) {
        /**
         * Nabeira simplificada de fazer igualdades e comparações, porém com menos recursos que If Else
         */
        String sexo = "m";
        
        switch (sexo) {
        case "M":
            System.out.println("Macho");
        break;
        case "F":
            System.out.println("Femea");
        break;   
            default:
            System.out.println("Suspeito");
               
        }
             
    }
     
}
