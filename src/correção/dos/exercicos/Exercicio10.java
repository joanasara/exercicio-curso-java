package corre��o.dos.exercicos;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o valor");
		int valor = leia.nextInt();
		
		for(int i=valor; i>=0; i--) {
			valor = + i;
			System.out.println("a posi��o " + i + " = " + valor);
		}
		
		
		
		
		
		
		
		
		
		
		
      leia.close();
	}

}
