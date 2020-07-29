package correção.dos.exercicos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	       Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o Valor do Metro");
		int metro = leia.nextInt();
		
		
		int centrimeto = 100;
		int conversao = metro * centrimeto;
		
		System.out.println(metro + " Metros = " + conversao);
		
		
		
		
      leia.close();
	}

}
