package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoRecuperacao = media >= 5.0 ? "em recupera��o" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoRecuperacao;
		
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "n�o";
		 
		System.out.printf("Tem desconto ? %s", resultado);
	}
	
}
