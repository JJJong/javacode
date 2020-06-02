package exam01;

public class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("라디오 on");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오 off");
	}

	@Override
	public void setVolume(int volume) {
		
	}

	@Override
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
		System.out.println("radio mute");
	}
	

}
