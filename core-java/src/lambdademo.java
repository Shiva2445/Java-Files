import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambdademo {
	

	public static void main(String[] args) {
		Consumer<Integer> c1=(s)-> System.out.println(s);
		c1.accept(10);
		
		Consumer<String> c2=System.out::println;
		c2.accept("a");
		
		Supplier<String> s1=()->"NOO";
		System.out.println(s1.get());
		

		Supplier<Integer> s2=()->100;
		System.out.println(s2.get());
		
		Predicate<Integer> positive=(x)->x>=0;
		System.out.println(positive.test(10));
		
		BiPredicate<String,String> contains=(s,c)->s.contains(c);
		System.out.println(contains.test("Hello", "o"));
		
		Function<Integer,Integer> square=(x)->x*x;
		System.out.println(square.apply(5));
		
		BiFunction<Integer,Integer,Integer>sum=(a,b)->a+b;
		System.out.println(sum.apply(10,20));
	}

}
