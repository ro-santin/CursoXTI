package br.com.santin.poo;
//algo inúti que não e usado, é uma forma de Exception que segundo o professor é usada somente Na época da programação
// não é correto usa-la após código pronto
import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um numero de 0 a 10");;
		int numero = s.nextInt();
		
		assert (numero >= 0 && numero <= 10) : "Numero inválido " + numero;
		System.out.println("Você entrou com o número " + numero);
		s.close();
	}

}
