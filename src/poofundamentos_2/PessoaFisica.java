package poofundamentos_2;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(String tipo,String nome, String sobreNome, String endereco, String telefone, String cpf) {
		super(tipo, nome, sobreNome, endereco, telefone);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("\nCPF : " + this.cpf);

		
	}
	
}
