/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		10
 */
import java.util.Scanner;
public class Stock {
	//attributes
	private String symbol = "";
	private  String name = "";
	private double previousClosingPrice = 0;
	private double currentPrice = 0;
	
	//constructor
	Stock(String name, String symbol) {
		
		this.name = name;
	
		this.symbol = symbol;
		
	}
	// group methods
	public String getName() {
		
		return name;
	}
	
	public String getSymbol() {
		
		return symbol;
	}
	// group methods
	public void setClosingPrice(double val) {
		//val is just a name given to be passed from the driver method
		this.previousClosingPrice = val;
	}
	
	public double getClosingPrice() {
		
		return previousClosingPrice;
	}
	// group methods
	public void setCurrentPrice(double val) {
		
		this.currentPrice = val;
	}
	
	public double getCurrentPrice() {
		
		return currentPrice;
	}
	// group methods
	public double getChangePercent() {
		double localGetChangePercent = 0;
		double previousClosingPrice = this.previousClosingPrice;
		double currentPrice = this.currentPrice;
		
		localGetChangePercent = (currentPrice - previousClosingPrice)/currentPrice * 100;
		
		return localGetChangePercent;
	}
	// group methods
	public String toString() {
		
		return name + " stock closing price is " + currentPrice;
	}
}
