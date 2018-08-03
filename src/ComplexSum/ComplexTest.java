package ComplexSum;

public class ComplexTest {

	public static void main(String[] args) {
		Complex complex1 = new Complex();// Instantiating the class
		Complex complex2 = new Complex();// Instantiating the class

		complex1.set(58, 3); // setting values of real and imaginary part
		complex2.set(69, 1);// setting values of real and imaginary part

		System.out.println(complex1.disp());
		System.out.println(complex2.disp());

		Complex complex3 = new Complex();// Instantiating the class
		complex3 = complex3.sum(complex1, complex2);// adding complex1 and complex2

		System.out.println(complex3.disp());
	}
}
