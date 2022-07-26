package collectionAPI;

public class person implements Comparable<person>  {
	private String name;
	private int age;

	public person() {
	}

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(person p) {
		return this.age-p.age;
	}

}
