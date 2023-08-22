package multipleinheritace;

public class InterfaceClass implements FirstInterface,SecondInterface {
	//public class InterfaceClass implements SecondInterface { //Using implements keyword we are inheriting second interface to this class.

	public static void main(String[] args) {
		
		FirstInterface fi=new InterfaceClass();//Constructor name of the class that is used for the implementation of this interface. [current class]
		fi.display();// Calling first interface's method using it's own object.
		//fi.show(); //Can call only this interface's method using it's reference and not even this class's method.
	
		InterfaceClass ic=new InterfaceClass();
		ic.display();//Can call the methods of first interface using current class's object.
		ic.show();//Can call the methods of second interface using current class's object.
	}

	@Override
	public void show() {
		System.out.println("Second Interface method.");
		
	}

	@Override
	public void display() {
		System.out.println("First Interface method.");
		
	}

}
