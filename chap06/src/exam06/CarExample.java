package exam06;

public class CarExample {
	public static void main(String[] args) {
		Car mycar = new Car();
		//mycar.speed = 9;
		mycar.setSpeed(389);
		mycar.setStop(true);
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
			System.out.println("멈추었습니다");
		}
		
		System.out.println();
	}

}
