package laco.de.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner leia = new Scanner(System.in);
        
	     double numero;
	     double soma = 0;
	     double media = 0;
	 
	    for(int i =0; i<5; i++) {
	    	System.out.println("Digite um numero:  " + i);
	    	numero = leia.nextDouble();
            soma += numero;	 
          
	    	
	    }
	    
         media = soma /5;
	    System.out.println("a soma  dos numero = " + soma);
	    System.out.println("A media do numero = " + media);
	    
	    
	    
	    leia.close();
	}

}
