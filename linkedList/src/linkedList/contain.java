package linkedList;
import java.util.ArrayList;
public class contain {
	public static void main(String arg[]) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("banana");
		list.add("Cherry");
		list.add("Mango");
		boolean hasBanana=list.contains("banana");
		
		System.out.println(hasBanana);
	
	
	}

}