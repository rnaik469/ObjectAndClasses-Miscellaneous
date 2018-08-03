package DistanceSum;

public class DistanceTest {

	public static void main(String[] args) {
		DistanceSum distanceSum1 = new DistanceSum();// Instantiating the class
		DistanceSum distanceSum2 = new DistanceSum();// Instantiating the class
		DistanceSum distanceSum3 = new DistanceSum();// Instantiating the class

		distanceSum1.set(51, 36);
		distanceSum2.set(146, 41);

		distanceSum3 = distanceSum3.add(distanceSum1, distanceSum2);// invoking add

		System.out.println(distanceSum3.disp());

	}

}
