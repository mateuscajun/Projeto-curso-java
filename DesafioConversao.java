package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seus tr�s �ltmos sal�rios");
		
		System.out.println("Digite o �ltimo sal�rio :");
		String Salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o pen�ltimo sal�rio :");
		String Salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o antepen�ltimo sal�rio :");
		String Salario3 = entrada.next().replace(",", ".");
		
		
		float numero1 = Float.parseFloat(Salario1);
		float numero2 = Float.parseFloat(Salario2);
		float numero3 = Float.parseFloat(Salario3);
		
		float soma = numero1 + numero2 + numero3;
		System.out.println("A soma dos �ltimos tr�s sal�rios � : " + soma);
		System.out.println("A m�dia dos �ltimos tr�s sal�rios � : " + soma / 3);
		
		entrada.close();
		
		
	}

}
