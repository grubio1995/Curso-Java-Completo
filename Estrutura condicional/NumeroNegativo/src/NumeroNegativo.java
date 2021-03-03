import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 * Exercício 1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 * 
 */

public class NumeroNegativo {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Digite um número inteiro: ");
		i = sc.nextInt();
		
		if(i < 0)
			System.out.println("NEGATIVO");
		
		else
			System.out.println("NAO NEGATIVO");
		
		sc.close();
		
	}
}
