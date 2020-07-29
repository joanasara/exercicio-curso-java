package correção.dos.exercicos;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int[] vet = new int[2];
		double media =  0;
		
		for(int i=0; i<vet.length; i++) {
			System.out.println("Digite o valor na posição " + i);
			vet[i] = leia.nextInt();
		
			
		}
		for(int i=0; i<vet.length; i++) {
		  media = (vet[i] + vet[i]) /2;
			
		}
		System.out.println("a soma da media e " + media);
		
		for(int i=0; i<vet.length; i++) {
			while(vet[i]>100 ||vet[i] <0 ) {
				System.out.println("ERRO! NÃO PODE ADICIONAR");
				break;
			}
			
		}
		System.out.println(" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
     leia.close();
	}

}
