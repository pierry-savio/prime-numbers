package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrimeNumbers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Range: ");
		int range = scan.nextInt();
		System.out.println();
		System.out.println("Prime Numbers on range of " + range + ":");
		System.out.println();
		PrimeNumbers primeNumbers = new PrimeNumbers(range);
		System.out.println(primeNumbers);
		
		scan.close();
	}
}
