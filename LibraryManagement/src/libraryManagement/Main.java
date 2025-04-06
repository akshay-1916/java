package libraryManagement;


public class Main {
	public static void main(String arg[]) {
		Library2 library=new Library2(5);
		
		library.addBook(new Library("The Alchemist","Paulo Coelho","349083-34779"));
		library.addBook(new Library("The Alchemist","Paulo Coelho","349083-34779"));

		library.displayBooks();
	}
}