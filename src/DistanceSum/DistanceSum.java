package DistanceSum;

public class DistanceSum {
	private int feet;
	private float inches;

	public int getFeet() {
		return feet;
	}

	public float getInches() {
		return inches;
	}

	void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	String disp() {
		return getFeet() + "	" + getInches();
	}

	// returns the sum of two distances
	DistanceSum add(DistanceSum distancesum1, DistanceSum distancesum2) {
		distancesum1.feet = distancesum1.getFeet() + distancesum2.getFeet();
		distancesum1.inches = distancesum1.getInches() + distancesum2.getInches();
		if (distancesum1.inches >= 12) {
			distancesum1.feet += distancesum1.inches / 12;
			distancesum1.inches = distancesum1.inches % 12;
		}
		return distancesum1;
	}

	@Override
	public String toString() {
		return "DistanceSum [feet=" + feet + ", inches=" + inches + "]";
	}

}
