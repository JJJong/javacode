package exam01;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		Cellphone cp = new Cellphone();
		DmbCellphone dcp = new DmbCellphone(8);
		System.out.println(cp.toString());
		System.out.println(dcp.toString());
		System.out.println(cp);
		System.out.println(dcp);
		dcp.powerOn();
	}

}
