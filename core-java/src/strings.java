
public class strings {

	public static void main(String[] args) {
	String s1="Shiva";
	String s2="Shiva";
	String s3=new String("Shiva");
System.out.println(s1==s2);
System.out.println(s1==s3);

System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));

System.out.println(s1=s1+" Kumar");
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.charAt(0));
System.out.println(s2.charAt(2));
System.out.println(s1.lastIndexOf('a'));
System.out.println(s1.substring(3));
System.out.println(s1.substring(6, 11));
String z="abc";
System.out.println(z.concat("def"));
System.out.println(z);
	}

}
