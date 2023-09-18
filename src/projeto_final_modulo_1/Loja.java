package projeto_final_modulo_1;

import java.util.ArrayList;


public class Loja extends Main{

	private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        getProdutos().add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : getProdutos()) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("");
        }
    }

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
}
