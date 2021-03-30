//********************************************************************
//Item.java/cs
// A class that holds the name of an Item and has abstract method
//getListing()
public abstract class Item {
	protected String title;

	public Item(String name) {
		this.title = name;
	}

	public abstract String getListing();

	public String getTitle() {
		return title;
//To be completed
	}
}
