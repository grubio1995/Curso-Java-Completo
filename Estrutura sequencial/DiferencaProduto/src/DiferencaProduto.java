import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 * Exerc�cio 3 - Fazer um programa para ler quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C 
 * e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
 *
 */

public class DiferencaProduto {
	
	public static void main(String[] args) {

		int a,b,c,d,diferencaProdutos;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor de A: ");
		a = sc.nextInt();

		System.out.printf("Digite o valor de B: ");
		b = sc.nextInt(); 

		System.out.printf("Digite o valor de C: ");
		c = sc.nextInt();

		System.out.printf("Digite o valor de D: ");
		d = sc.nextInt();
		
		diferencaProdutos = (a*b) - (c*d);
		
		System.out.printf("A diferen�a dos ptodutos �: " + diferencaProdutos);
		
		sc.close();
 
	}
	
}
