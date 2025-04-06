package backtracking;

public class back {
	public static void printperm(String str,String perm,int idx) {
		if(str.length()==0) {
			System.out.print(perm);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char currChar=str.charAt(i);
			String newStr=str.substring(0,i)+str.substring(i+1);
			printperm(newStr,perm+currChar,idx+1);
			
		}
	}
	
	public static void main(String arg[]) {
		String str="ABC";
		printperm(str," ",0);
	}

}
