package linkedList;
import java.util.ArrayList;
public class iterate {
	public static void main(String arg[]) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("banana");
		list.add("Cherry");
		list.add("Mango");
		
		for(String fruit:list) {
			System.out.println(fruit);
		}
	
	
	}

}