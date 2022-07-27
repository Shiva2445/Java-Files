@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String like() {
		return "PRABHAS";
	}

	static void greet() {
		System.out.println("Happy Holidays");
	}
}
