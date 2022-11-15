package LibraryMS;

public class Book {

	int id;
	String title;
	String authorName;
	String publisherName;
	double price;
	int noOfCopy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfCopy() {
		return noOfCopy;
	}
	public void setNoOfCopy(int noOfCopy) {
		this.noOfCopy = noOfCopy;
	}
	
	 public void show() {
	        System.out.println("BookId             : "+getId());
	        System.out.println("Book Title         : "+getTitle());
	        System.out.println("Book AuthorName    : "+getAuthorName());
	        System.out.println("Book PublisherName : "+getPublisherName());
	        System.out.println("Book Price         : "+getPrice());
	        System.out.println("Number of Copy     : "+getNoOfCopy());
	        System.out.print("\n");
	    }

}
