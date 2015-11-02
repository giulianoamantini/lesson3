
public class Cashier {
	public String checkOut(Cart cart){
		String receipt = "";
		double total = 0;
		while (!cart.isEmpty()){
			Item item = cart.removeOneItem();
			total += item.getPrice();
			receipt += item.getDescription() + " " + item.getBarcode() + " " + item.getPrice() + "\n"; 
		}
		receipt += "total " + total; 
		return receipt;
	}
}
