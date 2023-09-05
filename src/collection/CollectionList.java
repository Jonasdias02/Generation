package collection;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class CollectionList {

	public static void main(String[] args) {
		
		// Cria a collection Set do tipo String chamada frutas
		ArrayList<String> setCores = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
		
		
		Iterator<String> isetCores = setCores.iterator();
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println("\nEscreva uma Cor :");
			setCores.add(leia.nextLine());
			
		}
		System.out.println("\nListar todas as Cores :");
		for (String cor :setCores) {
			System.out.println(cor);
		}
		setCores.sort(null);
		System.out.println("\nA lista das Cores ordenandas é :");
		for (String cor :setCores) {
			System.out.println(cor);
		}
	}

	
	
	
}
