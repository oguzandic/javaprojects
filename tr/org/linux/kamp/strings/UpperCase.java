package tr.org.linux.kamp.strings;

public class UpperCase {

	public static void main(String[] args) {
		
		String str = "hello world";
		System.out.println(toUpper(str));
	}
	
	public static String toUpper(String str) {
		
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			
			result += Character.toUpperCase(str.charAt(i));
			
		}
		
		
		return result;
		
		
	}
	
}
