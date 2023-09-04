package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int num, result = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("\n-- Digite um numero inteiro : ");	
		System.out.println("\n-- Digite o numero zero(0) para sair : ");	
		num = leia.nextInt();
			if (num > 0) {
				result = result + num;
			}
		}
		
	while (num != 0);
		
		System.out.println("A soma dos números positivos é: " + result);
		
		}
	}

