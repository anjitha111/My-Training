package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Methods_Collections {

	public static void main(String[] args) {
	ArrayList<String> ai=new ArrayList<String>();
	ai.add("Anjitha");
	ai.add("Ayaansh");
	ai.add("Vishnuz");
	System.out.println("ArrayList elements are "+ai);
	System.out.println("Size of the array list is " +ai.size());
	ai.remove(1);// To remove an element using remove method.
	ai.add("Ishaani");
	System.out.println("Updated arrayList elements are "+ai);
	int a=ai.size();
    System.out.println("Updated size of the array list is " +a);
    
    ArrayList<String> a2=new ArrayList<>();
    System.out.println("Collection a2 is "+a2);
    a2.addAll(ai);//To copy data from first collection to second collection.
    System.out.println("Updated collection a2 is "+a2);
    a2.removeAll(a2);//To remove all elements from a2.
    System.out.println("Recently updated collection2 is "+a2);
    
    boolean b=ai.contains("Anjitha");
    System.out.println("Result1 is " +b);//To check whether this string contains or not in ai ArrayList.
    
    boolean b1=ai.contains("Anu");
    System.out.println("Result2 is " +b1);
    ai.add("Anu");
    System.out.println("After adding new elements" +ai);
    
    System.out.println("Get the element from ArrayList " +ai.get(2));// To get the element from 2nd position of first array.
    
    Iterator itr=ai.iterator();
    while(itr.hasNext()) // Will check whether there is data in that Arraylist or not.
    {
    	System.out.println(itr.next()); // It will retrieve the current element and points to the next position.
    }
    itr.remove();//Last element will get removed.
    System.out.println("Updated ArrayList1 is "+ai);
	}

}
