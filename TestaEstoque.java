package br.com.generation.collectionsex;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Estoque> listaProdutos = new ArrayList<>();
		
		System.out.println("Quantos produtos você deseja Add: ");
		int numeroProdutos = sc.nextInt();
		
		for(int i = 0; i < numeroProdutos; i++) {
			System.out.println("Digite o valor do produto: ");
			double valor = sc.nextDouble();					
			sc.nextLine();
			
			System.out.println("Digite o nome do Produto: ");
			String produto = sc.nextLine();				
			
			//Armazenar
			listaProdutos.add(new Estoque(valor, produto));
			
		}
			for(Estoque pl: listaProdutos) {
				System.out.println(pl);
			}
		
			sc.close();

	}

}
