package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia C";
		s = s.replace("C", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!!!");

		System.out.println(s);
		
		String x = "Mateus".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Brasil")
				.toUpperCase()
				.concat("!!!!!!!");
		System.out.println(y);
	
	// Tipos primitivos n�o tem o operador "."
	int a = 3;
	System.out.println(a);
	
	}
}
