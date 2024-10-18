package week1;

public class Library {

	public String addBook(String bookTitle) {
		
		System.out.println(bookTitle +" -Book Added Successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued Successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library bookLibrary=new Library();
		bookLibrary.addBook("The Psychology of Money");
		bookLibrary.issueBook();
	}

}
