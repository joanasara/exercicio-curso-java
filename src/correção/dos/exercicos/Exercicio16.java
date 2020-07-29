package correção.dos.exercicos;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua em idade em anos");
		int idade = leia.nextInt();
		int diasAno = 365;
		int mes = 30;
		double idadeDias;
    
		
	int mesAno = mes *12;
		
	idadeDias = (idade * diasAno)/mesAno;	
		
	System.out.println("a idade em dias da pessoa e " + idadeDias);	
		
		
		
		
		leia.close();

	}

}
