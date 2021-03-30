//Developed by: Jimmy Nguyen
//02.01.2020
public class PiecemealVacation extends Vacation {
	String[] items = new String[3];
	double[] costs = new double[3];

	PiecemealVacation(double budget, String destination, String[] items, double[] costs) {
		super();

		this.budget = budget;
		this.destination = destination;
		this.items = items;
		this.costs = costs;

	}

	@Override
	public String toString() {

		return super.toString() + ", and the items needed for the vacation are: " + " a " + items[0] + " that costs $"
				+ costs[0] + " a " + items[1] + " that costs $" + costs[1] + " and a " + items[2] + " that costs $"
				+ costs[2];
	}
}
