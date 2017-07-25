package tr.org.linux.kamp.student;

public class StudentApplication {

	public static void main(String[] args) {

		Student student1 = new Student("Zekai", 80);

		System.out.println(student1.getName() + "'nin harf notu:f" + student1.getLetterGrade());
	}

}
