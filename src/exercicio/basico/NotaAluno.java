package exercicio.basico;

import java.util.Locale;
import java.util.Scanner;

public class NotaAluno {

	
	public static void main(String[] args) {
		  Locale.setDefault(Locale.US);
          Scanner leia = new Scanner(System.in);

		  System.out.println("Digite a primeira nota do aluno");
		  double nota1 = leia.nextDouble();
		  
		  System.out.println("Digite a segunda nota do aluno");
		  double nota2 = leia.nextDouble();
		  
		  
		  double media = (nota1 + nota2)/2;
		  
		  if(media == 10) {
			  System.out.println("Aprovado sem distinção");
			 
		  }
		  else if(media >= 7) {
			  System.out.println("Parabéns! você esta aprovado");
			  
		  }
		  else if(media < 7) {
			  System.out.println("Reprovado");
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		leia.close();

	}

}
