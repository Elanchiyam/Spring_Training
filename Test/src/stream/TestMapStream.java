package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMapStream {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Laptop");
		hmap.put(2, "Mobile");
		hmap.put(3, "Bike");
		hmap.put(4, "TV");
		hmap.put(5, "Car");
		
		Map<Integer, String> result = hmap.entrySet()
				.stream()
				.filter(map->map.getKey().intValue()>3)
				.collect(Collectors.toMap(map->map.getKey(), map->map.getValue()));
		
		System.out.println(result);
	}
}
