package correção.dos.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno");
        double num1 = leia.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno");
        double num2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno");
		double num3 = leia.nextDouble();
		
		System.out.println("Digite a quarta nota");
		double num4 = leia.nextDouble();
		
		double mediaNotas = (num1 + num2 + num3 + num4)/4;
		System.out.printf("A media doa alunos %.2f: ", mediaNotas);
		
		leia.close();
	}

}
