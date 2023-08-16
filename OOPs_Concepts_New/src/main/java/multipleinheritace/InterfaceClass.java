package multipleinheritace;

public class InterfaceClass implements FirstInterface,SecondInterface {
	//public class InterfaceClass implements SecondInterface { //Using implements keyword we are inheriting second interface to thi class.

	public static void main(String[] args) {
		
		FirstInterface fi=new InterfaceClass();//Constructor name of the class that is used for the implementation of this interface. [urrent class]
		fi.display();
		//fi.show(); //Can call only this interface's method using it's reference and not even this class's method.
	
		/*InterfaceClass ic=new InterfaceClass();
		ic.display();
		ic.show();*/
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
