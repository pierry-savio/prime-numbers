package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrimeNumbersOnRange;
import util.StringWriter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		StringWriter sw = new StringWriter(100);
		
		//sw.write("teste final man", true);
		
		sw.write("Send a range: ");
		int range = scan.nextInt();
		System.out.println();
		
		PrimeNumbersOnRange primeNumbersOnRange = new PrimeNumbersOnRange(range);
		sw.write("Primes:", true);
		sw.setDelay(1);
		for (int i = 0; i< (String.valueOf(range).length()+2)*16; i++) {
			sw.write("-");
		}
		System.out.println();
		sw.write(primeNumbersOnRange.toString(), true);
		for (int i = 0; i< (String.valueOf(range).length()+2)*16; i++) {
			sw.write("-");
		}
		System.out.println();
		sw.setDelay(100);
		sw.write("Range: " + primeNumbersOnRange.getRange(),           true);
		sw.write("Quantity: " + primeNumbersOnRange.getQuantity(),     true);
		sw.write("Density: " + primeNumbersOnRange.getDensity() + "%", true);
		
		scan.close();
	}
}
