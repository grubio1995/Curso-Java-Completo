package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

/**
 ** @author Gabriel Rubio
 *
 *         Faça um programa para ler a cotação do dólar, e depois um valor em
 *         dólares a ser comprado por uma pessoa em reais. Informar quantos
 *         reais a pessoa vai pagar pelos dólares, considerando ainda que a
 *         pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma
 *         classe CurrencuConverter para ser responsável pelos cálculos.
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
