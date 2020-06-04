package exam02;

public class Test01 {
		public static void main(String[] args) {
			Object obj1 = new Object();
			Object obj2 = new Object();
			Object obj3 = obj1;

			System.out.println(obj1.equals(obj2));
			System.out.println(obj1.equals(obj3));
		}

}
