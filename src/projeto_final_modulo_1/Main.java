package projeto_final_modulo_1;

import java.util.Scanner;

public abstract class Main {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Loja loja = new Loja();

	        // Adicione alguns produtos à loja
	        loja.adicionarProduto(new Produto("Camiseta", "Roupas", 20.0, 50));
	        loja.adicionarProduto(new Produto("Calça", "Roupas", 40.0, 20));
	        loja.adicionarProduto(new Produto("Tênis", "Calçados", 60.0, 20));

	        while (true) {
	        	System.out.println("\n----------------------------------");
	            System.out.println("                Menu               ");
	            System.out.println("----------------------------------");
	            System.out.println("\n        1. Listar produtos        ");
	            System.out.println("\n        2. Comprar produto        ");
	            System.out.println("\n        3. Sair                   ");
	            System.out.println("\n----------------------------------");
	            System.out.print("Escolha uma opção: ");

	            int opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                	System.out.println("\n----------------------------------");
	                    System.out.println("\nProdutos disponíveis:");
	                    System.out.println("\n----------------------------------");
	                    loja.listarProdutos();
	                    break;
	                case 2:
	                    System.out.print("Digite o nome do produto que deseja comprar: ");
	                    String nomeProduto = scanner.next();
	                    for (Produto produto : loja.getProdutos()) {
	                        if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
	                            if (produto.getEstoque() > 0) {
	                                System.out.print("Quantidade desejada: ");
	                                int quantidade = scanner.nextInt();
	                                if (quantidade <= produto.getEstoque()) {
	                                    produto.diminuirEstoque(quantidade);
	                                    System.out.println("Compra realizada com sucesso!!!");
	                                    System.out.println("Total a pagar: R$" + (produto.getPreco() * quantidade));
	                                } else {
	                                    System.out.println("Quantidade indisponível em estoque.");
	                                }
	                            } else {
	                                System.out.println("Produto esgotado.");
	                            }
	                            break;
	                        }
	                    }
	                    break;
	                case 3:
	                    System.out.println("Saindo da loja. Volte sempre!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	        }
	    }
	}


