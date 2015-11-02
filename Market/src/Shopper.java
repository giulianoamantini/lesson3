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

	public Cart fillCart(Supermarket market) throws Exception {
		Enumeration<Item> iterator = shoppingList.elements();
		while (iterator.hasMoreElements()) {
			Item item = iterator.nextElement();
			Vector<Item> foundItems = market.searchItem(item);
			if (!foundItems.isEmpty()) {
				Item selectedItem = getPreferredItem(foundItems, item);
				cart.add(selectedItem);
			}
		}
		return cart;
	}

	private Item getPreferredItem(Vector<Item> itemsFound, Item item)
			throws Exception {
		Item preferredItem = itemsFound.firstElement();
		Enumeration<Item> iterator = itemsFound.elements();
		while (iterator.hasMoreElements()) {
			double lowestPrice = 1e10;
			Item currentItem = iterator.nextElement();
			String description = currentItem.getDescription().toLowerCase();
			switch (shopperType) {
			case Price:
				if (currentItem.getPrice() < lowestPrice) {
					lowestPrice = currentItem.getPrice();
					preferredItem = currentItem;
				}
				break;
			case Quality:
				if (description.contains("organic")
						|| description.contains("grass fed")) {
					preferredItem = currentItem;
					break;
				}
				break;
			}
		}

		Item p = preferredItem;
		return new Item(item.getQuantity(), p.getDescription(), p.getPrice(),
				p.getBarcode());
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
