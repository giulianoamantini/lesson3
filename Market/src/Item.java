
public class Item {
	// private members
	private int quantity;
	private String description;
	private double price;
	private int barcode;
	
	//constructors
	public Item(int q, String d, double p, int b){
		setQuantity(q);
		setDescription(d);
		setPrice(p);
		setBarcode(b);
	}
	
	public Item(int q, String d){
		setQuantity(q);
		setDescription(d);
		setPrice(0);
		setBarcode(0);
	}

	public void addQuantity(int q) throws Exception{
		if (q <= 0) throw new Exception("quantity must be positive");
		quantity += q;
	}
	
	public void removeQuantity(int q) throws Exception{
		if (q <= 0) throw new Exception("quantity must be positive");
		quantity -= q;
	}
	
	// getters and setters
	public int getQuantity() {
		return quantity;
	}

	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
}
