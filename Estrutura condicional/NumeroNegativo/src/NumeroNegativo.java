import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 * Exerc�cio 1 - Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
 * 
 */

public class NumeroNegativo {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Digite um n�mero inteiro: ");
		i = sc.nextInt();
		
		if(i < 0)
			System.out.println("NEGATIVO");
		
		else
			System.out.println("NAO NEGATIVO");
		
		sc.close();
		
	}
}
