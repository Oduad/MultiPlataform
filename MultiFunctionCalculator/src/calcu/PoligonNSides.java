package calcu;

public class PoligonNSides {

	int numberOfSides;
	double apothem;
	double side;
	
	public PoligonNSides(int numberOfSides, double side, double apothem) {
		this.numberOfSides = numberOfSides;
		this.apothem = apothem;
		this.side = side;
		}

	public double perimeter(int numberOfSides, double side) {
		double perimeter = numberOfSides*side;
		return perimeter;
	}
	
	public double calculateArea(int numberOfSides, double side, double apothem) {
		double area = (perimeter(numberOfSides,side)*apothem)/2;
		return area;
	}
}
