package tr.org.linux.kamp.montecarlo;

import java.util.Random;

public class MonteCarlo {
	private static Random rgen = new Random(2);
	static double in;
	static double all;

	public static void main(String[] args) {
		for (int i = 0; i < 15000; i++) {
			double a = rgen.nextDouble() - 1;
			double b = rgen.nextDouble() - 1;

			if (Math.pow(a, 2) + Math.pow(b, 2) < 1) {
				in++;
				all++;
			} else {
				all++;
			}
			System.out.println(closeToPi());
		}

	}

	public static double closeToPi() {
		return (in / all) * 4;
	}
}
