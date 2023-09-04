package mediaalunos;

import java.util.Scanner;

public class notas {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		
		float nota1, nota2, nota3, nota4 , media;
			
		System.out.println("\nDigite nota 1 : " );
		nota1 = ler.nextFloat();
		System.out.println("\nDigite nota 2 : " );
		nota2 = ler.nextFloat();
		System.out.println("\nDigite nota 3 : " );
		nota3 = ler.nextFloat();
		System.out.println("\nDigite nota 4 : " );
		nota4 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		System.out.printf(" A média das notas é : %.1f " , media);
		
		
	}
}
