
public class myCollections {
	public static void main(String[] args){
	
	Item[] items = new Item[5];
	items[0] = new Book("Lord of the Rings ", "Tolkein ", 1234);
	items [1] = new Periodical("Times ",123);
	
	
	System.out.println(items[0].getListing());
	System.out.println(items[1].getListing());
	
	//Call obj.getListing() method here to display all the books and
	//Periodicals
	 }

}
