package corre��o.dos.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora trabalhada");
		double valorHora = leia.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha no m�s");
		int horasTra = leia.nextInt();
		
		double salarioMes = valorHora * horasTra;
		
		
		System.out.printf("Total do seu Salario no referido m�s = %.2f  ", salarioMes);
		
		
		
		
		leia.close();
	}

}
