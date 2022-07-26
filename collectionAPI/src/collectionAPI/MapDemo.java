package collectionAPI;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("a", "1");
		m.put("b", "2");
		m.put("c", "3");
		System.out.println("a " + m.get("a"));
		System.out.println("b " + m.get("b"));
		System.out.println("c " + m.get("c"));
		System.out.println(m.values());
for(String key:m.keySet())
	System.out.println(key+"" +m.keySet());
	}

}
