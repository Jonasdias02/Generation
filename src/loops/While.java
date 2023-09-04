package loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int idade, contador21 = 0 , contador50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n-- Digite uma idade : ");	
		idade = leia.nextInt();
		
		while(idade >= 0) {
			if(idade <= 21) {
				contador21++;
			}
			if(idade >= 50) {
				contador50++;
			}
			System.out.println("\n-- Digite uma idade : ");	
			idade = leia.nextInt();
			
		}
			System.out.println("\n-- Total de pessoas menores de 21 anos : " + contador21);
			System.out.println("\n-- Total de pessoas maiores de 50 anos : " + contador50);
			
			leia.close();
	}	
		
	
}

	
