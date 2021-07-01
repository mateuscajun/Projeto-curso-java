package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
	
		/*double a = 6 * (3 + 2);
		double b = Math.pow(a, 2);
		double c = b / (3*2); 
	
		//System.out.println(c);
		
		double d = (1-5) * (2-7);
		double e = d / 2;
		double f = Math.pow(e, 2);
		
		
		//System.out.println(f);
		
		double g = c - f ;
		
		//System.out.println(g);
		
		double j = Math.pow(g, 3) / Math.pow(10, 3);
		
		System.out.println(j);

		*/
		
		
		double numA = Math.pow(6 * (3 +2), 2);
		double denA = 3 * 2;
		
		double numB = (1-5) * (2 -7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2 );
		
		double superior = Math.pow(superiorA - superiorB,  3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior ;
		
		System.out.println("O resultado é " + resultado);
	}		 
	 
}
