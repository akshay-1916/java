package linkedList;
import java.util.ArrayList;
public class clone {
	public static void main(String arg[]) {
		ArrayList<String> animal=new ArrayList<>();
		animal.add("Cat");
		animal.add("Dog");
		
		ArrayList<String> c=(ArrayList<String>) animal.clone();
		
		c.add("Lion");
		System.out.println("original"+animal);
		System.out.println("Copy"+c);
	}

}
