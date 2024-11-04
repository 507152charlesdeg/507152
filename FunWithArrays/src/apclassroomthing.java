
public class apclassroomthing {

	public static void conditionalTest(int a, int b) {
		if ((a > 0) && (b > 0)) {
			if (a > b)
				System.out.println("A");
			else
				System.out.println("B");
		} else if ((b < 0) || (a < 0))
			System.out.println("C");
		else
			System.out.println("D");
	}

	public static void main(String[] args) {
		conditionalTest(3, -2);
	}
}