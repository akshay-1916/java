package libraryManagement;

public class Library {

	String title;
	String author;
	String isbn;
	
	Library(String title,String author,String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	void displayBooks() {
		System.out.println("Title: "+title+",Author: "+author+",ISBN: "+isbn);
	}

}


class Library2{
	Library[] books;
	int count=0;
	
	Library2(int size){
		books=new Library[size];
		count=0;
	}
	
	void addBook(Library book) {
		if(count<books.length) {
			books[count]=book;
			count++;
		}
		else {
			System.out.println("Library is full!");
		}
	}
}



