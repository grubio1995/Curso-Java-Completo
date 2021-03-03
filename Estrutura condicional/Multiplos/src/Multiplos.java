import java.util.Scanner;


/**
 * 
 * @author Gabriel Rubio
 * 
 * Exercício 3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
 * "Sao Multiplos" ou "Nao sao tiplos", indicando se os valores lidos são múltiplos entre si. 
 *  Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 */


public class Multiplos {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Digite o numero 1");
		n1 = sc.nextInt();
		
		System.out.println("Digite o numero 2");
		n2 = sc.nextInt();
		
		if(n1 % n2==0 || n2 % n1 == 0)
			System.out.println("Sao multiplos");		
		else
			System.out.println("Nao sao multiplos");
			
		
		
		sc.close();
	}
}
