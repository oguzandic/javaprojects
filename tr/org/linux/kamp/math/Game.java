package tr.org.linux.kamp.math;

import java.util.Random;

public class Game {

	private static Random rgen = new Random();

	public static void main(String[] args) {
		
		System.out.println(chooseRandomCard());

	}

	private static String chooseRandomCard() {

		// rank

		// suit

		return chooseRandomSuit() + chooseRandomRank();

	}

	private static String chooseRandomRank() {

		int rank = rgen.nextInt(13);

		if (rank == 0) {
			return " AS";
		}
		if (rank == 10) {
			return " VALE";
		}
		if (rank == 11) {
			return " KIZ";
		}
		if (rank == 12) {
			return " PAPAZ";
		}
		else return " "+rank;
		
		
	}

	private static String chooseRandomSuit() {

		int suit = rgen.nextInt(4);
		if (suit == 0) {
			return "MAÇA";
		}
		if (suit == 1) {
			return "KUPA";
		}
		if (suit == 2) {
			return "SİNEK";
		}
		if (suit == 3) {
			return "KARO";
		}
		
		else return "";

	}
}
