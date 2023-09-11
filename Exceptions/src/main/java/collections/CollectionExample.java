package collections;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionExample {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();//Non Generic Array list.
		al.add(1);//We used "add" method to add objects to the Collection.
		al.add("Anjitha");
		al.add(2.5f);
		al.add('b');
		al.add(3);
		al.add('b');//Allows duplicates
		System.out.println("Non-Generic Array List elements are "+al);
		
		ArrayList<String> a=new ArrayList<String>();//Generic Array list
		//ArrayList<Integer> a=new ArrayList();//Generic Array list
		a.add("Anjitha");
		a.add("Ayaansh");
		a.add("Vishnu");
		//a.add(1); //We can't give other data types here.
		//a.add(2);
		System.out.println("Generic Array List elements are "+a);
		
		List<Integer> l=new ArrayList();//Creating generic reference of List interface
		List l1=new ArrayList();//Creating generic reference of List interface
		l.add(20);
		l.add(30);
		l1.add("Ammu");
		l1.add(20);
		l1.add(20.5);
		System.out.println("Generic List elements are "+l);
		System.out.println("Non-generic List elements are "+l1);
		
	}

}
