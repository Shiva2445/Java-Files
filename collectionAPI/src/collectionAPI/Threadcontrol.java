package collectionAPI;
public class Threadcontrol extends Thread{
	public Threadcontrol(String name) {
		super(name);
	}
	@Override
	public void run() {
		String n = Thread.currentThread().getName();
		while(true) {
			System.out.println(n);
		/*try {
			Thread.sleep(1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
			yield();
		}
	}
	public static void main(String[] args) {
		Thread t1=new Threadcontrol("Hi");	
		Thread t2=new Threadcontrol("Hello");
		t1.start();
		t2.start();

	}

}
