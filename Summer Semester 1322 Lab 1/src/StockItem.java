import java.util.Random;

public class StockItem {
	String description = "";
	int variableId = 1;
	double variablePrice = 0.0;
	int variableQuantity = 0;

	StockItem() {

	}

	StockItem(String description, double variablePrice, int variableQuantity) {
		this.description = description;
		this.variablePrice = variablePrice;
		this.variableQuantity = variableQuantity;
		
		createId();
	}
	
	public void createId() {
		Random rand = new Random();
		
		variableId = rand.nextInt(100) + 1;
	}
	
	public void setPrice(double userInput) {
		this.variablePrice = userInput;
	}
	
	public void removeQuantity() {
		if(variableQuantity > 0) {
			this.variableQuantity--;
		}
	}
	
	public void addQuantity() {
			this.variableQuantity++;
	}

	@Override
	public String toString() {
		return "description: " + description + "\nvariableId: " + variableId + "\nvariablePrice: " + variablePrice
				+ "\nvariableQuantity: " + variableQuantity;

	}
}
