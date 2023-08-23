package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class NewArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Blue");
		al.add("Green");
		al.add("Red");
		al.add("White");
		al.add("Black");
		System.out.println("ArrayList elements are" +al); //To print all elements in the ArrayList.
		System.out.println("The element in the first position is "+al.get(0));
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());// To iterate through all elements in the ArrayList.
		}
		al.remove(3);// To remove the third element from the ArrayList.
		System.out.println("Updated arrayList elements are" +al);
		boolean b=al.contains("Blue");
		System.out.println("Result is "+b);
		
	}

}
