package fundamentos;

import java.util.Scanner;

public class Exercicio04 {
	/** 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.*/
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite o valor : ");
			double valor = entrada.nextDouble();
			
			double quadrado = Math.pow(valor, 2);
			double cubo = Math.pow(valor, 3);
			
			System.out.print("O valor ao quadrado � : " + quadrado + "\n O valor ao cubo � : " + cubo);
		
		
		
		entrada.close();
	}
}
