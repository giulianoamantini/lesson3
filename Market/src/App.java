
public class App {

	public static void main(String[] args) {
		Supermarket hannaford = new Supermarket(10, 3);
		
		Shopper shopper1 = new Shopper(2000, ShopperType.Quality);
		Shopper shopper2 = new Shopper(800, ShopperType.Price);
		
		shopper1.addToShoppingList(new Item(1, "bread"));
		shopper1.addToShoppingList(new Item(2, "carrot"));
		shopper1.addToShoppingList(new Item(1, "salad"));
		shopper1.addToShoppingList(new Item(3, "pasta"));
		shopper1.addToShoppingList(new Item(1, "steak"));
		
		shopper2.addToShoppingList(new Item(1, "fish"));
		shopper2.addToShoppingList(new Item(3, "apple"));
		shopper2.addToShoppingList(new Item(1, "banana"));
		
		shopper1.fillCart(hannaford);
		shopper2.fillCart(hannaford);
		
	}

}
