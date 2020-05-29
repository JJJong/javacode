package exam01;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int i = cal.add(33, 50);
		System.out.println(i);
		System.out.println(cal.add(2.0, 9.3));
		System.out.println(cal.add("3","8"));
	}

}
