package strings;
import java.util.*;
public class s {
	public static void main(String arg[]) {
		StringBuilder sb=new StringBuilder("Tony");
		System.out.println(sb);
		
//	char at index 0
		System.out.println(sb.charAt(0));
		
//		set char at index
		sb.setCharAt(0, 'p');
		System.out.println(sb);
		
		sb.insert(2, 'n');
		System.out.println(sb);
		
//		delete the extra 'n'
		sb.delete(2, 3);
		System.out.println(sb);
		
		sb.setCharAt(0, 't');
		System.out.println(sb);
		
	
		
		
	}

}
