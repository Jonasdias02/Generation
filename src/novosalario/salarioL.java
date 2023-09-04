package novosalario;

import java.util.Scanner;

public class salarioL {

	
		
		
		public static void main(String [] args) {
			var scanner = new Scanner(System.in);
			
			
			float salario ;
			float abono ;
			
				
				
			System.out.println("\nDigite o salário : " );
			salario = scanner.nextFloat();
			System.out.println("\nDigite o abono : " );
			abono = scanner.nextFloat();
			
			float novoSalario = salario + abono;
			
			System.out.println("\nO novo salário é de : " + novoSalario);
			
			
		}
	}

