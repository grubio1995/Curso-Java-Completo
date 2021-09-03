package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Ler os dados de um pedido com N itens (N fornecido pelo usuário).
 *         Depois, mostrar um sumário do pedido conforme exemplo (próxima
 *         página). Nota: o instante do pedido deve ser o instante do sistema:
 *         new Date()
 *
 */

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");

		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Email: ");
		String email = sc.nextLine();

		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());

		System.out.println("Enter order data:");
		System.out.println("Status:");
		String status = String.valueOf(sc.nextLine());

		System.out.println("How many items to this order? ");
		int n = sc.nextInt();

		Order order = new Order(Date.from(Instant.now()), OrderStatus.valueOf(status),
				new Client(name, email, birthDate));

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter #" + i + " item data");

			System.out.print("Product name: ");
			String productName = sc.next();

			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();

			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();

			order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));
		}

		System.out.println(order);
	}

}
