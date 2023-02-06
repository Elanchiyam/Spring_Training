package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;


public class TestStream {
	public static void main(String[] args) {
		Stream<Integer> stream =  Stream.of(new Integer[] {1,2,3,4});
		stream.forEach(System.out::print);
		
		System.out.println();
		
		String[] arr = new String[] {"x" , "y", "z"};
		Stream<String> streamArr =  Arrays.stream(arr);
		streamArr.forEach(System.out::print);
		
//		Arrays.stream(arr).forEach(System.out::print);
		
		System.out.println();
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
//		Stream<Integer> streamArrayList =  arrayList.stream();
//		streamArrayList.forEach(System.out::print);
		
		arrayList.stream().forEach(System.out::println);
		
		Builder<String> builder = Stream.<String> builder();
		builder.add("first").add("second").add("third");
		Stream<String> s = builder.build();
		s.forEach(System.out::println);
		
		System.out.println();
		
		Stream<Integer> randomNumber = Stream.generate(()-> new Random().nextInt(100));
		randomNumber.limit(20).forEach(System.out::println);
	}
}
