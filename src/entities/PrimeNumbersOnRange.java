package entities;

import java.util.ArrayList;
import java.util.List;

/*
	public List<Integer> getNPrimeNumbers(int quantity){
		
		this.quantity = quantity;
		
		primeNumbersOnRange = new ArrayList<>();
		
		if (quantity >= 1) {
			primeNumbersOnRange.add(2);
		}
		
		int i = 3;
		
		while (quantity > 1) {
			
			boolean prime = true;
			
			for (int j = i-1; j>2; j--) {
	
				if (i%j == 0) {
					prime = false;
				}
			}
			
			if (prime) {
				primeNumbersOnRange.add(i);
				quantity--;
			}
			
			i+=2;
		}
		return primeNumbersOnRange;
	}
*/


public class PrimeNumbersOnRange extends PrimeNumbers {

	private int range;
	private int quantity;
	private double density;
	
	List<Integer> primeNumbersOnRange = new ArrayList<>(); 
	
	public PrimeNumbersOnRange(int range) {
		this.range = range;
		
		for(int i = 2; i<range; i++) {
			if (isPrime(i)) {
				primeNumbersOnRange.add(i);
			}
		}
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getQuantity() {
		quantity = primeNumbersOnRange.size();
		return quantity;
	}

	public double getDensity() {
		density = Double.valueOf(primeNumbersOnRange.size()) / range * 100;
		return density;
	}

	public List<Integer> getPrimeNumbersOnRange() {
		return primeNumbersOnRange;
	}
	
	@Override
	public String toString() {
		
		int count = 0;
		String primeNumbers = "";
		
		for (int prime : primeNumbersOnRange) {
			
			for (int i = 0; i<String.valueOf(range).length()-1 - String.valueOf(prime).length(); i++) {
				primeNumbers+=" ";
			}
			
			primeNumbers += prime + ", ";
			count++;
			
			if (count >= 16) {
				primeNumbers += "\n";
				count = 0;
			}
		}
		return primeNumbers.substring(0, primeNumbers.length()-2) + ".";
	}
}
