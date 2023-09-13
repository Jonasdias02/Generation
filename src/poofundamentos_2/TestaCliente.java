package poofundamentos_2;

public class TestaCliente {

	public static void main (String [] args) {
		
		PessoaFisica psf1 = new PessoaFisica ("Pessoa Física","Jonas","Ferreira","Av itaoca", "(21)97397-2925","182.493.717-20");
		psf1.visualizar();
		
		PessoaJuridica psj1 = new PessoaJuridica ("Pessoa Jurídica","Neymar","Junior","Arábia", "(21)97397-2925","458.5555.4784-22");
		psj1.visualizar();
	}
}
