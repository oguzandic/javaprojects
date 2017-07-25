package tr.org.linux.kamp.account;

public class AccountApplication {

	public static void main(String[] args) {

		Account myAccount = new Account("Ian Curtis", 500);
		Account myAccount2 = new Account("Yavuz Çetin",300);
		Account myAccount3 = new Account();

		myAccount3.deposit(3000);

		myAccount3.setName("Kerim Çaplı");
		
		System.out.println(myAccount.getName());
		System.out.println(myAccount.getBalance());
		
		System.out.println(myAccount2.getName());
		System.out.println(myAccount2.getBalance());
		

		System.out.println(myAccount3.getName());
		System.out.println(myAccount3.getBalance());
		
	}

}
