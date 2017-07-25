package tr.org.linux.kamp.math;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Kürenin yarıçapını giriniz");

		int radius = input.nextInt();

		System.out.println("Kürenin hacmi " + volume(radius));
	}

	private static double volume(int radius) {

		return (Math.pow(radius, 3)) * 4 / 3 * (Math.PI);

	}

}
