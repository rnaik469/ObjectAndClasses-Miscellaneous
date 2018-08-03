package ComplexSum;

public class Complex {

	private float real;// instance member for real part of complex number
	private float imaginary;// instance member for imaginary part of complex number

	void set(float real, float imaginary) {// set values of real and imaginary number
		this.real = real;
		this.imaginary = imaginary;
	}

	public float getReal() {
		return real;
	}

	public float getImaginary() {
		return imaginary;
	}

	String disp() {
		return getReal() + ":" + getImaginary() + "i";// return real and imaginary number
	}
//	returns Complex object num 
	Complex sum(Complex compex1, Complex complex2) {
		Complex complex3 = new Complex();
		complex3.real = compex1.getReal() + complex2.getReal();
		complex3.imaginary = compex1.getImaginary() + complex2.getImaginary();
		return complex3;
	}
}
