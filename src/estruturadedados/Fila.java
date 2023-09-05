package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Fila {
	public static void main(String[] args) {

		Queue<String> filaNome = new LinkedList<>();

		System.out.println("\n************************************** " );
		System.out.println("\n1 - Adicionar Cliente na Fila " );
		System.out.println("\n2 - Listar todos os Clientes " );
		System.out.println("\n3 - Retirar Cliente da Fila " );
		System.out.println("\n0 = Sair " );
		System.out.println("\n************************************** " );


		Scanner ler = new Scanner(System.in);
		
		int opcao = 0;


		do {    
			System.out.println("\nEntre com a opção desejada : " );
		
		opcao = Integer.parseInt(ler.nextLine());   
		                      
		switch(opcao) {                
		case 1:                    
			System.out.println("Digite o nome do cliente: ");
			filaNome.add(ler.nextLine());    
			System.out.println("Cliente cadatrado com sucesso!! "); 
			break;                 
		case 2:                     
			if(filaNome.isEmpty()) {                        
				System.out.println("A Fila está vazia!");                        
				break;                     }                    
			else {                         
				System.out.println("Todos os clientes disponíveis: ");                        
				System.out.println(filaNome);                        
				break;                     }                
			case 3:                     
				if(filaNome.isEmpty()) {                       
					System.out.println("A Fila está vazia!");                        
					break;                     }                    
				else {                    
					System.out.println("Cliente removido com sucesso!");                    
					filaNome.poll();                     }                    
				break;                 
				case 0:                     
					System.out.println("Programa Finalizado!");                     
					break;                 
					default:                     
						System.out.println("Opção inválida!");            
						}   
		}        
		while(opcao != 0);     	
		ler.close();
		}
}
