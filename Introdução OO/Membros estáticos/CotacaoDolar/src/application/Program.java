package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

/**
 ** @author Gabriel Rubio
 *
 *         Fa�a um programa para ler a cota��o do d�lar, e depois um valor em
 *         d�lares a ser comprado por uma pessoa em reais. Informar quantos
 *         reais a pessoa vai pagar pelos d�lares, considerando ainda que a
 *         pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma
 *         classe CurrencuConverter para ser respons�vel pelos c�lculos.
 * 
 */

public class Program {

	public static void main(String[] args) {

		double dollarPrice, dollarAmount;

		dollarPrice = dollarAmount = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Whats is the dollar price: ");
		dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		dollarAmount = sc.nextDouble();

		System.out.println("Amount to be paid in reais: "
				+ String.format("%.2f", CurrencyConverter.amountPaidInReais(dollarPrice, dollarAmount)));
	}
}
