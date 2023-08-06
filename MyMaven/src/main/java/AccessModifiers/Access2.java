package AccessModifiers;

public class Access2 extends Access1{

	public static void main(String[] args) {
		Access2 access2 = new Access2();
		//Access1 access = new Access1();
		access2.publicMethod();
		//access.privateMethod();//Cannot be accesses from another class.
		access2.protectedMethod();
		access2.defaultMethod();

	}

}
