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
		// to add books to the library
		for(int i = 0; i < libo.books.length; i++)
		{
			if(libo.books[i] == null)
			{
				libo.books[i] = this;
				return;
			}
		}
	}
	// to return id & name of the book 
	public String toString()
	{
		return "Book name: " + super.getPublicationName() + "\n ID: " + super.getPublicationID() + "\n Publication date: " + super.getPublicationDate()
		+ "\n Author: " + author + "\n Taken: " + isTaken();
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
