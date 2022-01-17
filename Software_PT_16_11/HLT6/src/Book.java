
public class Book {
	//Variable declaration
	String title;
	String author;
	String number_of_pages;
	String publisher;
	
	//getters and setters methods
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getNumberOfPages() {
		return number_of_pages;
	}
	
	public void setNumberOfPages(String number_of_pages) {
		this.number_of_pages = number_of_pages;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	

	public static void main(String[] args) {
		
		//Create obj of Book Class
		
		Book b1 = new Book();
		
		//using setters to initialise our attributes
		
		b1.setTitle("Java for Beginnners");
		b1.setAuthor("William Philip");
		b1.setNumberOfPages("200");
		b1.setPublisher("Alango Print");
		
		//using getters to display data
		
		System.out.println("Title: " + b1.getTitle());
		System.out.println("Author: " + b1.getAuthor());
		System.out.println("Number of Pages: " + b1.getNumberOfPages());
		System.out.println("Publisher: " + b1.getPublisher());
		

	}

}
