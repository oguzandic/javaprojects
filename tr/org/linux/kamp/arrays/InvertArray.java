package tr.org.linux.kamp.arrays;

import java.util.Arrays;


public class InvertArray {
	
	

		public static void main(String[] args) {
			int[] intArray = {28,05,2013,1917,2014,2017,1923};
			
			System.out.println("Array: " + Arrays.toString(intArray));
			
			for(int i = 0; i < intArray.length / 2; i ++) {
				int x = intArray[i];
				intArray[i] = intArray[intArray.length -i -1];
				intArray[intArray.length -i -1] = x;
			}
			
			System.out.println("Ters array: " + Arrays.toString(intArray));
		}

	}


