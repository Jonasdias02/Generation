package projeto_final_modulo_1;

import java.util.ArrayList;


public class Loja {

		
		    private ArrayList<Produto> estoque;

		    public Loja() {
		        estoque = new ArrayList<>();
		    }

		    public void adicionarProduto(Produto produto) {
		        estoque.add(produto);
		    }

		    public void listarProdutos() {
		        System.out.println("Produtos disponíveis na loja:");
		        for (Produto produto : estoque) {
		            System.out.println(produto.getNome() + " - R$" + produto.getPreco() + " - " + produto.getTamanho()+ " - " + produto.getCor());
		        }
		    }
		}
