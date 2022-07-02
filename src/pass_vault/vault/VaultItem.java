package pass_vault.vault;

/**
 * The base class of all vault items.
 * Each VaultItem has a unique ID.
 * @author Isaac Ribeiro
 */
public class VaultItem {

	/**
	 * The unique identifier for this vault item.
	 */
	private int id;
	
	/**
	 * The vault item's name.
	 */
	private String name;
	
	/**
	 * Construct a login item given a unique ID.
	 * @param id - a unique ID
	 */
	VaultItem(int id) {
		
		this.id = id;
	}

	/**
	 * @return item name
	 */
	public String getName() {
		
		return name;
	}

	/**
	 * @param name - set item name
	 */
	public void setName(String name) {
		
		this.name = name;
	}

	/**
	 * @return a unique ID
	 */
	public int getID() {
		
		return id;
	}
}
