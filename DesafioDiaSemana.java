package fundamentos;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite o nome do dia da semana :");
			
			String nomeDia = entrada.next();
			
			// ("domingo".equalsIgnoreCase(dia))
			if(nomeDia.equalsIgnoreCase("domingo")) {
				 System.out.println(1);
			} else if(nomeDia.equalsIgnoreCase("segunda")) {
				System.out.println(2);
			} else if(nomeDia.equalsIgnoreCase("terça") || nomeDia.equalsIgnoreCase("terca")) {
				System.out.println(3);
			}  else if(nomeDia.equalsIgnoreCase("quarta")) {
				System.out.println(4);
			}  else if(nomeDia.equalsIgnoreCase("quinta")) {
				System.out.println(5);
			}  else if(nomeDia.equalsIgnoreCase("sexta")) {
				System.out.println(6);
			}  else if(nomeDia.equalsIgnoreCase("sábado") || nomeDia.equalsIgnoreCase("sabado") ) {
				System.out.println(7);
			} else {
				System.out.println("Dia Inválido!");
			}
		
		entrada.close();
	}
}
