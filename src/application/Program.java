package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrimeNumbers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose one option:");
		System.out.println("1 - Prime Numbers on Range");
		System.out.println("2 - Quantity of Primes");
		System.out.print("N: ");
		int option = scan.nextInt();
		System.out.println();
		
		if (option == 1) {
		
			System.out.print("Range: ");
			int range = scan.nextInt();
			PrimeNumbers primeNumbers = new PrimeNumbers(range);
			System.out.println();
			
			if (range != 0) {
				System.out.println("Prime Numbers on range of " + range + ":");
				System.out.println();
				System.out.println("Primes: " + primeNumbers);
				System.out.println("Quantity: " + primeNumbers.getQuantity());
				System.out.println("Density: " + primeNumbers.getDensityOnRange() + "%");
			}
			else {
				primeNumbers.showInfitePrimeNumbers();
			}
		
		}
		else {
			System.out.print("Quantity: ");
			int range = scan.nextInt();
			PrimeNumbers primeNumbers = new PrimeNumbers(range);
			System.out.println();
			primeNumbers.getNPrimeNumbers(100);
			System.out.println(primeNumbers);
		}
		
		scan.close();
	}
}
