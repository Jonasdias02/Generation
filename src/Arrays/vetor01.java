package Arrays;

import java.util.Scanner;

public class vetor01 {
	

    public static void main(String[] args) {
        
        int vetorNumeros[] = {2,5,1,3,4,9,7,8,10,6};

        Scanner leia = new Scanner(System.in);
           System.out.println("\n-- Digite o número que você deseja encontrar : ");	
           int numero = leia.nextInt();
    	
           boolean achou = false;
           int contagem = 0, posicao = 0;
           
           for (contagem = 0; contagem < vetorNumeros.length; contagem++) {
        	   if (numero == vetorNumeros[contagem]) {
        		  achou = true;
        		  posicao = contagem;    		  
        		  
        	   }
           } 
           if (achou) {
        	   System.out.println("O número " + numero + " está localizado na posição: " + posicao);
           }
           else {
        	   System.out.println("O " + numero + " não foi encontrado!");
           }
    }
    
}
            
