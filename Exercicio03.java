package fundamentos;

import java.util.Scanner;

public class Exercicio03 {
	/** 3.Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.  */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
			System.out.println("--Calculo de IMC--");
			
			System.out.printf("Digite sua altura : ");
			double altura = entrada.nextDouble();
			System.out.printf("Digite seu peso : ");
			double peso = entrada.nextDouble();
			
			
			
			System.out.printf("O seu IMC é : " + peso / (altura * altura)  );
					
		
		entrada.close();
		
	}
	
}
