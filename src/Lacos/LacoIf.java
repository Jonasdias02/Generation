package Lacos;

import java.util.Scanner;

public class LacoIf {
	
	public static void main(String [] args) {
		int A , B  , C ;
		
		
		
		var leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A :");
		A = leia.nextInt();
		System.out.println("Digite o valor de B :");
		B = leia.nextInt();
		System.out.println("Digite o valor de C :");
		C = leia.nextInt();
		
		
		
		if( A + B > C) {
		System.out.println("O valor de A + B é maior que C !");
		}
		if( A + B < C) {
			System.out.println("O valor de A + B é menor que C !");
		}
		if (A + B == C){
			System.out.println("O valor de A + B é igual a C !");
		}
		
	}
	
}
