package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01_ArrayList {

	public static void main(String[] args) {
		// Algoritmo que lê dez cores e exibe a lista de cores e as cores ordenadas
		
		// Criação das listas e das variáveis
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		int i;
		Scanner input = new Scanner(System.in);
		
		// For loop para receber os inputs
		for(i = 0; i < 5; i++) {
			System.out.print("Digita uma cor: ");
			cor = input.next();
			
			cores.add(cor);	
		}
		
		// Outputs
		System.out.println("\nListar todas as cores:");
		for(i = 0; i < 5; i++) {
			System.out.print("\n" + cores.get(i));
		}
		
		Collections.sort(cores); //Ordena as cores em ordem alfabética
		
		System.out.println("\n\nOrdenar as cores:");
		for(i = 0; i < 5; i++) {
			System.out.print("\n" + cores.get(i));
		}
	}

}
