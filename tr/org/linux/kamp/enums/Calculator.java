package tr.org.linux.kamp.enums;


public enum Calculator {
	
	TOPLA , CIKAR , BOL , CARP;
	
	
	
	 double machine(double x, double y){
		
		switch (this) {
		case TOPLA:
			
			return (x+y);			
		case CIKAR:
			return (x-y);
		case CARP:
			return (x*y);
		case BOL:
			return (x/y);

		default:
			return x;
		}	
				
	}
	
}

