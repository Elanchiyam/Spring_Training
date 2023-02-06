package optional;

import java.util.Optional;

import TestStreamObject.Employee;

public class TestExample {
	/**
	* Hero is the main entity we'll be using to . . .
	* 
	* Please see the {@link com.baeldung.javadoc.Person} class for true identity
	* @author Captain America
	* 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = null;
//		System.out.println(str.length());
		
		Employee emp = new Employee(101,null,40000.f);

//		
//		Optional<Object> emptyoptional = Optional.empty();
//		System.out.println(emptyoptional);
		
		Optional<String> ename = Optional.of(emp.getName());
		System.out.println(ename);
		
		Optional<String> ename1 = Optional.ofNullable(emp.getName());
//		if(ename1.isPresent())
//			System.out.println(ename1.get());
//		else
//			System.out.println("No data");
		
		System.out.println(ename1.orElse("No data"));
//		System.out.println(ename1.orElseThrow(()-> new IllegalArgumentException("Employee name is not present")));
		System.out.println(ename1.map(String::toUpperCase).orElseGet(()->"No name "));
		
		System.out.println(ename1.map(String::toUpperCase).orElseGet(()->"No name "));
		
	}

}
