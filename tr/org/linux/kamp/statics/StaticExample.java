package tr.org.linux.kamp.statics;

public class StaticExample {
	
	public static String myStaticString = "BU BİR STATİK STRINGDİR";
	
	public static String myStringMethod() {
		
		
		return "BU BİR STATİK METOD";
	}
	
	static {
		System.out.println("bu bir statik blok");
	}
	static {
		System.out.println("bu bir statik blok");
	}
	static {
		System.out.println("bu 3. statil blok");
	}
	
	
}
