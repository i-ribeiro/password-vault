package pass_vault;
import pass_vault.User.*;


public class PasswordVault {

	public static void main(String[] args) {

	User user = new User();
	Userchild uc;
	
	user.greeting();
	
	System.out.println("Welcome, please choose from the following menu");
	user.printMenu();
	user.menuSelect();
	
	user.finish();
	
	
	
	
	}

}
