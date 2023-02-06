package collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	/**
	   *
	   * The method prints a simple message on the Console.
	   *
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.forEach(e->{
			System.out.println(e);
		});

	}

}
