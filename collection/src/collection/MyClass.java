package collection;
import java.util.*;
public class MyClass {
	public static void main(String arg[]) {
		List list=new ArrayList();
		list.add(100);
		list.add(344);
		list.add(56,44);
		list.add('q');
		list.add(null);
		list.add(344);
		System.out.println(list);
		
		boolean ans=list.contains("rose");
		System.out.println(ans);
		
		Object ob=list.get(4);
		System.out.println(ob);
		
		int index=list.indexOf(344);
		System.out.println(index);
		
		int lastindex=list.lastIndexOf(344);
		System.out.println(lastindex);
		
		ArrayList<Integer> listnew=new ArrayList<Integer>();
		listnew.add(55);
		listnew.add(12);
		System.out.println(listnew);
		
	}

}
