package tr.org.linux.kamp.row;


public class Row {

	public static void main(String[] args) {
		
		int row = 6 ; 
		
		for(int i = row; i >=1; i--) {
			for(int j = i ; j >=1; j--) {
				System.out.print(j+ " ");
			}
			for(int k = 2; k <=i ; k++) {
				System.out.println(k+ " ");
			}
		}
		System.out.println(" ");
		

	}
}
