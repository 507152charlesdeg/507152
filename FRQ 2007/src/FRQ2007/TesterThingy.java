package FRQ2007;

public class TesterThingy {

	public static void main(String[] args) {
		int ex1 = (128);
		int ex2 = (12);
		int ex3 = (120);

		SelfDivisor test1 = new SelfDivisor(ex1);
		SelfDivisor test2 = new SelfDivisor(ex2);
		SelfDivisor test3 = new SelfDivisor(ex3);

		System.out.println(test1.isSelfDivisor(ex1));
		System.out.println(test2.isSelfDivisor(ex2));
		System.out.println(test3.isSelfDivisor(ex3));

	}

}
