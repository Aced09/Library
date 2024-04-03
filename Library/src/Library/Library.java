package Library;

import java.util.Scanner;

public class Library {
	Book books[] = new Book[10];
	Periodical periodicals[] = new Periodical[10];
	private Customer custom[] = new Customer[10];
	private int customCounter = 0;
	private Scanner scan = new Scanner(System.in);
	
	
	void peekCustomers()
	{
		System.out.println("choose customer number or press 0 to exit: ");
		for(int i = 0; i<custom.length; i++)
		{	
			if(custom[i] != null)
			{
				System.out.println(i+1 + ". " + custom[i].getName());
			}
		}
		
		System.out.println();
		
		int r = scan.nextInt();
		int m;
		for(int i = 0; i<custom.length; i++)
		{
			if(r == 0)
			{
				return;
			}
			if (custom[i] != null && r == i+1)
			{
				System.out.println("choose action number:");
				System.out.println("1. add content");
				System.out.println("2. remove content");
				System.out.println("3. customer checkouts");
				System.out.println("4. back");
				System.out.println("5. close");
				m = scan.nextInt();
				if(m == 1)
				{
					availableContent();
					custom[r-1].check(this.books, this.periodicals);
					peekCustomers();
				}
				else if(m == 2)
				{
					custom[r-1].remove();
					peekCustomers();
				}
				else if(m == 3)
				{
					
					custom[r-1].customerBasket();
					peekCustomers();
				}
				else if(m == 4)
				{
					peekCustomers();
				}
				else if(m == 5)
				{
					return;
				}
			}
		}
	}
	
	void availableContent()
	{
		for(int i = 0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				System.out.println(books[i].toString());
				System.out.println();
			}
		}
		
		for(int i = 0; i<periodicals.length; i++)
		{
			if(periodicals[i] != null)
			{
				System.out.println(periodicals[i].toString());
				System.out.println();
			}
		}
		
	}
	

	
	void removeBook(Book book)
	{
		boolean found = false;
		for(int i = 0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				continue;
			}
			
			if(book.getPublicationName() == books[i].getPublicationName() && book.getPublicationID() == books[i].getPublicationID())
			{
				books[i] = null;
				found = true;
			}
		}
		
		if(found)
		{
			System.out.println("book has been removed");
			System.out.println();
		}
		else
		{
			System.out.println("book not found");
			System.out.println();
		}
	}
	
	
	void removePeriodical(Periodical periodical)
	{
		boolean found = false;
		for(int i = 0; i<books.length; i++)
		{
			if(periodicals[i] == null)
			{
				continue;
			}
			if(periodical.getPublicationName() == periodicals[i].getPublicationName() && periodical.getPublicationID() == periodicals[i].getPublicationID())
			{
				books[i] = null;
				found = true;
			}
		}
		
		if(found)
		{
			System.out.println("periodical has been removed");
			System.out.println();
		}
		else
		{
			System.out.println("periodical not found");
			System.out.println();
		}
	}

	public Customer[] getCustom() {
		return custom;
	}

	public void setCustom(Customer[] custom) {
		this.custom = custom;
	}

	public int getCustomCounter() {
		return customCounter;
	}

	public void setCustomCounter(int customCounter) {
		this.customCounter = customCounter;
	}


	
}
