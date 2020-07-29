package correção.dos.exercicos;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o primeiro valor");
		int num1 = leia.nextInt();
		
		System.out.println("digite o segundo valor");
		int num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("O numero1 e maior " + num1);
			
		}
		else if(num2 > num1) {
			
			System.out.println("O numero2 e maior " + num2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
      leia.close();
	}

}
