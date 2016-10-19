# aula19outubro
aula do dia 19 de outubro


import java.util.Scanner;

public class OperacaoTernaria {

	public static void main(String[] args) {

		int num;
		String dia;
		Scanner in = new Scanner(System.in);
		
		
		do{
		System.out.print("Digite 1 para domingo e 7 para sábado: ");
		num = in.nextInt();

				
		dia = (num == 1) ? "Domingo" :
			  (num == 2) ? "Segunda" :
			  (num == 3) ? "Terça" :
			  (num == 4) ? "Quarta" :		
			  (num == 5) ? "Quinta" :
			  (num == 6) ? "Sexta" :
			  (num == 7) ? "Sábado" :
		  		           "Dia inválido" ;
		
	
		System.out.println(dia+".");
		System.out.println();
		}while (num>=1);							  			  
		
		
	}
}
