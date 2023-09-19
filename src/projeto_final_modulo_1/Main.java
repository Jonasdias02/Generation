package projeto_final_modulo_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Main {
	
	  public static void main(String[] args) {
		  
	        Scanner scanner = new Scanner(System.in);
	        Loja loja = new Loja();
	        
	        		// Adicionando alguns produtos à loja
	        
		        loja.adicionarProduto(new Produto("Camiseta", "Roupas", 20.0, 50));
		        loja.adicionarProduto(new Produto("Calça", "Roupas", 40.0, 20));
		        loja.adicionarProduto(new Produto("Tênis", "Calçados", 60.0, 20));
		        loja.adicionarProduto(new Produto("Chinelo", "Calçados", 20.0, 20));
		        
	        		// Mostrando o menu com as opções
	        
	        while (true) {
	        	System.out.println(); 
	        	System.out.println("**********************************");
	            System.out.println(Cores.TEXT_GREEN + "\n               Menu               " + Cores.TEXT_RESET);
	            System.out.println("\n----------------------------------");
	            System.out.println(Cores.TEXT_GREEN); 
	            System.out.println("\n        1. Listar produtos        ");
	            System.out.println("\n        2. Comprar produto        ");
	            System.out.println("\n        3. Sair                   " + Cores.TEXT_RESET);
	            System.out.println("\n**********************************");
	            System.out.print("Escolha uma opção: ");
	            System.out.println();
	            
	         try {
	            int opcao = scanner.nextInt();
	            	switch (opcao) {
	            	
		               case 1:         
		                			//Lista os produtos
		                	System.out.println("\n----------------------------------");
		                    System.out.println(Cores.TEXT_GREEN +"\nProdutos disponíveis:" + Cores.TEXT_RESET);
		                    System.out.println("\n----------------------------------");
		                    loja.listarProdutos();
		                    break;
		                    
		                case 2:       
		                			//Interage com o usuário para executar uma ação, pegando o nome do produto
		                    System.out.print(Cores.TEXT_GREEN +"Digite o nome do produto que deseja comprar: " + Cores.TEXT_RESET);
		                    String nomeProduto = scanner.next();
		                    for (Produto produto : loja.getProdutos()) {
		                        if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
		                        	
		                        		//Interage com o usuário pegando a quantidade do produto
		                            if (produto.getEstoque() > 0) {
		                                System.out.print("Quantidade desejada: ");
		                                int quantidade = scanner.nextInt();
		                                
		                                	//Quantidade desejada menor igual que a quantidade no estoque executa a compra e tira o produto do estoque
		                                if (quantidade <= produto.getEstoque()) {
		                                    produto.diminuirEstoque(quantidade);
		                                    System.out.println(Cores.TEXT_BLUE + "Compra realizada com sucesso!!!" + Cores.TEXT_RESET);
		                                    System.out.println(Cores.TEXT_GREEN + "Total a pagar: " + Cores.TEXT_RESET + "R$" + (produto.getPreco() * quantidade));
		                                } else {
		                                    System.out.println(Cores.TEXT_RED + "Quantidade indisponível em estoque." + Cores.TEXT_RESET);
		                                }
		                            } else {
		                                System.out.println(Cores.TEXT_RED + "Produto esgotado." + Cores.TEXT_RESET);
		                            }
		                            
		                            break;
		                        }
		                    }
		                    break;
		                    
		                case 3:
		                    System.out.println(Cores.TEXT_BLUE +"Saindo da loja. Volte sempre!!!" + Cores.TEXT_RESET);
			                    scanner.close();
			                    System.exit(0);
		                   break;
		                    
		             default:
		                   System.out.println(Cores.TEXT_PURPLE +"Opção inválida!! Tente novamente com uma opcão válida: 1.Listar Produtos, 2.Comprar produto e 3.Sair ." + Cores.TEXT_RESET);  
		                break;
		            
	            	   }
	            	   
	            	}catch (InputMismatchException e){
	            		System.out.println(Cores.TEXT_PURPLE +"Opção inválida!! Reinicie o menu." + Cores.TEXT_RESET);
	            	 System.exit(0);
	            }	   
	           
	            
	       }
	            
	  }

}


