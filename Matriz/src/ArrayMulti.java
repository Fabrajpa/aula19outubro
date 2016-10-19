import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[][] b = new int[6][6];
		b[0][0] = 11;
		b[0][1] = 22;
		b[0][2] = 33;
		b[0][3] = 44;
		b[0][4] = 55;
		b[0][5] = in.nextInt();

		for (int i = 0; i < b.length; i++) {
			 System.out.println(b[0][i]);
//			for (int ii = 0; ii < b.length; ii++) {
//
//				System.out.println(b[i][ii]);

			}
		}
	}
//}