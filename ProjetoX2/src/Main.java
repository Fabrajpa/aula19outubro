import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Qual m�s vai nascer? ");
		int mes = t.nextInt();
		while (mes <= 0 || mes > 12) {
			System.out.println("\nM�s inv�lido. ");
			System.out.print("\nQual m�s vai nascer? ");
			mes = t.nextInt();
		}
		if (mes % 2 == 0) {
			System.out.print("\n� menina!! ");
		} else {
			System.out.print("\n� menino!! ");
		}
		t.close();
	}
}
