package interface1;

public interface Test1{

	public static final int a=100;
	public abstract void display();//Creating an abstract method
	int b= 200;//It will be taken as public static final variable.
	public void show();//Without abstract keyword,it is abstract by default since it is given inside an interface.
}
