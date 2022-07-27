
public class Hellodemo {

	public static void main(String[] args) {
		Hello h= ()->"HELLO LAMBDA";
		System.out.println(h.sayHello());
		
		Hello h1=()->{
			String a="SHIVA";
			return a;
		};
		System.out.println(h1.sayHello());
		System.out.println(h1.like());
		Hello.greet();


	}

}
