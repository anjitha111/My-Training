package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) 
	{
			//Generic Array list.
		Set<Integer> set2 = new LinkedHashSet();//Generic Array list.

		set2.add(1);
		set2.add(2);
		System.out.println("Non-Generic integer set elements are "+set2);
	}

}
