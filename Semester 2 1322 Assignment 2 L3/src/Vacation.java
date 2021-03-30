//Developed by: Jimmy Nguyen
//02.01.2020
public abstract class Vacation {
	protected double budget = 0;
	protected String destination = "";

	public void Budget(double price) {
		double difference = 0;

		if (budget < price) {
			difference = price - budget;
			System.out.println("\nThe vacation was $" + difference + " over budget.");
		} else if (budget > price) {
			difference = budget - price;
			System.out.println("\nThe vacation was $" + difference + " under budget.");
		}
	}

	public void Budget(double[] costs) {
		double difference = 0;
		double totalCosts = 0;

		for (int i = 0; i < costs.length; i++) {
			totalCosts += costs[i];
		}
		if (budget < totalCosts) {
			difference = totalCosts - budget;
			System.out.println("\nThe vacation was $" + difference + " over budget.");
		} else if (budget > totalCosts) {
			difference = budget - totalCosts;
			System.out.println("\nThe vacation was $" + difference + " under budget.");
		}
	}

	@Override
	public String toString() {
		return "The budget is $" + budget + " , the destination is " + destination;
	}
}
