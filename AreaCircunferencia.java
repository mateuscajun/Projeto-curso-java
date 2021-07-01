package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // Para o valor ser constante coloque a final antes da variavel, é recomendavel constantes em letra maiscula.
		
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2");
	}
}
