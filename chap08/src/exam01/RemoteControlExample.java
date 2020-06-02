package exam01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("일회용 전원 on");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("일회용 전원 off");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 조절");
			}
		};       //익명 클래스
		rc.turnOff();
		rc.turnOn();
	}

}
