package Library;

public class Book extends Publication {
	private String author;
	private String checkoutDate = "00/00/00";
	private int NOP;
	
	
	Book()
	{
		
	}
	
	Book(String publicationName, String publicationDate, String author, int NOP, Library libo)
	{
		super(publicationName, publicationDate);
		this.author = author;
		this.NOP = NOP;
		
		for(int i = 0; i < libo.books.length; i++)
		{
			if(libo.books[i] == null)
			{
				libo.books[i] = this;
				return;
			}
		}
	}
	
	public String toString()
	{
		return "Book id: " + super.getPublicationID() + "\n" + "Book name: " + super.getPublicationName();
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


}