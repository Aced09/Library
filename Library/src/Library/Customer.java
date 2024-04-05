package Library;

import java.util.Scanner;

public class Customer {
	private String name;
	private String phonenumber;
	private Book books[] = new Book[3];
	private Periodical periodicals[] = new Periodical[3];
	private Scanner scan = new Scanner(System.in);
	
	Customer()
	{
		
	}
	
	Customer(String name, String phonenumber, Library librar)
	{
		this.name = name;
		this.phonenumber = phonenumber;
		
		
		librar.getCustom()[librar.getCustomCounter()] = this;
		librar.setCustomCounter(librar.getCustomCounter()+1);;
	}
	// checkout customer basket
	void customerBasket()
	{
		
		System.out.println("Books checked out for " + name + ":");
		// to print books inside basket
		for(int i = 0; i < books.length; i++)
		{
			if(books[i] != null)
			{
				System.out.println("(ID) " + books[i].getPublicationID() + "(Name) " + books[i].getPublicationName());
			}
		}
		System.out.println();
		
		
		System.out.println("Periodical checked out for " + name + ":");
		// to print periodicals inside basket
		for(int i = 0; i < periodicals.length; i++)
		{
			if(periodicals[i] != null)
			{
				System.out.println("(ID) " + periodicals[i].getPublicationID() + " (Name) " + periodicals[i].getPublicationName());
			}
		}
		System.out.println();
		
	}
	// to checkout basket is full or not
	boolean ismax(int numOfContent)
	{
		int counter = 0;
		for(int i = 0; i <= 2; i++)
		{
			if(books[i] != null)
			{
				counter++;
			}
			if(periodicals[i] != null)
			{
				counter++;
			}
		}
		
		if (counter + numOfContent > 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	void check(Book libooks[], Periodical liperiodicals[])
	{
		if(ismax(1))
		{
			System.out.println("Not enough room in basket");
			System.out.println();
			return;
		}
		System.out.println("place an id of the content you'd like to checkout");
		int thing = scan.nextInt();
		
		for(int i =  0; i<libooks.length; i++)
		{
			if(libooks[i] == null)
			{
				continue;
			}
			
			if(libooks[i].getPublicationID() == thing)
			{
				System.out.println("are you sure you want "+ libooks[i].getPublicationName() );
				String option = scan.next();
				if(option.toLowerCase().equals("yes"))
				{
					if(libooks[i].isTaken())
					{
						System.out.println(libooks[i].getPublicationName() + " (id num: " + libooks[i].getPublicationID() + ")" + " is already taken");
						return;
					}
					checkoutBookorPeriodical(libooks[i]);
				}
				else if(option.toLowerCase().equals("no"))
				{
					check(libooks, liperiodicals);
				}
			}
		}
		for(int i =  0; i<liperiodicals.length; i++)
		{
			if(liperiodicals[i] == null)
			{
				continue;
			}
			
			if(liperiodicals[i].getPublicationID() == thing)
			{
				System.out.println("are you sure you want " + liperiodicals[i].getPublicationName());
				String option = scan.next();
				if(option.toLowerCase().equals("yes"))
				{
					if(liperiodicals[i].isTaken())
					{
						System.out.println(liperiodicals[i].getPublicationName() + " (id num: " + liperiodicals[i].getPublicationID() + ")" + " is already taken");
						return;
					}
					checkoutBookorPeriodical(liperiodicals[i]);
				}
				else if(option.toLowerCase().equals("no"))
				{
					check(libooks, liperiodicals);
				}
			}
		}
	}
	// add books & Periodicals to the customer's basket
	private void checkoutBookorPeriodical(Publication p)
	{
		
		if(p instanceof Book)
		{
			for(int i = 0; i<books.length; i++)
			{
				if(books[i] == null)
				{
					p.setTaken(true);
					books[i] = (Book) p;
					
					return;
				}
			}
		}
		
		if(p instanceof Periodical)
		{
			for(int i = 0; i<periodicals.length; i++)
			{
				if(periodicals[i] == null)
				{
					p.setTaken(true);
					periodicals[i] = (Periodical) p;
					return;
				}
			}
		}
	}
	
	// to remove books or Periodicals from basket
	void remove()
	{
		System.out.println("write id of content you want to remove");
		for(int i = 0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				System.out.println(books[i].getPublicationID() + " " + books[i].getPublicationName());
			}
		}
		
		for(int i = 0; i<periodicals.length; i++)
		{
			if(periodicals[i] != null)
			{
				System.out.println(periodicals[i].getPublicationID() + " " + periodicals[i].getPublicationName());
			}
		}
		
		
		int n = scan.nextInt();
		for(int i = 0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				continue;
			}
			if(books[i].getPublicationID() == n)
			{
				books[i] = null;
				System.out.println("book removed");
			}
		}
		for(int i = 0; i<periodicals.length; i++)
		{
			if(periodicals[i] == null)
			{
				continue;
			}
			if(periodicals[i].getPublicationID() == n)
			{
				periodicals[i] = null;
				System.out.println("periodical removed");
			}
		}
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
