package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	public static void dividir(Scanner s) 
		throws InputMismatchException, ArithmeticException
	
	{
	
		System.out.println("Numero: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		
		int b = s.nextInt();
		System.out.println(a/b);
		
	}
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		do {
			
			try {
				
				dividir(s);
				
				continua = false;

				}
				catch (InputMismatchException e1) {
					System.err.println("Somente números inteiros");
					s.nextLine(); //Descarta a entrada errada e volta a pedir primeiro numero
				}
				catch (ArithmeticException e2) {
					System.err.println("Informar valores divisiveis");
				}
			finally { //Independente de erro ser tratado ou não o finally sempre é executado
				System.out.println("Finally executado"); // e estando nesta posiçã, vai ser executado sempre após o erro
			}
						
		} while (continua);
			
		
		
		
		// InputMismatchException 	caso entre com letras ao inves de numeros
		// ArithmeticException 		Caso sejam informados valores não calculáveis
		// try = tente     catch = 
		
		
		
		
	}

}
