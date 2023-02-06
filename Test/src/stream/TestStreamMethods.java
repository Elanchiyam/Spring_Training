package stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamMethods {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("");
		arrayList.add("JavaScript");
		arrayList.add("");
		arrayList.add("Oracle");
		arrayList.add("Python");
		
		long count = arrayList.stream().filter(x->x.isEmpty()).count();
		System.out.println("Empty values in the arrayList " + count);

		long greaterThanFour = arrayList.stream().filter(x->x.length()>6).count();
		System.out.println("Length greater than 6 in the arrayList" + greaterThanFour);
		
		long startsWithJ = arrayList.stream().filter(x->x.startsWith("J")).count();
		System.out.println("Starts with J in the arrayList" + startsWithJ);
		
		List<String> arrList = arrayList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		arrList.forEach(System.out::println);
		
		System.out.println();
		List<String> arrListGreater = arrayList.stream().filter(x->x.length()>6).collect(Collectors.toList());
		arrListGreater.forEach(System.out::println);
		
		System.out.println();
		List<String> arrListToUpper = arrayList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		arrListToUpper.forEach(System.out::println);
			
		String ListToUpper = arrayList.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(ListToUpper);
		
		List<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(200);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(5);
		intArrayList.add(5);
		intArrayList.add(6);
		intArrayList.add(2000);
		
		System.out.println();
		List<Integer> IntarrListToUpper = intArrayList.stream().map(x -> x*x).distinct().collect(Collectors.toList());
		IntarrListToUpper.forEach(System.out::println);
		
		IntSummaryStatistics number = intArrayList.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest value " + number.getMax());
		System.out.println("Lowest value " + number.getMin());
		System.out.println("Sum value " + number.getSum());
		System.out.println("Averge value " + number.getAverage());
		
		int sum = intArrayList.stream().reduce(0, (a,b) -> a+b);
		System.out.println("Sum = " + sum);

		List<String> nameList = new ArrayList<String>();
		nameList.add("Elan");
		nameList.add("Abi");
		nameList.add("Depi");
		nameList.add("Cathy");
		nameList.add("Olivia");
		nameList.add("Preethi");
		
		System.out.println("NAME LIST");
//		nameList.stream().sorted().map(x->x.toUpperCase()).collect(Collectors.toList());
		nameList.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		
		
	}
}
