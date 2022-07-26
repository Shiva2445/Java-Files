package collectionAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class streamDemo2 {

		public static void main(String[] args) {
			
			List<String> basket = Arrays.asList("Mango","Banana","Apple","Papaya","Orange");
			//basket.forEach(System.out::println);
			
			//basket.stream().forEach(System.out::println);
			
			Stream<String> str = Stream.of("Mango","Banana","Apple","Papaya","Orange");
			//str.sorted().forEach(System.out::println);
			
			//str.map(s -> s.toUpperCase()).sorted().forEach(System.out::println);
			
			str.filter(s -> s.contains("A")).forEach(System.out::println);
		}

}
