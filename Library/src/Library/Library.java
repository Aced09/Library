package Library;

import java.util.Scanner;

public class Library {
	Book books[] = new Book[10];
	Periodical periodicals[] = new Periodical[10];
	private Customer custom[] = new Customer[10];
	private int customCounter = 0;
	private Scanner scan = new Scanner(System.in);
	
	// applies library services
	void peekCustomers()
	{
		System.out.println("choose customer number or press 0 to exit: ");
		// show customers names
		for(int i = 0; i<custom.length; i++)
		{	
			if(custom[i] != null)
			{
				System.out.println(i+1 + ". " + custom[i].getName());
			}
		}
		
		System.out.println();
		
		int customNum = scan.nextInt();
		int choices;
		for(int i = 0; i<custom.length; i++)
		{
			if(customNum == 0)
			{
				return;
			}
			if (custom[i] != null && customNum == i+1)
			{
				System.out.println("choose action number:");
				System.out.println("1. add content");
				System.out.println("2. remove content");
				System.out.println("3. customer checkouts");
				System.out.println("4. back");
				System.out.println("5. close");
				choices = scan.nextInt();
				if(choices == 1)
				{
					availableContent();
					custom[customNum-1].check(this.books, this.periodicals);
					peekCustomers();
				}
				else if(choices == 2)
				{
					custom[customNum-1].remove();
					peekCustomers();
				}
				else if(choices == 3)
				{
					
					custom[customNum-1].customerBasket();
					peekCustomers();
				}
				else if(choices == 4)
				{
					peekCustomers();
				}
				else if(choices == 5)
				{
					return;
				}
			}
		}
	}
	// to print book & periodicals information 
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
	

	// to remove book from the library
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
	
	// to remove periodical from the library
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
