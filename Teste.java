import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2;
		
		System.out.println("Informe a nota 1: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Media = "+media);

	}

}
