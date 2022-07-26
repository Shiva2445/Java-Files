package collectionAPI;
public class DaemonThread extends Thread {
	private int limit;
	public DaemonThread(int limit, String name) {
		super(name);
		this.limit = limit;
	}
	@Override
	public void run() {
		String n = Thread.currentThread().getName();
		for (int i = 1; i <= limit; i++)
			System.out.println(n + ":" + i);
	}
	public static void main(String[] args) {
		DaemonThread d1 = new DaemonThread(2, "a");
		DaemonThread d2 = new DaemonThread(4, "b");
		DaemonThread d3 = new DaemonThread(6, "c");
		DaemonThread d4 = new DaemonThread(20, "d");
		d4.setDaemon(false);
		d1.start();
		d2.start();
		d3.start();
		d4.start();

	}

}
