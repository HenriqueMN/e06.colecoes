package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02_ArrayList {

	public static void main(String[] args) {
		// Algoritmo que pede para o usuário inserir 10 números em um arraylist e depois pede para o usuário inserir um número para ser procurando dentro da arraylist e exibe, caso o número esteja dentro do array, a posição dele, e caso não esteja, uma mensagem dizendo que ele não faz parte do array.
		
		// Criação das variáveis e do Scanner
		ArrayList<Integer> lista = new ArrayList<Integer>();
		//int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, i;
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		
		for(i = 0; i < 10; i++) {
			System.out.print("Insira um número: ");
			numero = input.nextInt();
			lista.add(numero);
		}
		
		// Leitura do número e exibição da resposta
		
		for(i = 0; i < 2; i++) { // O primeiro for loop é apenas para demonstrar dois exemplos, será comentado posteriormente
			System.out.print("\nDigite o número que você deseja encontrar: ");
			numero = input.nextInt();
			
			for(int x = 0; x < 10; x++) {
				if(lista.get(x) == numero) { //Caso o número do usuário seja encontrado
					System.out.println("O número " + numero + " está localizado na posição: " + x + ".\n");
					break; //Para o for
				}
				if(x == 9) { //Caso x chegue a 9 (i.e., já tenha iterado por toda a lista) sem encontrar o número
					System.out.println("O número " + numero + " não foi encontrado!\n");
				}
			}
		}	
	}
}
