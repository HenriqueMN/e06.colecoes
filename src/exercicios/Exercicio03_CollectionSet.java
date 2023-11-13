package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03_CollectionSet {

	public static void main(String[] args) {
		// Algoritmo que lê dez números, armazena eles em um Set e exibe eles usando um iterator.
		
		Set<Integer> setInteiros = new HashSet<Integer>();
		Scanner input = new Scanner(System.in);
		
		// Leitura do input
		System.out.println("Entre 10 números diferentes");
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			setInteiros.add(input.nextInt());
		}
		
		// Output
		// O iterator deve ser criado quando a lista já estiver preenchida
		Iterator<Integer> isetInteiros = setInteiros.iterator();
		
		while(isetInteiros.hasNext()) {
			System.out.println(isetInteiros.next());
		}

	}

}
