import java.util.Vector;

public class shopper {
	private Vector<String> shoppingList;
	private float wallet;
	
	public shopper(){
		setShoppingList(new Vector<String>());
	}

	public Vector<String> getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(Vector<String> shoppingList) {
		this.shoppingList = shoppingList;
	}

	public float getWallet() {
		return wallet;
	}

	public void setWallet(float wallet) {
		this.wallet = wallet;
	}
}
