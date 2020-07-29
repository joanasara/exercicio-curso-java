package array.br;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int[] vet = new int[10];
		
		for(int i= 0; i<vet.length; i++) {
			System.out.println("digite o valor "+ i);
			vet[i] = leia.nextInt();
		}
		int soma = 0;
		for(int i= 0; i<vet.length; i++) {
			if(vet[i] % 5 ==0) {
			soma+=vet[i];
			
			}
		}
			for(int i= 0; i<vet.length; i++) {
				System.out.println(vet[i]);
				
			}
			
			System.out.println("soma = " + soma);
		
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
