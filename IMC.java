import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso, altura;
		
		System.out.print("Informe seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.print("Informe sua altura: ");
		altura = entrada.nextDouble()
;
		
		double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é " + imc);
	}

}
