import java.util.Random;
import java.util.Scanner;

public class OperacaoTernaria {

	public static void main(String[] args) {

		int num;
		String dia;
		Scanner in = new Scanner(System.in);
		
		
		do{
		System.out.print("Digite 1 para domingo e 7 para s�bado: ");
		num = in.nextInt();

				
		dia = (num == 1) ? "Domingo" :
			  (num == 2) ? "Segunda" :
			  (num == 3) ? "Ter�a" :
			  (num == 4) ? "Quarta" :		
			  (num == 5) ? "Quinta" :
			  (num == 6) ? "Sexta" :
			  (num == 7) ? "S�bado" :
		  		           "Dia inv�lido" ;
		
	
		System.out.println(dia+".");
		System.out.println();
		}while (num>=1);							  			  
		
		
	}
}