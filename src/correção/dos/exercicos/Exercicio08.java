package correção.dos.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora trabalhada");
		double valorHora = leia.nextDouble();
		
		System.out.println("Quantas horas você trabalha no mês");
		int horasTra = leia.nextInt();
		
		double salarioMes = valorHora * horasTra;
		
		
		System.out.printf("Total do seu Salario no referido mês = %.2f  ", salarioMes);
		
		
		
		
		leia.close();
	}

}
