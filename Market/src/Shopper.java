import java.util.Vector;

public class Shopper {
	private Vector<Item> shoppingList;
	private float wallet;
	private ShopperType shopperType;
	private Cart cart;
	
	public Shopper(float w, ShopperType s){
		shoppingList = new Vector<Item>();
		setWallet(w);
		setShopperType(s);
	}

	public void Pay(float amount) throws Exception{
		if (amount <= wallet)
			wallet -= amount;
		else
			throw new Exception("Not enough cash in wallet!");
	}
	

	public void fillCart(Supermarket market) {
		
	}
	
	public Vector<Item> getShoppingList() {
		return shoppingList;
	}

	public void addToShoppingList(Item item) {
		shoppingList.add(item);
	}

	public float getWallet() {
		return wallet;
	}

	public void setWallet(float wallet) {
		this.wallet = wallet;
	}

	public ShopperType getShopperType() {
		return shopperType;
	}

	public void setShopperType(ShopperType shopperType) {
		this.shopperType = shopperType;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
