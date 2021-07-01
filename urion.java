package fundamentos;

import java.util.Scanner;

public class urion {

	public static void main(String[] args) {

		double n = 3.14159;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do raio :");
		double raio = entrada.nextDouble();

		double area = n * Math.pow(raio, 2);
		System.out.printf( "A=%.4f",area);

		entrada.close();
	}

}
