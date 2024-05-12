package basic;

public class Ps2 extends Ps3 {

	int a;

	public Ps2(int i) {
		super(i);
		this.a = i;

	}

	public int increment() {

		a = a + 1;
		return a;
	}

	public int decriment() {

		a = a - 1;

		return a;
	}

}
