import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 * Exerc�cio 2 - Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 * 
 */

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		
		if(num %2 == 0)
			System.out.println("PAR");

		else
			System.out.println("IMPAR");
		
		
		sc.close();
		
		
	}
}
