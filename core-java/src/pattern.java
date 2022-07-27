
public class pattern {

	public static void main(String[] args) {
	String cc="1234567891234544";
	String ccpattern="[1-9]{1}[0-9]{15}";
	System.out.println(cc.matches(ccpattern));
	
	String email="polkam@gmail.com";
	String emailpatt="[a-zA-Z0-9+_.]+@[a-z0-9]+[a-z]+.[a-z]";
	System.out.println(email.matches(emailpatt));

	}

}
