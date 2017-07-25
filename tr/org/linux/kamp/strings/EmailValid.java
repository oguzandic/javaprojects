package tr.org.linux.kamp.strings;

import java.util.Scanner;

public class EmailValid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String mail = input.next();

		System.out.println(isValid(mail));
	}

	private static boolean isValid(String email) {

		if (email.contains(" ")) {
			return false;
		}

		if (!email.contains("@")) {
			return false;
		}

		if (!email.contains(".")) {
			return false;
		}

		if (email.startsWith("@") || email.startsWith(".")) {
			return false;
		}

		if (!(email.indexOf('@') + 1 < email.indexOf('.'))) {
			return false;
		}

		if (!(email.lastIndexOf('.') + 2 < email.length())) {
			return false;
		}

		return true;
	}

}
