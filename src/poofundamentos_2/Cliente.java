package poofundamentos_2;

public class Cliente {

			
		private String nome;
		private String sobreNome;
		private String endereco;
		protected String telefone;
		
	
		
		public Cliente(String nome, String sobreNome, String endereco, String telefone) {
			super();
			this.nome = nome;
			this.sobreNome = sobreNome;
			this.endereco = endereco;
			this.telefone = telefone;
		}




		public String getNome() {
			return nome;
		}




		public void setNome(String nome) {
			this.nome = nome;
		}




		public String getSobreNome() {
			return sobreNome;
		}




		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}




		public String getEndereco() {
			return endereco;
		}




		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}




		public String getTelefone() {
			return telefone;
		}




		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}


		public void visualizar() {
			System.out.println("\n\n***************************************************");
			System.out.println("Dados do cliente :");
			System.out.println("\n\n***************************************************");
			System.out.println("Nome do cliente : " + nome + " " + sobreNome);
			System.out.println("\nEndereço do cliente : " + endereco);
			System.out.println("\nTelefone do cliente : " + telefone);
		}

		 	
	}


