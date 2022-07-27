
public class email {

	public static void main(String[] args) {

		String s="shiva@gmail.com";
        for (int i=0; i<s.length(); i++) {

		if(s.charAt(0)!='@' && s.contains("@")&&s.contains(".")  && s.endsWith(".com"))
		{
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
		
	}
}
}
