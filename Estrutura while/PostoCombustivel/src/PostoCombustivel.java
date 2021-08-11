import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Um Posto de combust�veis deseja determinar qual de seus produtos tem
 *         a prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo
 *         de combust�vel abastecido (codificado da seguinte forma: 1.�lcool
 *         2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido
 *         (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que
 *         seja v�lido). O programa ser� encerrado quando o c�digo informado for
 *         o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a
 *         quantidade de clientes que abasteceram cada tipo de combust�vel,
 *         conforme exemplo.
 *
 */

public class PostoCombustivel {
	public static void main(String[] args) {

		int opcao, gasolina, alcool, diesel;

		opcao = gasolina = alcool = diesel = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (true) {

			opcao = sc.nextInt();

			if (opcao == 4) {
				System.out.println("MUITO OBRIGADO");
				break;
			}

			else if (opcao == 1)
				alcool++;

			else if (opcao == 2)
				gasolina++;

			else if (opcao == 3)
				diesel++;
		}

		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
