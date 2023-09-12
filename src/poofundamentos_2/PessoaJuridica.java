package poofundamentos_2;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	
	public PessoaJuridica(String nome, String sobreNome, String endereco, String telefone, String cnpj) {
		super(nome, sobreNome, endereco, telefone);
		this.cnpj = cnpj;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("\nCNPJ: " + cnpj);
	
	}
	
}
