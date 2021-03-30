
public class Book extends Item{

	String author = "";
	int isbn = 0;
			
	public Book(String name, String author, int isbn) {
		super(name);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.isbn = isbn;
		
	}

	@Override
	public String getListing() {
		// TODO Auto-generated method stub
		return title + author + isbn;
	}

}
