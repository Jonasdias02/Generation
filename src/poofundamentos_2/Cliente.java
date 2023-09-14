package poofundamentos_2;

import java.util.Scanner;

public abstract class Cliente {

		protected String tipo;
		private String nome;
		private String sobreNome;
		private String endereco;
		protected String telefone;
		protected String tipopg;

		
		
		public Cliente(String tipo, String nome, String sobreNome, String endereco, String telefone, String tipopg) {
			super();
			this.tipo = tipo;
			this.nome = nome;
			this.sobreNome = sobreNome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.tipopg = tipopg;
			
		}



		static Scanner leia = new Scanner(System.in);

			public static void validarTipoDePg(String tipopg) throws Exception  {
							
				
				if (!tipopg.equalsIgnoreCase("dinheiro") && !tipopg.equalsIgnoreCase("debito") && !tipopg.equalsIgnoreCase("credito"))
					throw new Exception("Tipo de pagamento inválido!!");
				
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



		public String getTipopg() {
			return tipopg;
		}

		public void setTipopg(String tipopg) {
			this.tipopg = tipopg;
		}


		public void visualizar() {
			System.out.println("\n\n***************************************************");
			System.out.println("\n################  Dados do cliente  ###############");
			System.out.println("\n\n***************************************************");
			System.out.println("\nCliente : " + tipo );
			System.out.println("\nNome do cliente : " + nome + " " + sobreNome);
			System.out.println("\nEndereço : " + endereco);
			System.out.println("\nTelefone : " + telefone);
			System.out.println("\nTipo de pagamento : " + tipopg);
		}
		
		 	
	}


