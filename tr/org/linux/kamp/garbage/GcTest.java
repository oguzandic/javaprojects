package tr.org.linux.kamp.garbage;

import java.nio.charset.MalformedInputException;

public class GcTest {
	
	int value;
	
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println("garbage collector çalıştı");
		
		
	}
	

}
