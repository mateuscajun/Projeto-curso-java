package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		double fahrenheit = 71;
		final double AJUSTE = 32;
		final double MULTIPLO = 5.0/9.0;
		
		double celsius = (fahrenheit - AJUSTE) * MULTIPLO;
		
		System.out.println("A temperatura em celsius é : " + celsius + "°C");
		
		fahrenheit = 80;
		celsius = (fahrenheit - AJUSTE) * MULTIPLO;
		System.out.println("A temperatura em celsius é : " + celsius + "°C");
		
		
		
				
	}
}
