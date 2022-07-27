
public class beta extends alpha {
	beta() {
		System.out.println("Beta def Constructor");
	}
	beta(int a) {
		System.out.println("Beta para Constructor");
	}

	void demo() {
		System.out.println("Beta Demo");
	}
	void test() {
		System.out.println("beta Test");
	}

	public static void main(String[] args) {

		alpha a = new alpha();
		a.test();
		// beta bt = (beta) a; // Illegal - Parent is not pointing to child object

		alpha b = new beta(10); // Every time a child class object is created, it creates object of its parent
								// too
		b.test();
		//b.demo();
//a.demo();
		//alpha ab = b; // Upcasting - Implicit
		//ab.demo();
		//ab.test(); // Illegal - Parent reference cannot access members of child classes

		//beta ba = (beta) ab; // Downcasting - Explicit
		//ba.demo();
		//ba.test();
	}
}
