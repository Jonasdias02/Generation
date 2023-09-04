package Lacos;

import java.util.Scanner;

public class LacoSwitch {

	
	public static void main(String [] args) {
		
		int codProd = 0;
		double preco ;
		var produto = "";
		int quantidade = 0 ;
		var leia = new Scanner (System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Cachorro Quente--");
		System.out.println("--Digite 2 para X-Salada--");
		System.out.println("--Digite 3 para X-Bacon--");
		System.out.println("--Digite 4 para Bauru--");
		System.out.println("--Digite 5 para Refrigerante--");
		System.out.println("--Digite 6 para Suco de laranja--");
		
		
		System.out.println("\n--Digite o número do pedido : --");
		codProd = leia.nextInt();
		
		System.out.println("--Digite a quantidade que você deseja : --");
		quantidade = leia.nextInt();
		
		switch(codProd){
		
	    case 1: produto = "Cachorro Quente";
	    			preco = 10.90; 
	    			System.out.printf("--Seu pedido de " + produto + " vai custar R$ :  %.2f " , ( preco * quantidade));
	        break;
	    case 2: produto = "X-Salada";
	    			preco = 15.00; 
	    			System.out.printf("--Seu pedido de " + produto + " vai custar R$ :  %.2f " , ( preco * quantidade));
	        break;
	    case 3: produto = "X-Bacon";
	    			preco = 18.00; 
	    			System.out.printf("--Seu pedido de " + produto + " vai custar R$ : %.2f " ,( preco * quantidade));
	        break;
	    case 4:  produto = "Bauru";
	    			preco = 12.00; 
	    			System.out.printf("--Seu pedido de " + produto + " vai custar R$ : %.2f " ,( preco * quantidade));
	        break;
	    case 5:  produto = "Refrigerante";
	    			preco = 8.00; 
	    			System.out.printf("--Seu pedido de " + produto + " vai custar R$ : %.2f " , ( preco * quantidade));
	    	break;
	    case 6:  produto = "Suco de laranja";
	    			preco = 13.00; 
	    			System.out.printf("--Seu pedido de " + produto + " vai custar R$ : %.2f " , ( preco * quantidade) );
	        break;
	    default:
	        //  Executa alguma ação caso todas as condições acima forem falsas
	}
	}
	
	
	
	
	
	
	
}
