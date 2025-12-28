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
		
		
		
		return primeNumbersOnRange;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getDensityOnRange() {
		return densityOnRange;
	}
	
	@Override
	public String toString() {
		
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
