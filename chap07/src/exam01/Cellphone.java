package exam01;

public class Cellphone {
	String model;
	String color;
	void powerOn() {System.out.println("전원 on");}
	public Cellphone() {
		System.out.println("Cellphone 생성");
	}
	public Cellphone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	

}
