package linkedList;
import java.util.ArrayList;
public class clear {
	public static void main(String arg[]) {
		ArrayList<String> animal=new ArrayList<>();
		animal.add("Cat");
		animal.add("Dog");
		
		animal.clear();
		
		System.out.println(animal.isEmpty());
	}

}
