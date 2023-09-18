package projeto_final_modulo_1;

public class Produto extends Loja {
	
	    private String nome;
	    private double preco;
	    private String tamanho;
	    private String cor;

	    public Produto(String nome, double preco, String tamanho, String cor) {
	        this.nome = nome;
	        this.preco = preco;
	        this.tamanho = tamanho;
	        this.cor = cor;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getPreco() {
	        return preco;
	    }
	    
	    public String getTamanho() {
	        return tamanho;
	    }
	    
	    public String getCor() {
	        return cor;
	    }
	}

