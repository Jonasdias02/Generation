package Arrays;

import java.util.Scanner;

public class matriz01 {
	

	public static void main(String[] args) {
        int matrizInteiros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        
        int soma1 = 0, soma2 =0 ,linha;
      
        
        Scanner leia = new Scanner(System.in);
       
        System.out.println("\nElementos da Diagonal Principal : ");
        
        for (linha = 0; linha < 3; linha++) {
        	System.out.print( matrizInteiros[linha][linha] + " ");
        	soma1 += matrizInteiros [linha][linha];  }
        
		        System.out.println("\nElementos da Diagonal Secundária : ");
        
	        for (linha = 0; linha < 3; linha++) {
	    		System.out.print( matrizInteiros[linha][2-linha] + " ");
	    		soma2 += matrizInteiros [linha][2-linha];
	    	}
	    
	        	System.out.println("\nSoma dos Elementos da Diagonal Principal: " + soma1);
	        	
	        	System.out.println("\nSoma dos Elementos da Diagonal Principal: " + soma2);   
	        	
	}
        
}
