package exam02;

public class VehiclExample {
	public static void main(String[] args) {
		Vehicle v = new Car();
		
		if(v instanceof Bus) {
			System.out.println("버스");
		}else if(v instanceof Car) {
			System.out.println("승용차");
		}
	}

}
