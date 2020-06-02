package exam01;

public class Television implements RemoteControl , Searchable{

	int volume=0;
	@Override
	public void turnOn() {
		System.out.println("전원 on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원 off");
	}

	@Override
	public void setVolume(int volume) {
		
				this.volume = vloume;
	}

	@Override
	public void search(String url) {
		System.out.println(url);
		
	}

}
