import java.util.Scanner;

public class CalculatorIMC {
	
	public static double readDouble (String message) {
		Scanner input = new Scanner (System.in);
		System.out.print(message+ "; ");
		double value = input.nextDouble();
		return value;
	}

	public static void main(String[] args) {
		
		double altura = readDouble("Informe sua altura: ");
		
		double peso = readDouble("Informe seu peso: ");
				
		double imc = peso / (altura * altura);
		
		System.out.println("IMC = "+imc);
		
		if (imc < 18.5) {
			System.out.println("Magreza");
		} else if (imc < 24.9) {
			System.out.println("Normal");
		} else if (imc < 29.9) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}

	} // chave main
	

} // public class
