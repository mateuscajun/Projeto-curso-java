package fundamentos;

import java.util.Scanner;

public class Exercicio05 {
	/** 5.Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o valor da base do tri�ngulo : ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite a altura do tri�ngulo : ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A �rea do Tri�ngulo � : " + area);
		
		
		entrada.close();
	}
}
