package tr.org.linux.kamp.math;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen üçgenin ilk kenarını giriniz:");
		double edge1 = input.nextInt();
		System.out.println("Lütfen üçgenin ikinci kenarını giriniz:");
		double edge2 = input.nextInt();

		System.out.println("Üçgenin hipotenüsü " + getHypo(edge1, edge2) + ", " + " alanı " + getArea(edge1, edge2)
				+ ", " + "çevresi " + getPerimeter(edge1, edge2));
	}

	private static double getHypo(double edge1, double edge2) {

		double hypotenus = Math.hypot(edge1, edge2);

		return hypotenus;
	}

	private static double getArea(double edge1, double edge2) {

		return (edge1 * edge2) / 2;
	}

	private static double getPerimeter(double edge1, double edge2) {

		return edge1 + edge2 + getHypo(edge1, edge2);
	}

}
