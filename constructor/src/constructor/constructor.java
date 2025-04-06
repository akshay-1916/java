package constructor;

public class constructor {
 
	String name;
	int rollNo;
	public constructor(String n,int r) {
		name=n;
		rollNo=r;
	}
	
	void Display() {
		System.out.println(name+"  "+rollNo);
	}
}
