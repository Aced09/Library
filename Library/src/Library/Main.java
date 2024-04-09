package Library;


public class Main {
 public static void main(String[] args) {
	
	Library libo = new Library();
	
	Book book1 = new Book("hunger", "21/03/03", "malik", 200, libo);
	Book book2 = new Book("hung", "21/03/03", "bruh", 220, libo);
	Book book3 = new Book("bruh", "22/02/02", "bruh", 250, libo);
	Periodical Periodical1 = new Periodical("the origins of code", "03/12/12", "magazine", libo);
	
	Customer custom1 = new Customer("Ace", "0921892371", libo);
	Customer custom2 = new Customer("malak", "0921298373", libo);
	
	//call this method to show library services & customers 
	libo.peekCustomers();
	}
}
