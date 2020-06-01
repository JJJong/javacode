package exam01;

public class DmbCellphone extends Cellphone {
	int channel;
	
	public DmbCellphone() {
		System.out.println("DmbCellphone 생성");
	}

	public DmbCellphone(int channel) {
		super("samsung","red");
		this.channel = channel;
		System.out.println("Dmbcellphone channel 생성");
	}

	
	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
		System.out.println("dmb!!!");
	}

	@Override
	public String toString() {
		return "DmbCellphone [channel=" + channel + "]";
	}
	

}
