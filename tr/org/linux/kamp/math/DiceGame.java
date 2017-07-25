package tr.org.linux.kamp.math;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	
	private static Random rgen = new Random();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci kullanıcının adını giriniz:");
		String name1 = input.next();
		System.out.println("İkinci kullanıcının adını giriniz:");
		String name2 = input.next();
		
		
		int dice1 = randomDice();
		int dice2 = randomDice();
		
		System.out.println(name1 + " "+ dice1  + " attı");
		System.out.println(name2 +  " "+ dice2 + " attı");
		
		if(dice1 > dice2) {
			System.out.println(name1 + " "+ dice1+ " attı ve kazandı");
		}
		if(dice1 == dice2) {
			System.out.println(name1 + " ve "+ name2 + dice1 + "attılar, oyun berabere");
		}
		else System.out.println(name2 + " "+ dice2 + " attı ve kazandı");
		
	}
	

	private static int randomDice() {
		
		int dice = rgen.nextInt(6)+1;
		
		return dice;		
		
	}
	

	
}
