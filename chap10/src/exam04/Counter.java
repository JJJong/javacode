package exam04;

public class Counter {
	private int no;

	public Counter(int no) {
		super();
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"번째");
	}

}
