package exam04.constructor_access;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열"); // private = 같은 클래스 안에서만 가능
	
	public A(boolean b){}
	A(int b){}
	private A(String s){}

}
