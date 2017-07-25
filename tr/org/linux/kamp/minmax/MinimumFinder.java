package tr.org.linux.kamp.minmax;

import java.util.Scanner;
public class MinimumFinder {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen aralarına boşluk koyarak iki sayı tanımlayınız");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		double result = minimum(number1, number2);
		
		System.out.println("Girdiğiniz sayıların en küçüğü: "+result);
	}
	
	public static double minimum (double x, double y) {
		
		double minimumValue = x;
		
		if(y < minimumValue) {
			minimumValue = y;
		}
		
		return minimumValue;
	}
}
