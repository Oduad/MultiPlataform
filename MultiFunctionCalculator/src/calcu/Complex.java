package calcu;

public class Complex {
	double real;
	double img;

	public Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public double getReal() {
		return real;
	}

	public double getImg() {
		return img;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public void setImg(double img) {
		this.img = img;
	}

	public Complex calculateAddition(Complex c) {
		Complex addition = new Complex(real+c.getReal(),img+c.getImg());
		return addition;
	}
	
	public Complex calculateSubtraction(Complex c) {
		Complex sub = new Complex(real-c.getReal(),img-c.getImg());
		return sub;
	}
	
	public Complex calculateMultiplication(Complex c) {
		Complex mult = new Complex(real*c.getReal()-img*c.getImg(),real*c.getImg()+img*c.getReal());
		return mult;
	}
	
	public Complex calculateDivision(Complex c) {
		Complex div = new Complex(real*c.getReal()-img*c.getImg(),real*c.getImg()+img*c.getReal());
		return div;
	}
}
