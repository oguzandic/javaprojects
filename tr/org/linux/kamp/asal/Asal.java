package tr.org.linux.kamp.asal;

import java.util.Scanner;

public class Asal {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int loop = 0;
		int num = 2 ;
		boolean isPrime = true;
		
		while(loop<count) {
			
			for(int i = 2; i < num; i++) {
				
				if(num %i == 0) {
					
					isPrime = false;
					break;
				}
				
			}
			
			if(isPrime) {
				loop++;
				System.out.println(num + "");
				
			}
			num++;
			isPrime = true;
			
		}
	}
	
	
	
			
	


}

