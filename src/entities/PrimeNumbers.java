package entities;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	private int range;
	private List<Integer> primeNumbersOnRange = new ArrayList<>();
	private int quantity;
	private double densityOnRange;
	
	public PrimeNumbers(int range) {
		this.range = range;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public List<Integer> getPrimeNumbersOnRange(){
		
		primeNumbersOnRange = new ArrayList<>();
		
		if (range >= 2) {
			primeNumbersOnRange.add(2);
		}
		
		for (int i = 3; i<range; i+=2) {
		
			boolean prime = true;
			
			for (int j = i-1; j>2; j--) {
	
				if (i%j == 0) {
					prime = false;
				}
			}
			
			if (prime) {
				primeNumbersOnRange.add(i);
			}
		}
		
		return primeNumbersOnRange;
	}
	
	public int getQuantity() {
		quantity = getPrimeNumbersOnRange().size();
		return quantity;
	}
	
	public double getDensityOnRange() {
		densityOnRange = Double.valueOf(quantity)/range*100;
		return densityOnRange;
	}
	
	@Override
	public String toString() {
		
		primeNumbersOnRange = getPrimeNumbersOnRange();
		
		String primeNums = "";
		
		for (Integer i : primeNumbersOnRange) {
			primeNums += i + ", ";
		}
		if (primeNums.length() >= 2) {
			return primeNums.substring(0, primeNums.length()-2);
		}
		else {
			return "";
		}
	}
}
