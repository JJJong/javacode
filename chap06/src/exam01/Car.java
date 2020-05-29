package exam01;

public class Car {

	boolean starter;
	String company;
	String Model;
	String color;
	int maxspeed;
	int speed=0;
	int rpm;
	int mynumber;
	static int number=0;

public Car(boolean starter, String company, String model, String color, int maxspeed, int speed, int rpm,
			int mynumber) {
		super();
		this.starter = starter;
		this.company = company;
		Model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		this.speed = speed;
		this.rpm = rpm;
		this.mynumber = mynumber;
	}


	public Car(String company) {
		super();
		mynumber=++number;
		this.company = company;//this는 이 클래스 안에있는 company변수를 쓴다  =company는 밖에서 입력받는 값
	}

	public Car(String company, String model, int maxspeed, int speed, int rpm) {
		super();
		this.company = company;
		Model = model;
		this.maxspeed = maxspeed;
		this.speed = speed;
		this.rpm = rpm;
	}

	public Car(boolean starter, String company, String model, String color, int maxspeed, int speed, int rpm) {
	 
}


	int speedUp(int speed) {
		speed=speed+10;
		return speed;
	}
	
	@Override
	public String toString() {
		return "starter=" + starter + ", company=" + company + ", Model=" + Model + ", color=" + color
				+ ", maxspeed=" + maxspeed + ", speed=" + speed + ", rpm=" + rpm + ", mynumber=" + mynumber + "]";
	}

	void speedDown(int speed) {
		this.speed=speed-10;
	}
	int speedUp() {
	
	}
	
	void starterOnOff() {
		starter=!starter;
		
	}
	void starterOff() {
		
	}

	// 메소드 
	int sum(char op, int ... values) {
		int result = 0;
		if(op=='+') {
			for(int i=0;i<values.length;i++) {
				result=result+values[i];
			}
			
		}else if(op=='*') {
			result =1;
			for(int i=0;i<values.length;i++) {
				result=result*values[i];
			}
			speedDown(result);
			return result;
		}
		
	}

}
//한 문서안에 public은 하나여야 한다.




class Tire{
	
}
