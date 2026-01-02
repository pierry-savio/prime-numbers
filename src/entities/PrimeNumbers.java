package entities;

public class PrimeNumbers {
	
	public PrimeNumbers() {}
	
	public static void showInfitePrimeNumbers() {
		
		System.out.println("#1 - 2");
		int count = 1;
		
		for (int i = 3; i>2; i+=2) {
			if (isPrime(i)) {
				count++;
				System.out.println("#" + count + " - " + i);
			}
		}
	}
	
	public static boolean isPrime(int number) {
		
		boolean prime = true;
		
		for (int j = number-1; j>1; j--) {
			if (number%j == 0) {prime = false;};
		}
		return prime;
	}
}
