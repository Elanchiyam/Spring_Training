import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	MethodReference(){
		System.out.println("Inside constructor");
	}
	public void printData() {
		System.out.println("Sample message using print data method");
	}
	public static int printData(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
//		DemoClass demoClass = new DemoClass();
//		SampleInterface ref = demoClass::show;
//		ref.display();
//		
//		MethodReference methodReference = new MethodReference();
//		ref = methodReference::printData;
//		ref.display();
//		
//		ref = MethodReference::new;
//		ref.display();
//		
//		SampleInterface ref = MethodReference::printData;
//		System.out.println("Sum " + ref.sum(10, 20));
//		
//		int result = Math.max(100, 200);
//		System.out.println("Maximum value " + result);
//		
//		
//		SampleInterface ref = Math::max;
//		System.out.println("Maximum value = "+ ref.findMax(100, 200));
//		
		String s = "Hello World";
		SampleInterface refStr = String::length;
		System.out.println("Stringlength = " + refStr.findStringLength("Elanch"));
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		arrayList.forEach(System.out::println);
	}
}
