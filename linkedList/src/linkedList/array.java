package linkedList;
import java.util.ArrayList;
public class array{
	public static void main(String arg[]) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("banana");
		list.add("Cherry");
		list.add("Mango");
		String[] array=list.toArray(new String[0]);
		for(String item:array) {
		System.out.println(item);
		}
	
	}

}