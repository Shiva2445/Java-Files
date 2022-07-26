package collectionAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streamDemo3 {

	private static void process(int i) {
		try {
			Thread.sleep(1); // lets thread sleep for a millisecond
		} catch (InterruptedException e) {}
	}
	
	public static void main(String[] args) {

		List<Integer> numbers = IntStream.range(1, 100).boxed().collect(Collectors.toList());
		
		long startTime = System.currentTimeMillis();
		numbers.stream().forEach(streamDemo3::process);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by sequential stream: " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		numbers.parallelStream().forEach(streamDemo3::process);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by parallel stream: " + (endTime - startTime));
	}

}
