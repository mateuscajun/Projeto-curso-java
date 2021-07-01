package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seus três últmos salários");
		
		System.out.println("Digite o último salário :");
		String Salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o penúltimo salário :");
		String Salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o antepenúltimo salário :");
		String Salario3 = entrada.next().replace(",", ".");
		
		
		float numero1 = Float.parseFloat(Salario1);
		float numero2 = Float.parseFloat(Salario2);
		float numero3 = Float.parseFloat(Salario3);
		
		float soma = numero1 + numero2 + numero3;
		System.out.println("A soma dos últimos três salários é : " + soma);
		System.out.println("A média dos últimos três salários é : " + soma / 3);
		
		entrada.close();
		
		
	}

}
