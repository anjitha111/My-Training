package accessmodifiers2;

import AccessModifiers.Access1;

public class Access4 {

	public static void main(String[] args) {
		
		Access1 access1=new Access1();

		access1.publicMethod();
		//access1.privateMethod();//Access only within the same class
		//access1.protectedMethod();//Access outside the package only through sub class
		//access1.defaultMethod();//Access within the package only.
	}

}
