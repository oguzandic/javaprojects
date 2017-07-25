package tr.org.linux.kamp.enums;

public class DaysTest {

	static Day day;
	
	public DaysTest(Day day) {
		
		this.day = day;
		
	}
	public static void tellAboutDay() {
		
		switch (day) {
		case PAZARTESI :
			System.out.println("Pazartesi iğrençtir");
			break;
		case CUMA :
			System.out.println("Cuma güzeldir");
			break;
		case CUMARTESI :
			System.out.println("Haftasonu süperdir");
			break;


		default:
			System.out.println("Diğer günler");
		}
		
	}
	
	public static void main(String[] args) {
		
		DaysTest firstDay = new DaysTest(Day.PAZARTESI);
		firstDay.tellAboutDay();
		
	}
	
}
