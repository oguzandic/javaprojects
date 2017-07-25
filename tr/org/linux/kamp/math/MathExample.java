package tr.org.linux.kamp.math;

import java.util.Scanner;

public class MathExample {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			
			if(num % i == 0) {
				
				isPrime = false;
				
				break;
			}
			
			
		}
		
		if(isPrime) {
			
			System.out.println(num + " bir asal sayı");
		}
		
		else System.out.println(num + " bir asal sayı değil");
		
	}

}

