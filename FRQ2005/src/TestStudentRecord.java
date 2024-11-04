
public class TestStudentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample1 = { 50, 50, 20, 80, 53 };
		int[] sample2 = { 20, 50, 50, 53, 80 };
		int[] sample3 = { 20, 50, 50, 80 };

		studentRecord christian = new studentRecord(sample1);
		studentRecord chris = new studentRecord(sample2);
		studentRecord anthony = new studentRecord(sample3);
		System.out.println(christian.finalAverage());// 50.6
		System.out.println(chris.finalAverage());// 61
		System.out.println(anthony.finalAverage());// 65.0
	}

}
