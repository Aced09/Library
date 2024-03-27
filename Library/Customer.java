package Library;

public class Customer {
	private String name;
	private String phonenumber;
	private Book books[] = new Book[3];
	private Periodical periodicals[] = new Periodical[3];
	
	void checkoutBook(Book book)
	{
		if(ismax())
		{
			System.out.println("Your basket is full");
		}
		else
		{
			int i = 0;
			
			while(books[i] != null && i <= 2)
			{
				i++;
			}
			
			if(i != 3)
			{
				books[i] = book;
			}
		}
	}
	
	void checkoutPeriodical(Periodical periodical)
	{

	}
	
	boolean ismax()
	{
		return true;
	}
	
	void returnBook(Book book)
	{
		
	}
	
	void returnPeriodical(Periodical periodical)
	{
		
	}
	
	Customer()
	{
		
	}
	
	Customer(String name, String phonenumber)
	{
		this.name = name;
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}