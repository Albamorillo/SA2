/*
 * 2. Faça um programa que leia 4 valores, calcule a média e imprima positivo ou negativo 
 * (para ser positivo a média deve ser acima de 1)
 */
import java.util.Scanner;

	public class AverageCalculator {
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	        	
				// Ler 4 valores do usuário
				System.out.print("Enter value 1: ");
				double value1 = scanner.nextDouble();
				System.out.print("Enter value 2: ");
				double value2 = scanner.nextDouble();
				System.out.print("Enter value 3: ");
				double value3 = scanner.nextDouble();
				System.out.print("Enter value 4: ");
				double value4 = scanner.nextDouble();
				
				// Calcule a média
				double average = (value1 + value2 + value3 + value4) / 4;
				
				// Determine se a média é positiva ou negativa
				if (average > 1) {
				    System.out.println("The average is positive: " + average);
				} else {
				    System.out.println("The average is negative: " + average);
				}
			}
	    }
}