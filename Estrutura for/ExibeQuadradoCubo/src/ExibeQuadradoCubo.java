import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Fazer um programa para ler um n�mero inteiro positivo N. O programa
 *         deve ent�o mostrar na tela N linhas, come�ando de 1 at� N. Para cada
 *         linha, mostrar o n�mero da linha, depois o quadrado e o cubo do
 *         valor, conforme exemplo.
 *
 */

public class ExibeQuadradoCubo {

	public static void main(String[] args) {

		int loop;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		loop = sc.nextInt();

		for (int i = 1; i <= loop; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}

		sc.close();
	}
}
