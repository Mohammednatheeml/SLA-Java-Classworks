package subprotectedpackage;

import protectedExample.ProtectedClass;

public class SubProtectedClass extends ProtectedClass{
	
	public void hello() {
		System.out.println("this is hello method");
	}
	
	public void othermethod() {
		super.protectedMethod();
	}
}
