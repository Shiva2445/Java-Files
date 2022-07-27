package ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
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
	@Value("Aloha Spring")
	public void setGreetings(String greetings) {
		System.out.println("setter");
		this.greetings = greetings;
	}

}
