package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollar = scan.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double buyDollar = scan.nextDouble();
		
		System.out.println("Amout to be paid in reais: " + CurrencyConverter.amount(dollar, buyDollar));

		scan.close();
	}

}
