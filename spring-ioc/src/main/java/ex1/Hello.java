package ex1;

public class Hello {
	private String greetings;

	public Hello() {
		System.out.println("Default");
	}

	public Hello(String greetings) {
		System.out.println("para");
		this.greetings = greetings;
	}

	public String getGreetings() {
		System.out.println("getter");
		return greetings;
	}

	public void setGreetings(String greetings) {
		System.out.println("setter");
		this.greetings = greetings;
	}

}
