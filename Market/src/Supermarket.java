import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Vector;

public class Supermarket {
	private Vector<Cart> carts;
	private Vector<Cashier> cashier;
	private Dictionary<Integer, Item> stock; 
	
	public Supermarket(int nCarts, int nCashiers){
		carts = new Vector<Cart>(nCarts);
		stock = new Hashtable<>();
	}
	
	public void searchItem(String d){
		
	}
	
	public void addToStock(Item item){
		
	}
}
