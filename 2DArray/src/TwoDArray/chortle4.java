package TwoDArray;

public class chortle4 {

	public static void main(String[] args) {     //row
		int[][] data = { { 3, 2, 5, 0,  0, 0 },  //0
						 { 1, 4, 4, 8, 13, 0 },  //1
						 { 9, 1, 0, 2,  0, 0 },  //2
						 { 0, 2, 6, 3, -1,-8 } };//3
//               column    0  1  2  3   4  5 
		// declare and initialize the max and the min
		int sum = 0;
		int columnTot = 0;
		//
		for (int column = 0; column < data[0].length; column++) {
			columnTot = 0;
			for (int row = 0; row < data.length; row++) {
				columnTot += data[row][column];
			}
			System.out.println("column "+column+" "+columnTot);
		}
		
		

		// write out the results
		System.out.println(sum);

	}

}
