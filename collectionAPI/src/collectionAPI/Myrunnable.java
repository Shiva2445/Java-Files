package collectionAPI;
public class Myrunnable implements Runnable{
	private int data;
	@Override
	public void run() {
		Thread t= Thread.currentThread();
		for (int i = 1; i <= 50; i++)
			System.out.println(t + ":" + ++data);
	}
	public static void main(String[] args) {
		Myrunnable r=new Myrunnable();
		Thread t1=new Thread(r);
		t1.setName("First");
		Thread t2=new Thread(r,"Second");
		Thread t3=new Thread(r,"Third");
		
		t1.start();
		t2.start();
		t3.start();	
	}	
	}