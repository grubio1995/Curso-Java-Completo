import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Fazer um programa para ler um n�mero N. Depois leia N pares de
 *         n�meros e mostre a divis�o do primeiro pelo segundo. Se o denominador
 *         for igual a zero, mostrar a mensagem "divisao impossivel".
 *
 */

public class VerificaDivisao {

	public static void main(String[] args) {

		int loop = 0;
		double n1, n2 = 0.0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {

			n1 = sc.nextDouble();
			n2 = sc.nextDouble();

			if (n2 == 0)
				System.out.println("Divis�o imposs�vel");

			else
				System.out.printf("%.1f%n", (n1 / n2));

		}

		sc.close();
	}
}
