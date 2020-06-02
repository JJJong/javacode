package exam01;

public interface RemoteControl {
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		System.out.println("setMute");
		
	}
	
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}
