import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Qual mês vai nascer? ");
		int mes = t.nextInt();
		while (mes <= 0 || mes > 12) {
			System.out.println("\nMês inválido. ");
			System.out.print("\nQual mês vai nascer? ");
			mes = t.nextInt();
		}
		if (mes % 2 == 0) {
			System.out.print("\nÉ menina!! ");
		} else {
			System.out.print("\nÉ menino!! ");
		}
		t.close();
	}
}
