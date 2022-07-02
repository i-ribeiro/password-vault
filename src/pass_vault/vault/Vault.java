package pass_vault.vault;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 * Vault containing VaultItems. 
 * @author Isaac Ribeiro
 *
 */
public class Vault {

	private Map<Integer, VaultItem> itemMap;
	
	public Vault() {
		
		itemMap = new HashMap<Integer, VaultItem>();
	}
	
	public int addItem(VaultItem i) {
		
		int id = i.getID();
		itemMap.put(id, i);
		
		return id;
	}
	
	public VaultItem getItem(int id) {
		
		return itemMap.get(id);
	}
	
	public int getUniqueID() {
		
		SecureRandom rand = new SecureRandom();
		
		int id;
		do id = rand.nextInt();
		while (itemMap.containsKey(id));
		
		return id;
	}
}
