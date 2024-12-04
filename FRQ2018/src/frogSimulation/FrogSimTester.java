package frogSimulation;

public class FrogSimTester {

	public static void main(String[] args) {
		FrogSimulation simmy = new FrogSimulation(20,10);
		
		System.out.println(simmy.runSimulations(5));
	}
}
