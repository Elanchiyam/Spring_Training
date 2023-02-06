package TestStreamObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101,"Elan",40000.f));
		employees.add(new Employee(103,"David",50000.f));
		employees.add(new Employee(104,"Golioath",10000.f));
		employees.add(new Employee(105,"Abraham",80000.f));
		employees.add(new Employee(106,"Issac",60000.f));
		
		List<Float> employeeSalaries = employees
				.stream()
				.filter( emp->emp.getSalary()>50000)
				.map(emp->emp.getSalary())
				.collect(Collectors.toList());
		System.out.println(employeeSalaries);

		employees
		.stream()
		.filter( emp->emp.getSalary()>50000)
		.map(emp->emp.getSalary())
		.forEach(System.out::println);
		
		
		Map<String, Float> empMap = employees
				.stream()
				.filter( emp->emp.getSalary()>50000)
				.collect(Collectors.toMap(Employee::getName, Employee::getSalary));
				
		System.out.println(empMap);

	}
}
