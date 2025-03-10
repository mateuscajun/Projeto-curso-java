package fundamentos;

import java.util.Scanner;

public class Exercicio06 {
	/** 6.Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			System.out.println("Equa��o: ax� + bx + c = 0");
		
			System.out.println("\nDigite o valor de A: ");
			int a = entrada.nextInt();

			System.out.println("\nDigite o valor de B: ");
			int b = entrada.nextInt();

			System.out.println("\nDigite o valor de C: ");
			int c = entrada.nextInt();
			
			int delta = (b * b) - (4 * a * c);
			
			System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);
			
			System.out.println("\nO delta �: " + delta);
			
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);

			System.out.printf("O x1 da equa��o �: %.2f", x1);

			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.printf("\nO x2 da equa��o �: %.2f" ,x2);
			
		
		entrada.close();
	}
}
