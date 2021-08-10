import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Escreva um programa que repita a leitura de uma senha até que ela
 *         seja válida. Para cada leitura de senha incorreta informada, escrever
 *         a mensagem "Senha Invalida". Quando a senha for informada
 *         corretamente deve ser impressa a mensagem "Acesso Permitido" e o
 *         algoritmo encerrado. Considere que a senha correta é o valor 2002.
 *
 */

public class VerificaSenha {

	public static void main(String[] args) {

		String senha;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (true) {

			senha = sc.next();

			if (senha.equals("2002")) {
				System.out.println("Acesso permitido");
				break;
			}
			
			else
				System.out.println("Senha inválida");
		}

		sc.close();
	}
}
