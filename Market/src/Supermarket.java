import java.util.Enumeration;
import java.util.Vector;

public class Supermarket {
	private Cashier cashier;
	private Vector<Item> stock; 
	
	public Supermarket(){
		cashier = new Cashier();
		stock = new Vector<Item>(0, 10);
	}
	
	public Vector<Item> searchItem(Item item){
		String description = item.getDescription();
		Vector<Item> foundItems = new Vector<Item>(10, 5);
		Enumeration<Item> iterator = stock.elements();
		while(iterator.hasMoreElements()){
			Item stockItem = iterator.nextElement();
			String stockItemDescription = stockItem.getDescription();
			if (stockItemDescription.contains(description))
				foundItems.add(stockItem);
		}
		return foundItems;
	}
	
	public void addToStock(Item item){
		stock.addElement(item);
	}
	
	public Cashier getCashier(){
		return cashier;
	}
}
