package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrimeNumbersOnRange;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Send a range: ");
		int range = scan.nextInt();
		System.out.println();
		
		PrimeNumbersOnRange primeNumbersOnRange = new PrimeNumbersOnRange(range);
		System.out.println("Primes:");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(primeNumbersOnRange);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("Range: " + primeNumbersOnRange.getRange());
		System.out.println("Quantity: " + primeNumbersOnRange.getQuantity());
		System.out.println("Density: " + primeNumbersOnRange.getDensity() + "%");
		
		scan.close();
	}
}
