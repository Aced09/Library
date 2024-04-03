package Library;


public class Main {
 public static void main(String[] args) {
	
	Library libo = new Library();
	Book b = new Book("hunger", "21/03/03", "malik", 200, libo);
	Book c = new Book("hung", "21/03/03", "bruh", 220, libo);
	Book d = new Book("bruh", "22/02/02", "bruh", 250, libo);
	Periodical e = new Periodical("the origins of code", "03/12/12", "magazine", libo);
	Customer cs = new Customer("Ace", "0921892371", libo);
	Customer ms = new Customer("malak", "0921298373", libo);
	
	libo.peekCustomers();
	}
}