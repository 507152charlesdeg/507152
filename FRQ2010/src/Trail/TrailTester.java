package Trail;

public class TrailTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] everestData = {100, 150, 105, 120, 90, 80, 50, 95, 75, 70, 80, 90, 100, 50, 55, 54, 52};
		//                        +50   +5  +15 -30 -10 -30 +45 -20  -5 +10 +10  +10
		Trail mountEverest = new Trail(everestData);
		System.out.println(mountEverest.isDifficult());//true
		System.out.println(mountEverest.isLevelTrailSegment(13, 16));//true
		
	}

}
