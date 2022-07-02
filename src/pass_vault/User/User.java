package pass_vault.User;
import java.util.Scanner;

public class User {
	
	String uI;
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	int menu;
	

	

public Userchild greeting() {
	System.out.println("Greetings!");
	System.out.println("Please enter username and password to unlock the vault");
	System.out.println("Username:");
	String u = scan.nextLine(); //username input
	System.out.println("Password:");
	String p = scan2.nextLine(); //password input 
	Userchild user = new Userchild(u, p); //making new object to compare to valid users
	// TODO Link this to authentication method 
	// TODO add an if statement that outputs based on the result 

	return user;
	
}
	
	
	
public String inputPassword() {	
	
System.out.println("Enter Password");
uI = scan.nextLine();
return uI;	
}
	

public void printMenu() {
	System.out.println("Press 1 for ....");
	System.out.println("Press 2 for ....");
	System.out.println("Press 3 for ....");
	System.out.println("Press 4 for ....");
	System.out.println("Press 5 for ....");
	System.out.println("Press 6 for ....");
}

public int menuSelect() {
	menu = scan.nextInt();
	
	switch(menu) {
	case 1:
		// method goes here
		break;
	case 2:
		//method goes here
		break;
	case 3:
		//method goes here
		break;
	case 4:
		//method goes here
		break;
	case 5:
		//method goes here 
		break;
	case 6:
		//method goes here 
		break;
		
		default:
			//code goes here
	}
	return menu;	
}
	

public boolean finish() {
	System.out.println("Would you like to continue using the vault? Y for yes N for no");
	boolean proceed = false;
	uI = scan.nextLine();
	if(uI.equalsIgnoreCase("Y")) {
		proceed = false;
	}
	else if(uI.equalsIgnoreCase("N")) {
		proceed = true;
	}
	
	while (proceed == false) {
			
	}
	
	return proceed;
	
	
}
	
	public String toString() {
		return uI;
		
		
	}
	
	

}
