package collectionAPI;

public class Syncdemo implements Runnable {
	@Override
	public void run() {
		String n = Thread.currentThread().getName();
		print(n);		
	}
	private synchronized void print(String n) {
		try {
			System.out.print("[");
			Thread.sleep(1000);

			System.out.print(n);
			Thread.sleep(1000);
			System.out.print("]");

			
		}catch(Exception e){
			e.printStackTrace();
			
			
		}
		
	}
	public static void main(String[] args) {
		Syncdemo d=new Syncdemo();
		Thread t1=new Thread(d,"a");
		Thread t2=new Thread(d,"b");

		Thread t3=new Thread(d,"c");
		t1.start();
		t2.start();
		t3.start();
	}

}
