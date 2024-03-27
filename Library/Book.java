package Library;

public class Book extends Publication {
	private String author;
	private String checkoutDate;
	private int NOP;
	private boolean taken;
	
	
	Book()
	{
		
	}
	
	Book(int publicationNumber, String publicationAddress, String publicationDate, String author, String checkoutDate, int NOP, boolean taken)
	{
		super(publicationNumber, publicationAddress, publicationDate);
		this.author = author;
		this.checkoutDate = checkoutDate;
		this.NOP = NOP;
		this.taken = taken;
	}
	
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public int getNOP() {
		return NOP;
	}

	public void setNOP(int nOP) {
		NOP = nOP;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}
}