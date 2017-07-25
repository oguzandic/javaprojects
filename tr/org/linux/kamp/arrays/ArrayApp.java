package tr.org.linux.kamp.arrays;

import java.util.Random;

public class ArrayApp {

	private static Random rand = new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];

	public static void main(String[] args) {

		generateArray();
		printArray();
		sortArray();

		System.out.println("Dizinin ortalaması " + average());

	}

	private static void generateArray() {

		int generated;

		for (int i = 0; i < array.length; i++) {

			generated = rand.nextInt(100);
			array[i] = generated;

		}

	}

	private static void printArray() {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

	}

	public static void sortArray() {
		int temp;
		int max;
		int min;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {

				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		min = array[0];
		max = array[9];

		System.out.println("Dizinin en küçük elemanı " + min + " & En büyük elemanı " + max);

	}

	public static double average() {

		double result = 0;
		int total = 0;
		for (int i = 0; i < array.length; i++) {

			total = total + array[i];
			result = (total - (array[0] + array[9])) / 8;

		}
		return result;

	}

}
