package exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio04_CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Algoritmo que pede para o usuário inserir 10 números em um arraylist e depois pede para o usuário inserir um número para ser procurando dentro da arraylist e exibe, caso o número esteja dentro do array, a posição dele, e caso não esteja, uma mensagem dizendo que ele não faz parte do array.
		
		// Criação das variáveis e do Scanner
		Set<Integer> setInteiros = new HashSet<Integer>();
		//int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; // Apenas para referência de exemplo
		int numero, i;
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		for(i = 0; i < 10; i++) {
			System.out.print("Insira um número: ");
			setInteiros.add(input.nextInt());
		}
		
		// Leitura do número		
		System.out.print("\nDigite o número que você deseja encontrar: ");
		numero = input.nextInt();
		
		// Criação do iterator e exibição da resposta
		Iterator<Integer> isetInteiros = setInteiros.iterator();
		while(isetInteiros.hasNext()) {
			if(isetInteiros.next() == numero) {
				System.out.println("O número " + numero + " foi encontrado!");
				flag = true;
			}
		}
		
		if(flag == false) { //Se o boolean não mudar para true, o número não foi encontrado
			System.out.println("O número " + numero + " não foi encontrado!");
		}
	}

}
