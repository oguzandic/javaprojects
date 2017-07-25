package tr.org.linux.kamp.ascii;

import java.util.Random;

public class karakterler {
	
	private static Random rand = new Random();
	public static void main(String[] args) {
		
		int generated = rand.nextInt(26)+65;
		System.out.println(" "+ (char)generated);
	}
}
