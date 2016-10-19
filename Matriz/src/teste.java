
public class teste {

	public static void main(String[] args) {

		int linhas = 5;
		int colunas = 1000;
		String[][] a = new String[linhas][colunas];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				a[i][j] = "[" + i + "," + j + "]";

			}

		}

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
