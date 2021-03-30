/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		10
 */
public class MainStock {
	
	public static void main(String[] args) {
		
		Stock stock1 = new Stock("Google", "GOG");
		
		stock1.setClosingPrice(134.67);
		stock1.setCurrentPrice(131.98);
		
		System.out.println(stock1.getName() + " stock:");
		System.out.println("\tSymbol: " + stock1.getSymbol());
		System.out.println("\tClosing price: " + stock1.getClosingPrice());
		System.out.println("\tCurrent Price: " + stock1.getCurrentPrice());
		System.out.println("\tChange percent: " + Math.round(stock1.getChangePercent()) + "%");
		System.out.println("\t" + stock1.toString());
		
		System.out.println();
		
		Stock stock2 = new Stock("Microsoft", "MSF");
		
		stock2.setClosingPrice(156.52);
		stock2.setCurrentPrice(161.22);
		
		System.out.println(stock2.getName() + " stock:");
		System.out.println("\tSymbol: " + stock2.getSymbol());
		System.out.println("\tClosing price: " + stock2.getClosingPrice());
		System.out.println("\tCurrent Price: " + stock2.getCurrentPrice());
		System.out.println("\tChange percent: " + Math.round(stock2.getChangePercent()) + "%");
		System.out.println("\t" + stock2.toString());
	}
	
	
	
}
