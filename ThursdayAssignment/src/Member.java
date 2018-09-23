
public class Member {
	private String name;
	private Book book;
	
	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void status() {
		if(book == null)
			System.out.println("Book is not issued to anyone ");
		else
			System.out.println("Book issued to "+book.getTitle());
		
	}


	
}
