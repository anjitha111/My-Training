package interface1;

public class Test2 implements Test1 {
	
	public void print()
	{
		System.out.println("Method of current class.");
	}

	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.display();
		t2.show();
		t2.print();
	}

	@Override
	public void display() {
		
		System.out.println("Parent class Interface method 1.");
		//b=50;Finalvariable cannot be changed
	}

	@Override
	public void show() {
		
		System.out.println("Parent class Interface method 2");
	}

}
