package accessmodifiers2;

import AccessModifiers.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		
		Access3 access3=new Access3();
		access3.publicMethod();
		//access3.privateMethod();
		access3.protectedMethod();
		//access3.defaultMethod();//Default is accessible only within the same package.
	}

}
