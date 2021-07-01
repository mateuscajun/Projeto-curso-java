package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Olá".charAt(2));

		String s = "Bom tarde";
		System.out.println(s.concat("!!!!!"));
		System.out.println(s + "!!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Mateus";
		var sobrenome = "Chaves";
		var idade = 28;
		var salario = 7874.911;

		System.out.println(
				"Nome : " + nome + "\nSbrenome :" + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

		String maisUmaFrase = "Nome : " + nome + "\nSbrenome :" + sobrenome + "\nIdade: " + idade + "\nSalario: "
				+ salario + "\n\n";
		System.out.println(maisUmaFrase);

		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

		System.out.println(frase);

		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}

}
