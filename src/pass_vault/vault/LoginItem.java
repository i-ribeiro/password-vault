package pass_vault.vault;

/**
 * A VaultItem that has a username and password value.
 * @author Isaac Ribeiro
 */
public class LoginItem extends VaultItem {

	/**
	 * Login username.
	 */
	private String username;
	
	/**
	 * Login password.
	 */
	private String password;
	
	/**
	 * Construct a login item given a unique ID.
	 * @param id - a unique ID
	 */
	public LoginItem(int id) {
		super(id);
		
	}
	
	/**
	 * @return login username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @return login password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password - set login password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @param username - set login username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
}
