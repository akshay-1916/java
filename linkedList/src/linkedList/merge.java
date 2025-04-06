package linkedList;
import java.util.ArrayList;
public class merge {
	public static void main(String arg[]) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Apple");
		list1.add("banana");
		
		ArrayList<String> list2=new ArrayList<>();

		list2.add("Cherry");
		list2.add("Mango");

        ArrayList<String> mergedList=new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
		System.out.println(mergedList);
	
	
	}

}
