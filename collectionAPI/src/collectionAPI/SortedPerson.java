package collectionAPI;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

	public static void main(String[] args) {
		Comparator<person> compage=(p1,p2)->p1.getAge()-p2.getAge();
		
		Comparator<person> compname=(p1,p2)->p1.getName().compareTo(p2.getName());

		TreeSet<person> p = new TreeSet<person>();
		TreeSet<person> p1 = new TreeSet<person>();

		p.add(new person("a", 1));
		p.add(new person("b", 1));
		p1.add(new person("c", 1));
		for (person P1 : p)
			System.out.println(P1);
		p.add(new person("c", 1));
		for (person P2 : p1)
			System.out.println(P2);

	}

}
