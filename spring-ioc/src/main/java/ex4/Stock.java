package ex4;

import org.springframework.stereotype.Component;

@Component("stk")
public class Stock {

	private Stock() {
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
