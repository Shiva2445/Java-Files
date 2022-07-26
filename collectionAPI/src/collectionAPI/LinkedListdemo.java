package collectionAPI;
import java.util.*;
public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList<String> ld = new LinkedList<String>();
		ld.add("Mobile");
		ld.add("Car");
		ld.add("TV");
		ld.add("House");
		System.out.println("----using for loop");
		for (int i = 0; i < ld.size(); i++)
			System.out.println(ld.get(i));

		System.out.println("----using Itertor");
		Iterator<String> i = ld.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		System.out.println("----using Foreach");
		for (String e : ld)
			System.out.println(e);

		ArrayList<String> al = new ArrayList();
		al.add("IBM");
		al.add("TCS");
		al.add("HCL");
		al.addAll(ld);
		
		System.out.println("----Merging");
		for (String e : al)
			System.out.println(e);

		HashSet<String> h = new HashSet<String>(al);
		System.out.println("----Traversing loop");
		for (String e : h)
			System.out.println(e);

		TreeSet<String> t = new TreeSet<String>(h);
		System.out.println("----Soted ");
		for (String e : t)
			System.out.println(e);

	}

}
