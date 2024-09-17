/*
 * 3. Escreva um programa que leia 20 valores inteiros e informe a média deles, 
 * o maior e o menor valor.
 */

import java.util.Scanner;

	public class MeanMaxMin {
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner (System.in)) {
				int[] values = new int[20];
				int sum = 0;
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				
				// Read 20 integer values
				for (int i = 0; i < 20; i++) {
				    System.out.print("Enter value " + (i + 1) + ": ");
				    values[i] = scanner.nextInt();
				    sum += values[i];
				    
				    // Update max and min values
				    if (values[i] > max) {
				        max = values[i];
				    }
				    if (values[i] < min) {
				        min = values[i];
				    }
				}
				
				// Calculate mean
				double mean = (double) sum / 20;
				
				// Print results
				System.out.println("Mean: " + mean);
				System.out.println("Max: " + max);
				System.out.println("Min: " + min);
			}
	    }
	}
