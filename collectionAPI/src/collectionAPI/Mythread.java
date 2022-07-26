package collectionAPI;
public class Mythread extends Thread {
	private int data;
	@Override
	public void run() {
		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 50; i++)
			System.out.println(n + ":" + ++data);
	}
	public static void main(String[] args) {
		Mythread m1 = new Mythread();
		m1.setName("First");

		Mythread m2 = new Mythread();
		m2.setName("Second");

		Mythread m3 = new Mythread();
		m3.setName("Third");

		m1.setPriority(MIN_PRIORITY);
		m3.setPriority(MAX_PRIORITY);

		m1.start();
		m2.start();
		m3.start();

		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 50; i++)
			System.out.println(n + ":" + i);
	}
}
