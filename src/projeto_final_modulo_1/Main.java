package projeto_final_modulo_1;

import java.util.Scanner;

public class Main extends Loja {
	    public static void main(String[] args) {
	        Loja minhaLoja = new Loja();
	        minhaLoja.adicionarProduto(new Produto("Camiseta", 25.99, "G", "Azul"));
	        minhaLoja.adicionarProduto(new Produto("Calça", 39.99, "G", "Azul"));
	        minhaLoja.adicionarProduto(new Produto("Tênis", 49.99, "43", "Preto"));

	        Scanner scanner = new Scanner(System.in);
	        int escolha;

	        do {
	            System.out.println("\n---------------------------------------------");
	            System.out.println("\n               Menu da Loja:                 ");
	            System.out.println("\n            1. Listar Produtos               ");
	            System.out.println("\n            2. Sair                          ");
	            System.out.println("\n---------------------------------------------");
	              System.out.print("Escolha uma opção:");
	            escolha = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    minhaLoja.listarProdutos();
	                    break;
	                case 2:
	                    System.out.println("Obrigado por visitar a loja!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (escolha != 2);

	        scanner.close();
	    }
	}


