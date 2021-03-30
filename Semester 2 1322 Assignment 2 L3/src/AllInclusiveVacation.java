//Developed by: Jimmy Nguyen
//02.01.2020
public class AllInclusiveVacation extends Vacation {
	String brand = "";
	double rating = 0;
	double price = 0.0;

	AllInclusiveVacation(double budget, String destination, String brand, double rating, double price) {

		//super();

		this.budget = budget;
		this.destination = destination;
		this.brand = brand;
		this.rating = rating;
		this.price = price;

	}

	@Override
	public String toString() {
		return super.toString() + ", the brand is " + brand + " , the rating is " + rating + " stars "
				+ ", and\nthe price is $" + price + ".";
	}
}
