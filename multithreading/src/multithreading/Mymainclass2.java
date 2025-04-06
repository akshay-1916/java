package multithreading;

public class Mymainclass2 {
	public static void main(String arg[] ) {
		Mythread2 threada=new Mythread2();
		Thread t1=new Thread(threada);
		t1.setName("t1 thread");
		t1.setPriority(10);
	}

}
