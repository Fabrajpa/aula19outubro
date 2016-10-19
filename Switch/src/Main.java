import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		int mes;
		mes = num.nextInt();
		String s;
		switch (mes) {
		case 1:
			s = "Janeiro";
			break;
		case 2:
			s = "Fevereiro";
			break;
		case 3:
			s = "Março";
			break;
		case 4:
			s = "Abril";
			break;
		case 5:
			s = "Maio";
			break;
		case 6:
			s = "Junho";
			break;
		case 7:
			s = "Julho";
			break;
		case 8:
			s = "Agosto";
			break;
		case 9:
			s = "Setembro";
			break;
		case 10:
			s = "Outubro";
			break;
		case 11:
			s = "Novembro";
			break;
		case 12:
			s = "Dezembro";
			break;
		default:
			s = "Mês inválido.";
			break;
		}

		System.out.println(s);

	}

}
