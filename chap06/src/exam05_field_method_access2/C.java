package exam05_field_method_access2;

import exam05_field_method_access1.A;

public class C {
	Public C() {
		A a= new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;
		
		a.method1();
		a.method2();
		a.method3();
	}
}
