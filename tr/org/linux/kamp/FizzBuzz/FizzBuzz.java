package tr.org.linux.kamp.FizzBuzz;



public class FizzBuzz {

		public static void main(String[] args) {
			
			
			
			int counter;
			
			for(counter=1; counter <50; counter++) {
				
				if(counter%15 == 0) {
					System.out.println(counter + " fizzbuzz");
				}
				else if(counter%5 == 0) {
					System.out.println(counter + " buzz");
				
				}
				else if(counter%3 == 0) {
					System.out.println(counter + " fizz");
				}
				
				else System.out.println(counter);
			}
			

			

			
			
		}
}
