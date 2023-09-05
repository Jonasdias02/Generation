package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;




public class CollectionSet {
	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner leia = new Scanner (System.in);
		
		
		
	for (int i = 0; i <10; i++) {
		System.out.printf("Digite o %d número : ", i);
		setNumeros.add(leia.nextInt());
		
	}
		
		Iterator<Integer> iNumeros = setNumeros.iterator();
		
		System.out.println("Digite o %d número : ");
	
		while (iNumeros.hasNext()) {
		System.out.println(iNumeros.next());
		}

	}
}
