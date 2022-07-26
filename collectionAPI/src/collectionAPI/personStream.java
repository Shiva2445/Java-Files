package collectionAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class personStream {
	public static void main(String[] args) {
		String[] s = { "Name", "Age", "Gender", "Age" };
		List<String> s1 = Arrays.asList(s);
		s1.forEach(System.out::println);
		System.out.println("------------------");

		Stream<String> str1 = s1.stream();
		str1.forEach(System.out::println);
		// str1.forEach(System.out::println);
		System.out.println("------------------");

		s1.stream().forEach(System.out::println);
		System.out.println("------------------");
		s1.stream().distinct().forEach(System.out::println);
		System.out.println("------------------");

		System.out.println(s1.stream().distinct().count());
		System.out.println("------------------");

		s1.stream().distinct().sorted().forEach(System.out::println);
		System.out.println("------------------");

		Stream<String> s2 = Stream.of("Qualfication", "Goals", "Salary");
		// s2.map(s3 -> s3.toUpperCase()).sorted().forEach(System.out::println);

		s2.filter(s3 -> s3.contains("a")).forEach(System.out::println);

	}

}
