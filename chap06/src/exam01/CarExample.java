package exam01;

public class CarExample {
	public static void main(String[] args) {
//		Car car1 = new Car("현대");//기본 생성자 만듦
//		
//		System.out.println(car1.mynumber);//toString : 주소값을 알려준다 (설명)
//		
//		Car car2 = new Car("기아");//기본 생성자 만듦
//		
//		System.out.println(car2.mynumber);//toString : 주소값을 알려준다 (설명)
//		
//		Car car3 = new Car("삼성","SM5",200,10,2000);
//		System.out.println(car3);
//		String s = "hhhh";
//		System.out.println(s.toString());주소값이 안나오는 이유 부모로부터 받은것을 리모델링함.
		
		Car car1 = new Car(false, null, null, null, 0, 0, 0, 0);
		int sum = car1.sum('*',2,3,5,6,78,22,33);
		System.out.println(sum);
		
	}

}

