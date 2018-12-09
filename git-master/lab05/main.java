package lab05;

public class main {

	public static void main(String[] args) {
		Base ob1 = new Base();
		ob1.myname();
		
		DerA ob2 = new DerA();
		ob2.myname();
		
		DerB ob3 = new DerB();
		ob3.myname();
		
		DerAB ob4 = new DerAB();
		ob4.myname();
		
		System.out.println();
		
		Base mas[]={new Base(), new DerA(), new DerB(), new DerAB()};
		mas[0].myname();
		mas[1].myname();
		mas[2].myname();
		mas[3].myname();
	}

}
