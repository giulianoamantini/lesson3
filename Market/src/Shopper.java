import java.util.Enumeration;
import java.util.Vector;

public class Shopper {
	private Vector<Item> shoppingList;
	private float wallet;
	private ShopperType shopperType;
	private Cart cart;

	public Shopper(float w, ShopperType s) {
		shoppingList = new Vector<Item>();
		setWallet(w);
		setShopperType(s);
		cart = new Cart();
	}

	public void Pay(float amount) throws Exception {
		if (amount <= wallet)
			wallet -= amount;
		else
			throw new Exception("Not enough cash in wallet!");
	}

	public Cart fillCart(Supermarket market) {
		Enumeration<Item> iterator = shoppingList.elements();
		while (iterator.hasMoreElements()) {
			Item item = iterator.nextElement();
			Vector<Item> foundItems = market.searchItem(item);
			Item selectedItem = getPreferredItem(foundItems);
			cart.add(selectedItem);
		}
		return cart;
	}

	private Item getPreferredItem(Vector<Item> itemsFound) {
		Item preferredItem;
		Enumeration<Item> iterator = itemsFound.elements();
		while (iterator.hasMoreElements()) {
			Item item = iterator.nextElement();
			switch (shopperType) {
			case Price:

				break;
			case Quality:
				if
				break;
			}
		}
		return preferredItem;
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
