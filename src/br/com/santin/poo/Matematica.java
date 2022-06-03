/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.santin.poo;

/**
 *
 * @author Administrator
 */
public class Matematica {
   
//    double raiz2 (double numero){ // Formula que eu pensei em fazer
//        double peel = 1;
//        for(int i =1; 1 <numero; i++){
//            double res = 0;
//            if (1 % 2 ==1){
//                res = numero -1;
//                numero = res;
//                peel++;
//            }
//        }
//       return peel;
//    } //Abaixo formula do professor
    
    int raiz(int numero){
        int raiz = 0, impar = 1;
        while(numero >= impar){
            numero -= impar;
            impar += 2;
            ++raiz;
        }
        return raiz;
    }
    
    int maior(int um, int dois){
        if( um > dois){
            return um;
        }else {
            return dois;
        }
    }
    
    double soma(double um, double dois){
        double s = um + dois;
        return s;
    }
    
    
}
