import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 * Exercício 5 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 */


public class Lanchonete {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		int codigo,qtd;
		double preco;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
	
		switch (codigo) {
	
		case 1:
			preco = qtd * 4.00;
			break;

		case 2:
			preco = qtd * 4.50;			
			break;
		
		case 3:
			preco = qtd * 5.00;	
			break;

		case 4:
			preco = qtd * 2.00;
			break;
			
		default:
			preco = qtd * 1.50;
			break;
		}
		
		
		System.out.printf("Total: R$ " + "%.2f",preco);
		
		
		sc.close();
	}
}
