package exam01;

public class BoxExample {
		public static void main(String[] args) {
			Box box = new Box();
			box.setObject("헝길덩");
			String name = (String) box.getObject();
			System.out.println();
			Apple apple = new Apple();
			box.setObject(apple);
			Apple a = (Apple) box.getObject();
		}

}
