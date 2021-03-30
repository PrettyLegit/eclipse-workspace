
public class StockItem_Main {
	public static void main(String[] args) {
		StockItem s1 =  new StockItem("Berries", 2.20, 30);
		
		//print contents
		System.out.println(s1.toString());
		System.out.println();
		
		//demonstrate set price
		s1.setPrice(.50);
		
		System.out.println(s1.toString());
		System.out.println();
		
		//demonstrate add
		s1.addQuantity();
		
		System.out.println(s1.toString());
		System.out.println();
		
		//demonstrate remove
		s1.removeQuantity();
		
		System.out.println(s1.toString());
		System.out.println();
	}
}
