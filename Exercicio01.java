package fundamentos;

import java.util.Scanner;

public class Exercicio01 {
	/** 1.Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			System.out.printf("Digite � temperatura em celsius : ");
			double temp = entrada.nextDouble();
			
			System.out.printf("A temperatura em Fahrenheit � : " + (((temp * 9) / 5) + 32) + " �F ");

		
		entrada.close();
	}

}
