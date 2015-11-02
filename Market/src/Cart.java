import java.util.Stack;

public class Cart {
	private Stack<Item> shoppingCart = new Stack<Item>();

	// constructor
	public Cart(){};
	
	public void add(Item item){
		shoppingCart.add(item);
	}
	
	public void remove(Item item){
		shoppingCart.remove(item);
	}
	
	public Item removeOneItem(){
		return shoppingCart.pop();
	}
	
	public Boolean isEmpty(){
		return shoppingCart.empty();
	}
}
