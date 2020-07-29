package correção.dos.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a Base do Quadrado");
		int base = leia.nextInt();

		System.out.println("Digite a Altura do Quadrado ");
		int altura = leia.nextInt();

		double area = (base * altura) * 2;
		
		
		System.out.println("Dobro da Area = "+ area );
		
		
      leia.close();
	}

}
