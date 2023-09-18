package projeto_final_modulo_1;

import java.util.ArrayList;


public class Loja extends Main{

	private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        getProdutos().add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : getProdutos()) {
            System.out.println(Cores.TEXT_GREEN + "Nome: " + Cores.TEXT_RESET + produto.getNome());
            System.out.println(Cores.TEXT_GREEN + "Categoria: " + Cores.TEXT_RESET + produto.getCategoria());
            System.out.println(Cores.TEXT_GREEN + "Preço: " + Cores.TEXT_RESET + "R$" + produto.getPreco());
            System.out.println(Cores.TEXT_GREEN + "Estoque: " + Cores.TEXT_RESET + produto.getEstoque());
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
