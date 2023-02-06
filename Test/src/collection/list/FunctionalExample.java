package collection.list;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalExample {
	public static void main(String[] args) {
		Predicate<Integer> p = x->x%2==0;
		boolean result = p.test(100);
		System.out.println(result);
		
		BiPredicate<Integer, Integer> biPredicate = (x,y) -> x>y;
		boolean r2 = biPredicate.test(100, 200);
		System.out.println(r2);
		
		Function<Integer, Integer> function = x->x+x;
		int value = function.apply(10);
		System.out.println(value);
		
		BiFunction<Integer, Integer, Integer> biFunction =  (x,y) -> x*y;
		Integer r3 = biFunction.apply(10, 20);
		System.out.println(r3);
		
		Consumer<String> str = x-> System.out.println(x);;
		str.accept("Hi Elan");
		
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("Oracle");
		languages.add("Angular");
		languages.add("React");
		
		Consumer<String> action = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		languages.forEach(action);
		Supplier<Integer> sup;
		
		
		
	}
}
