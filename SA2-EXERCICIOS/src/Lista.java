/*
 * 1. Dada a lista L = [5, 7, 2, 9, 4, 1, 3], escreva um programa que imprima as seguintes informações:
a) tamanho da lista; 
b) maior valor da lista; 
c) menor valor da lista; 
d) soma de todos os elementos da lista; 
e) lista em ordem crescente; f) lista em ordem decrescente.
 */

import java.util.Arrays;

public class Lista {
	
    public static void main(String[] args) {
    	
        int[] L = {5, 7, 2, 9, 4, 1, 3};
        
        // a) Tamanho da lista
        int tamanho = L.length;
        System.out.println("Tamanho da lista: " + tamanho);
        
        // b) Maior valor da lista
        int maior = L[0];
        for (int i = 1; i < L.length; i++) {
            if (L[i] > maior) {
                maior = L[i]; }
        }
        System.out.println("Maior valor da lista: " + maior);
        
        // c) Menor valor da lista
        int menor = L[0];
        for (int i = 1; i < L.length; i++) {
            if (L[i] < menor) {
                menor = L[i];
            }
        }
        
        System.out.println("Menor valor da lista: " + menor);
        // d) Soma de todos os elementos da lista
        int soma = 0;
        for (int i = 0; i < L.length; i++) {
            soma += L[i];
        }
        
        System.out.println("Soma de todos os elementos da lista: " + soma);
        
        // e) Lista em ordem crescente
        int[] Lcrescente = L.clone();
        Arrays.sort(Lcrescente);
        System.out.print("Lista em ordem crescente: ");
        for (int i = 0; i < Lcrescente.length; i++) {
            System.out.print(Lcrescente[i] + " ");
        }
        
        System.out.println();
        
        // f) Lista em ordem decrescente
        int[] Ldecrescente = L.clone();
        Arrays.sort(Ldecrescente);
        System.out.print("Lista em ordem decrescente: ");
        for (int i = Ldecrescente.length - 1; i >= 0; i--) {
            System.out.print(Ldecrescente[i] + " ");
        }
        
        System.out.println();
    }
}