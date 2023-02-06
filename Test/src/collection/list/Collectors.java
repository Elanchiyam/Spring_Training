package collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Spliterator;

public class Collectors {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
		
		Spliterator<String> namesSpliterator = names.spliterator();
		namesSpliterator.forEachRemaining(System.out::println);
		
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Thinkpad Laptop", 50000);
		hashMap.put("LG TV", 80000);
		hashMap.put("Mobile", 30000);
		System.out.println(hashMap);

		int result = hashMap.compute("LG TV", (k,v)->v+v*30/100);
		System.out.println("New Cost of the TV " + result);
		System.out.println(hashMap);
		

		int bikeCost = hashMap.computeIfAbsent("Bike", k->65000);
		System.out.println("Bike cost " + bikeCost);
		System.out.println(hashMap);

//		computeIfPresent - if present update or throw null pointer exception.
		int cycleCost = hashMap.computeIfPresent("Bike", (k,v)->v+v*30/100);
		System.out.println("Cycle " + cycleCost);
		System.out.println(hashMap);
		
		int merge = hashMap.merge("Headphones", 3500, (oldValue,newValue)->oldValue+newValue);
		System.out.println(merge);
		System.out.println(hashMap);
	}
}
 