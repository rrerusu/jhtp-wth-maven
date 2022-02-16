package edu.tamu.cs;

import java.security.SecureRandom;

public class RandomIntegers {
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int face;
		
		for(int counter = 1; counter <= 20; counter++) {
			face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d  ", face);
			
			if(counter % 5 == 0)
				System.out.println();
		}
	}
}
