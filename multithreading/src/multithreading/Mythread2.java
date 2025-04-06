package multithreading;

public class Mythread2 {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Good evining!!!"+Thread.currentThread().getName());
			
		}
	}

}
