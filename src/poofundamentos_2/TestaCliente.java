package poofundamentos_2;

public class TestaCliente {

	public static void main (String [] args) {
		String tipopg = "";
		
		try {

			System.out.println("\nDigite o tipo de pagamento: ");
			tipopg = Cliente.leia.nextLine();

			Cliente.validarTipoDePg(tipopg);
			
			
			PessoaFisica psf1 = new PessoaFisica ("Pessoa Física","Jonas","Ferreira","Av itaoca", "(21)97397-2925","182.493.717-20",tipopg);
			psf1.visualizar();
			
			PessoaJuridica psj1 = new PessoaJuridica ("Pessoa Jurídica","Neymar","Junior","Arábia", "(21)97397-2925","458.5555.4784-22",tipopg);
			psj1.visualizar();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("\nDigite se é Débito, Crédito ou Dinheiro! ");
		}

		
	}
}
