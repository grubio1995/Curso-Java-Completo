package entities;

public class Account {

	private int number;
	private String name;
	private double balance;
	private final double TAX = 5.00;

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
		balance = 0;
	}

	public Account(int number, String name, double initialBalance) {
		this.number = number;
		this.name = name;
		deposit(initialBalance);
	}

	public void deposit(double depositValue) {
		balance += depositValue;
	}

	public void withdraw(double withdrawValue) {
		balance -= withdrawValue + TAX;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account: " + number + ", Holder:" + name + " Balance: $ " + String.format("%.2f", balance);
	}
}
