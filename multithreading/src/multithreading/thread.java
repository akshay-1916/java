package multithreading;

public class thread {
	
	public static void main(String arg[]) {
		Mythread threada =new Mythread();
//		Thread t1=new Thread(threada);
//		t1.setName("t1 thread");
//		t1.setPriority(10);
		
		threada.run();
		 
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName())
		}
		
	}

}
