package br.com.santin.poo;

public class SenhaTeste {
	
	static void autenticar(String senha) throws SenhaInvalidaException {
		if ("123".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
		} else {
			//senha é incorreta
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}
	
	
	public static void main(String[] args) {
			try {
				autenticar("1234"); //caso senha esteja correta, da msg senha correta, caso contrário incorreta
				
			}catch (SenhaInvalidaException e) {
				e.printStackTrace();  //usado para printar linha do erro
				System.out.println(e.getLocalizedMessage());
			}
	}

}
