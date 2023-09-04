package loops;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		
		int num1, num2, contador;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n-- Digite o primeiro número do intervalo : ");
		num1 = ler.nextInt();
		
		System.out.println("\n-- Digite o segundo número do intervalo : ");
		num2 = ler.nextInt();
		
        if (num1 < num2) {
            for(contador = num1; contador <= num2; contador++) {
                if(contador % 3 == 0 && contador % 5 == 0) {
                    System.out.println(contador + " é multiplo de 3 e 5.");
                }
            }} else {
            System.out.println("Intervalo inválido!");
        }
        ler.close();
        }
    }