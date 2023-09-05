package estruturadedados;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


	public class Pilha {

		public static void main(String[] args) {

			Stack<String> pilhaNome = new Stack<>();

			System.out.println("\n************************************** " );
			System.out.println("\n1 - Adicionar Livros na Pilha " );
			System.out.println("\n2 - Listar todos os Livros " );
			System.out.println("\n3 - Retirar Livros da Pilha " );
			System.out.println("\n0 = Sair " );
			System.out.println("\n************************************** " );


			Scanner ler = new Scanner(System.in);
			
			int opcao = 0;


			do {    
				System.out.println("\nEntre com a opção desejada : " );
			
			opcao = Integer.parseInt(ler.nextLine());   
			                      
			switch(opcao) {                
			case 1:                    
				System.out.println("Digite o nome do Livro: ");
				
				pilhaNome.push(ler.nextLine());    
				
				System.out.println("Livro cadatrado com sucesso!! "); 
				break;                 
			case 2:                     
				if(pilhaNome.isEmpty()) {                        
					System.out.println("A Pilha está vazia!");                        
					break;                     }                    
				else {                         
					System.out.println("Todos os Livros disponíveis: ");                        
					System.out.println(pilhaNome);                        
					break;                     }                
				case 3:                     
					if(pilhaNome.isEmpty()) {                       
						System.out.println("A Pilha está vazia!");                        
						break;                     }                    
					else {                    
						System.out.println("Livro removido com sucesso!");                    
						pilhaNome.pop();                     }                    
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
