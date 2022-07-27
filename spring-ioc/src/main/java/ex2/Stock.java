package ex2;

public class Stock {

	public Stock() {
		System.out.println("Stock cons");
	}

	private static Stock s;

	public static Stock get() {
		System.out.println("Singleton");

		if (s == null)

			s = new Stock();
		return s;
	}

}
