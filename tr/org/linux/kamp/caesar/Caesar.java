package tr.org.linux.kamp.caesar;

import java.util.Scanner;

public class Caesar {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen mesajınızı giriniz:");
		
		String message = input.next();
		
		System.out.println("Lütfen bir anahar giriniz:");
		
		int key = input.nextInt();
		
		System.out.println("Şifreleme için 'E', çözümleme için 'D' giriniz. ");
		
		String operator = input.next();
		
		if(operator.equals("E")) {
			
			System.out.println(encrypt(message, key));
			
			
		}
		
		else if(operator.equals("D")) {
			
			
			System.out.println(decrypt(message, key));

			
		}
		
		else System.out.println("Hatalı bir operatör girdiniz.");
		
		
	}
	
	
	private static String encrypt(String message, int key) {
		
		if(key<0) {
			
			key = 26-(-key%26);
			
		}
		
		String result = "";
		
		for(int i=0; i<message.length(); i++) {
			
			char letter = message.charAt(i);
			
			if(Character.isLetter(letter)) {
				
				if(Character.isUpperCase(letter)) {
					
					 result += (char)('A' + (letter + key - 'A')%26);
					
				}
				
				else result += (char)('a' + (letter + key - 'a')%26);
			}
			
			else result += letter;
			
		}
		
		return result;
		
		
	}
	
	private static String decrypt(String message, int key) {
		
		return encrypt(message, -key);
		
		
	}
}
