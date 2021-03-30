
public class Periodical extends Item{

	int issueNumber = 0;
	
	public Periodical(String name, int issueNumber) {
		super(name);
		// TODO Auto-generated constructor stub
		this.issueNumber = issueNumber;
	}

	@Override
	public String getListing() {
		// TODO Auto-generated method stub
		return title + issueNumber;
	}

}
