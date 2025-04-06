package linkedList;

import java.util.ArrayList;
public class checkempty {
	public static void main(String arg[]) {
		ArrayList<Integer> number=new ArrayList<>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		
		if(number.isEmpty()) {
			System.out.println("Empty");
		}
		else {
			System.out.println("not Empty");
		}
;	}

}
