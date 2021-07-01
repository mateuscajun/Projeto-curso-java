package fundamentos;

import java.util.Scanner;

public class Exercicio02 {
	/** 2.Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
			System.out.printf("DIgite a temperatura em Fahrenheit : ");
			double temp = entrada.nextDouble();
			
			System.out.printf("A temperatura em Celsius é : " +( temp - 32 ) / 1.8  + " °C");
			
		
		
		entrada.close();
	}
}
