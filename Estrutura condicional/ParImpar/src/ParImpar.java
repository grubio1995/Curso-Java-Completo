import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 * Exercício 2 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 * 
 */

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num %2 == 0)
			System.out.println("PAR");

		else
			System.out.println("IMPAR");
		
		
		sc.close();
		
		
	}
}
