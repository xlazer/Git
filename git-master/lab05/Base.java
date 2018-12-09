package lab05;

public class Base {
	String name;
	public Base() {
		name="Base";
	}
	void myname() {
		System.out.println("This is class "+name);
	}
}

class DerA extends Base{
	public DerA() {
		name="DerA";
	}
}

class DerB extends DerA{
	public DerB() {
		name="DerB";
	}
}

class DerAB extends DerB{
	public DerAB() {
		name="DeraAB";
	}
}
