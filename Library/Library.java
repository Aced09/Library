package Library;

public class Library {
	Book books[] = new Book[500];
	Periodical periodicals[] = new Periodical[200];
	int counterBook = 0;
	int counterPeriodical = 0;
	
	void availableContent()
	{
		
	}
	
	void addBook(Book newBook)
	{
		books[counterBook] = newBook;
		counterBook++;
	}
	
	void removeBook(Book book)
	{
		
	}
	
	void addPeriodical(Periodical newPeriodical)
	{
		periodicals[counterPeriodical] = newPeriodical;
		counterPeriodical++;
	}
	
	void removePeriodical(Periodical periodical)
	{
		
	}
}
