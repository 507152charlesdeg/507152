package Trail;

public class Trail {
	private int[] markers;

	// constructor
	public Trail(int[] m) {
		this.markers = m;
	}

	public int getMarkerDelta(int start) {
		int delta = 0;
			delta = markers[start+1] - markers[start];
			return delta;
	}

	public int max(int[] list) {
		int max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}

	public int min(int[] list) {
		int min = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}

	public boolean isLevelTrailSegment(int start, int end) {
		int[] list = new int[end - start];
		int thing = 0;
		for (int i = start; i < end; i++) {
			list[thing] = markers[i];
			thing++;
		}
		if (max(list) - min(list) >= 10) {
			return false;
		}
		else return true;
	}

	public boolean isDifficult() {
		int numChanges = 0;
		int delta = 0;
		for (int i = 0; i < markers.length-1; i++) {
			delta = getMarkerDelta(i);
			if (Math.abs(delta) >= 30) {
				numChanges++;
			}
			
		if (numChanges >= 4) {
			return true;
		}
	}
		return false;
		
		
	}
}
