package correção.dos.exercicos;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	  Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valos do numA ");
		int numA = leia.nextInt();
		
		System.out.println("Digite o valos do numB ");
		int numB = leia.nextInt();
		
	int a = 0;
	int b = 0;
	if(numB!= numA && numA!= numB)	{
		a = numB;
		b = numA;
		System.out.println("o valor de numA e " + a);
		System.out.println("o valor de numB e " + b);
	}else {
		System.out.println("o valor de numA e " + numA);
		System.out.println("o valor de numB e " + numB);
	}
		
		
		
		
		
		
		
		
		
		
	leia.close();	

	}

}
