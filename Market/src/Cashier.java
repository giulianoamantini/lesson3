
public class Cashier {
	public String checkOut(Cart cart){
		String receipt = "";
		double total = 0;
		while (!cart.isEmpty()){
			Item item = cart.removeOneItem();
			total += item.getPrice();
			receipt += String.format("%20s......%6s.......$%5s\n", item.getDescription(), item.getBarcode(), item.getPrice()); 
		}
		receipt += String.format("TOTAL%40s\n", String.format("$%s", total)); 
		return receipt;
	}
}
