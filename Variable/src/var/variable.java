package var;

public class variable {
	String name;
	int age;
	static String company;
	public static void main(String arg[]) {
		
		int bonus=5000;
		
		variable v1=new variable();
		v1.name="ATF";
		v1.age=19;
		
		variable.company="aaaa";
		
		System.out.println(v1.name);
		System.out.println(v1.age);
		System.out.println(bonus);
		System.out.println(variable.company);


		
		
	}

}
