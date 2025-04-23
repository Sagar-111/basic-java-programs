package ch.i_multiThreadedProgramming;

public class ThreadDemo {

	public static void main (String[] args) throws InterruptedException{
		Thread t = new Thread();
		Thread t1 = new Thread();
		
		t1.setName("ThreadOne");

		System.out.println("Thread Name, priority(default is 5), group" + t);

		for (int i = 5, j = 5000; i > 0; i--, j+=1000) {
			System.out.println(j);
			System.out.println(i);
			Thread.sleep(1000);
			t1.start();
			System.out.println(t1);
		}
	}

}
