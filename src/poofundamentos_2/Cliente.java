package poofundamentos_2;

public abstract class Cliente {

		protected String tipo;
		private String nome;
		private String sobreNome;
		private String endereco;
		protected String telefone;
		
	
		
		public Cliente(String tipo, String nome, String sobreNome, String endereco, String telefone) {
			super();
			this.tipo = tipo;
			this.nome = nome;
			this.sobreNome = sobreNome;
			this.endereco = endereco;
			this.telefone = telefone;
		}


		public String getTipo() {
			return tipo;
		}



		public void setTipo(String tipo) {
			this.tipo = tipo;
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
			System.out.println("\n################  Dados do cliente  ###############");
			System.out.println("\n\n***************************************************");
			System.out.println("\nCliente : " + tipo );
			System.out.println("\nNome do cliente : " + nome + " " + sobreNome);
			System.out.println("\nEndereço : " + endereco);
			System.out.println("\nTelefone : " + telefone);
		}

		 	
	}


