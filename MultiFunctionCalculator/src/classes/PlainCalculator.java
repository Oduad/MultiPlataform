package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import calcu.Complex;
import calcu.Matrix;
import calcu.PoligonNSides;
import calcu.Polynomial;
import calcu.Quadrilateral;
import calcu.Vector;

public class PlainCalculator {
	private static int optionMenu;

	public PlainCalculator() {

	}

	public static void chooseOption() {
		do {
			System.out.println("\nWELCOME TO ODUAD'S FULL CALCULATOR");
			System.out.println(" 1. Aritmetic Operations");
			System.out.println(" 2. Functions");
			System.out.println(" 3. Poligons");
			System.out.println(" 4. Vectors");
			System.out.println(" 5. Matrices");
			System.out.println(" 6. Polynomials");
			System.out.println(" 7. Complex Numbers");
			System.out.println(" 8. Statistics");
			System.out.println(" 9. Numeral systems");
			System.out.println("10. Exit");
			optionMenu = Integer.parseInt(JOptionPane.showInputDialog("WELCOME TO THIS ODUAD'S FULL CALCULATOR\n"
					+ " 1. Aritmetic Operations\n" + " 2. Functions\n" + " 3. Poligons\n" + " 4. Vectors\n"
					+ " 5. Matrices\n" + " 6. Polynomials\n" + " 7. Complex Numbers\n" + " 8. Statistics\n"
					+ " 9. Numeral systems\n" + "10. Exit\n" + "Enter what you want to work with: "));

			switch (optionMenu) {
			case 1:
				System.out.println("\nYou want to use aritmetic operations.\n");
				arithmeticOperations();
				break;
			case 2:
				System.out.println("\nYou want to use functions.");
				Functions();
				break;
			case 3:
				System.out.println("\nYou want to see geometric properties.");
				poligons();
				break;
			case 4:
				System.out.println("\nYou want to work with vectors.");
				vectors();
				break;
			case 5:
				System.out.println("\nYou want to work with matrices.");
				matrices();
				break;
			case 6:
				System.out.println("\nYou want to work with polynomials.");
				polynomials();
				break;
			case 7:
				System.out.println("\nYou want to work with complex numbers.");
				complexNumbers();
				break;
			case 8:
				System.out.println("\nYou want to work with statistics.");
				statistics();
				break;
			case 9:
				System.out.println("\nYou have chosen numeral systems.");
				// numeralSystems();
				break;
			case 10:
				System.out.println("\nYou have chosen exit.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist.\n");
				System.out.println("This option does not exist");
				break;
			}
		} while (optionMenu != 10);
	}

	public static void arithmeticOperations() {
		int optionArithmetic;
		double number1;
		double number2;
		double base, number;
		int exponent, radix;
		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Module");
			System.out.println("6. Exponentiation");
			System.out.println("7. Nth root");
			System.out.println("8. Exit");
			optionArithmetic = Integer.parseInt(JOptionPane.showInputDialog("ARITMETIC OPERATIONS" + "\n1. Addition\n"
					+ "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Module\n"
					+ "6. Exponentiation\n" + "7. nth root\n" + "8. Exit\n" + "Enter what you want to do: "));

			switch (optionArithmetic) {
			case 1:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 + number2));
				JOptionPane.showMessageDialog(null, "The result is " + (number1 + number2));
				break;
			case 2:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 - number2));
				JOptionPane.showMessageDialog(null, "The result of the addition is " + (number1 - number2));
				break;
			case 3:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 * number2));
				JOptionPane.showMessageDialog(null, "The result of the multiplication is " + (number1 * number2));
				break;
			case 4:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 / number2));
				JOptionPane.showMessageDialog(null, "The result of division the is " + (number1 / number2));
				break;
			case 5:
				number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the first number: "));
				number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the second number: "));
				System.out.println("The result is: " + (number1 % number2));
				JOptionPane.showMessageDialog(null, "The module is " + (number1 % number2));
				break;
			case 6:
				base = Float.parseFloat(JOptionPane.showInputDialog("Enter the base: "));
				exponent = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent: "));
				System.out.println("The result is: " + Math.pow(base, exponent));
				JOptionPane.showMessageDialog(null, "The result is: " + Math.pow(base, exponent));
				break;
			case 7:
				number = Float.parseFloat(JOptionPane.showInputDialog("Enter the base: "));
				radix = Integer.parseInt(JOptionPane.showInputDialog("Enter the root: "));
				System.out.println("The result is: ");
				JOptionPane.showMessageDialog(null, "The result is: " + Math.pow(number, radix));
				break;
			case 8:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist.\n");
				break;
			}

		} while (optionArithmetic != 8);
	}

	public static void Functions() {
		int optionFunction;
		double number;
		double angle;
		double angleRadians;
		do {
			optionFunction = Integer.parseInt(JOptionPane.showInputDialog("FUNCTIONS\n1. Sine\n" + "2. Cosine\n"
					+ "3. Tangent\n" + "4. Cotangent\n" + "5. Secant\n" + "6. Cosecant\n" + "7. Logarith,\n"
					+ "8. Natural Logarithm\n" + "9. Exit\n" + "Enter what you want to use: "));

			switch (optionFunction) {
			case 1:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The sin is: " + (Math.sin(angleRadians)));
				JOptionPane.showMessageDialog(null, "The sin is " + (Math.sin(angleRadians)));
				break;
			case 2:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The cosine is: " + (Math.cos(angleRadians)));
				JOptionPane.showMessageDialog(null, "The cosine is " + (Math.cos(angleRadians)));
				break;
			case 3:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The tangent is: " + (Math.tan(angleRadians)));
				JOptionPane.showMessageDialog(null, "The tangent is " + (Math.tan(angleRadians)));
				break;
			case 4:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The cotangent is: " + (Math.cos(angleRadians) / Math.sin(angleRadians)));
				JOptionPane.showMessageDialog(null, "The cotangent is " + (1 / Math.tan(angleRadians)));
				break;
			case 5:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The secant is: " + (1 / Math.cos(angleRadians)));
				JOptionPane.showMessageDialog(null, "The secant is " + (1 / Math.cos(angleRadians)));
				break;
			case 6:
				angle = Float.parseFloat(JOptionPane.showInputDialog("Enter the angle: "));
				angleRadians = Math.toRadians(angle);
				System.out.println("The cosecant is: " + (1 / Math.sin(angleRadians)));
				JOptionPane.showMessageDialog(null, "The cosecant is " + (1 / Math.sin(angleRadians)));
				break;
			case 7:
				number = Float.parseFloat(JOptionPane.showInputDialog("Enter the number: "));
				System.out.println("The logarithm is: " + (Math.log10(number)));
				JOptionPane.showMessageDialog(null, "The logarithm is " + (Math.log10(number)));
				break;
			case 8:
				number = Float.parseFloat(JOptionPane.showInputDialog("Enter the number: "));
				System.out.println("The natural logarithm is: " + (Math.log(number)));
				JOptionPane.showMessageDialog(null, "The natural logarithm is " + (Math.log(number)));
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist.\n");
				break;
			}

		} while (optionFunction != 9);
	}

	public static void poligons() {
		double side1, side2, apothem, side;
		int numberOfSides;
		int optionPoligon;

		do {
			optionPoligon = Integer.parseInt(
					JOptionPane.showInputDialog("POLIGONS. \n1. Poligons with 3 sides\n" + "2. Poligons with 4 sides\n"
							+ "3. Poligons with more sides\n" + "4. Exit\n" + "Enter the number of sides: "));

			switch (optionPoligon) {
			case 1:
				triangles();
				break;
			case 2:
				quadrilaterals();
				break;
			case 3:
				numberOfSides = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of sides: "));
				side = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the side: "));
				apothem = Double.parseDouble(JOptionPane.showInputDialog("Enter the apothem: "));
				PoligonNSides poligon = new PoligonNSides(numberOfSides, side, apothem);
				JOptionPane.showMessageDialog(null,
						"This area is " + poligon.calculateArea(numberOfSides, side, apothem));
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist.\n");
				break;
			}

		} while (optionPoligon != 4);
	}

	public static void vectors() {
		int vectorOption;
		int size1, size2;
		Vector v1, v2;
		double scalar;

		do {
			vectorOption = Integer.parseInt(JOptionPane.showInputDialog("VECTORS\n1. Addition" + "\n2. Subtraction"
					+ "\n3. Comparison" + "\n4. Multiply by a scalar\"" + "\n5. Dot product" + "\n6. Cross product"
					+ "\n7. Exit" + "\nEnter the operation you want work with: "));
			switch (vectorOption) {
			case 1:
				size1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the first vector: "));
				v1 = new Vector(size1);
				size2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the second vector: "));
				v2 = new Vector(size2);
				if (size1 != size2) {
					JOptionPane.showMessageDialog(null, "You can not add this vectors\nbecause they are not equal!");
					break;
				} else {
					v1.addVectors();
				}
				break;
			case 2:
				size1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the first vector: "));
				v1 = new Vector(size1);
				size2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the second vector: "));
				v2 = new Vector(size2);
				if (size1 != size2) {
					JOptionPane.showMessageDialog(null,
							"You can not substract this vectors\nbecause they are not equal!");
					break;
				} else {
					v1.addVectors();
				}
				break;
			case 3:
				size1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the first vector: "));
				v1 = new Vector(size1);
				size2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the second vector: "));
				v2 = new Vector(size2);
				if (size1 != size2) {
					JOptionPane.showMessageDialog(null, "These vectors are not equal!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "These vectors not equal!");
				}
				break;
			case 4:
				size1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the vector: "));
				scalar = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the scalar "));
				v1 = new Vector(size1);
				v1.scalar(scalar);
				break;
			case 5:
				size1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the first vector: "));
				v1 = new Vector(size1);
				size2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the second vector: "));
				v2 = new Vector(size2);
				if (size1 != size2) {
					JOptionPane.showMessageDialog(null,
							"You can not get the dot product this vectors\nbecause they are not equal!");
					break;
				} else {
					v1.dotProduct();
				}
				break;
			case 6:
				size1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the first vector: "));
				v1 = new Vector(size1);
				size2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the second vector: "));
				v2 = new Vector(size2);
				if (size1 != size2) {
					JOptionPane.showMessageDialog(null,
							"You can not get the cross product \nbecause the vectors are not equal!");
					break;
				} else {
					v1.crossProduct();
				}
				break;
			case 7:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist.");
				break;
			}
		} while (vectorOption != 7);
	}

	public static void matrices() {
		int rows1;
		int columns1;
		int rows2;
		int columns2;
		int matrixOption;

		do {
			matrixOption = Integer.parseInt(JOptionPane.showInputDialog(
					"MATRICES\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication" + "\n4. Comparison"
							+ "\n5. Inverse" + "\n6. Exit" + "\nEnter the operation you want work with: "));
			switch (matrixOption) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist");
				break;
			}
		} while (matrixOption != 6);
		rows1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows of the first matrix: "));
		columns1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns of the first matrix: "));
		Matrix matrix1 = new Matrix(rows1, columns1);
		matrix1.fillMatrix(rows1, columns1);

		rows2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows of the second matrix: "));
		columns2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns of the second matrix: "));
		Matrix matrix2 = new Matrix(rows2, columns2);
		matrix2.fillMatrix(rows2, columns2);
	}

	public static void complexNumbers() {
		int complexOption;

		do {
			complexOption = Integer.parseInt(JOptionPane
					.showInputDialog("COMPLEX NUMBERS\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication"
							+ "\n4. Division" + "\n5. Exit" + "\nEnter the operation you want work with: "));
			switch (complexOption) {

			case 1:
				Complex add = complex1().calculateAddition(complex2());
				/*
				 * JOptionPane.showMessageDialog(null,"The first complex number is: " +
				 * complex1().getReal() + " + " + complex1().getImg() + "j"+
				 * "\nThe second complex number is: " + complex2().getReal() + " + " +
				 * complex2().getImg() + "j" +
				 * " \nThe result of the addition is: "+add.getReal()+" + "+add.getImg()+"j");
				 */
				JOptionPane.showMessageDialog(null,
						"The result of the addition is: " + add.getReal() + " + " + add.getImg() + "j");
				break;
			case 2:
				Complex sub = complex1().calculateSubtraction(complex2());
				JOptionPane.showMessageDialog(null,
						"The result of the subtraction is: " + sub.getReal() + " + " + sub.getImg() + "j");
				break;
			case 3:
				Complex mul = complex1().calculateMultiplication(complex2());
				JOptionPane.showMessageDialog(null,
						"The result of the multiplication is: " + mul.getReal() + " + " + mul.getImg() + "j");
				break;
			case 4:
				// c.div(complex1(),complex2());
				break;
			case 5:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist");
				break;
			}
		} while (complexOption != 5);

	}

	public static void polynomials() {
		int polynomialOption;

		Polynomial p1 = new Polynomial(1, 1);
		Polynomial p2 = new Polynomial(1, 1);

		do {
			polynomialOption = Integer.parseInt(JOptionPane.showInputDialog(
					"POLYNOMIALS\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication" + "\n4. Get grade"
							+ "\n5. Factorization" + "\n6. Exit" + "\nEnter the operation you want work with: "));
			switch (polynomialOption) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				break;
			case 5:

				break;
			case 6:
				break;

			default:
				JOptionPane.showMessageDialog(null, "This option does not exist");
				break;
			}
		} while (polynomialOption != 6);
	}

	public static void statistics() {
		int option;
		int contadorN = 0;
		double element = 0;
		double sum = 0;
		double mean = 0;
		double median, mode;
		double range, variance, standardD, absoluteD;
		String str = "";

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("STATISTICS\n1. Using arrays." + "\n2. Using a file."
					+ "\n3. Exit" + "\nEnter the operation you want work with: "));
			switch (option) {
			case 1:
				List<Double> numbers = new ArrayList<>();
				int size = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of data: "));
				double array[] = new double[size];
				for (int i = 0; i < size; i++) {
					element = Double.parseDouble(JOptionPane.showInputDialog("Enter the element " + (i + 1) + ": "));
					array[i] = element;
					sum += element;
					if (i < size - 1) {
						str += array[i] + " ";
					} else {
						str += array[i];
					}
				}
				mean = sum / array.length;
				results(str, sum, mean);
				break;
			case 2:

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(fileChooser);

				FileReader fr = null;
				BufferedReader br = null;
				String linea;

				try {
					fr = new FileReader("C:\\Users\\arago\\eclipse-workspace\\calcu\\archivo.txt");
					br = new BufferedReader(fr);
					while ((linea = br.readLine()) != null) {
						System.out.println(linea);
						JOptionPane.showMessageDialog(null, linea);
						element = Double.parseDouble(linea);
						sum += element;
						contadorN += 1;
						/*
						 * if((linea = br.readLine()) != null) { str+=linea+", "; } else { str+=linea; }
						 */
					}
					mean = sum / contadorN;
					System.out.println(sum);
				} catch (Exception er) {
					System.out.println("Error " + er);
				} finally {
					try {
						if (null != fr) {
							fr.close();
						}
					} catch (Exception ex) {
						System.out.println("Error " + ex);
					}
				}
				results(str, sum, mean);
				break;
			case 3:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist");
				break;
			}
		} while (option != 3);
	}

	public static int insertVector2() {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the second vector: "));
		return number;
	}

	public static Complex complex1() {
		double real = Double.parseDouble(JOptionPane.showInputDialog("Enter the real part of the first number: "));
		getReal(real);
		double imaginary = Double
				.parseDouble(JOptionPane.showInputDialog("Enter the imaginary part of the first number: "));
		Complex c = new Complex(real, imaginary);
		return c;
	}

	public static Complex complex2() {
		double real = Double.parseDouble(JOptionPane.showInputDialog("Enter the real part of the second number: "));
		double imaginary = Double
				.parseDouble(JOptionPane.showInputDialog("Enter the imaginary part of the second number: "));
		Complex c = new Complex(real, imaginary);
		return c;
	}

	public static double getReal(double real) {
		return real;
	}

	public static void triangles() {
		double side1, side2, side3;
		int optionTriangle;

		do {
			optionTriangle = Integer.parseInt(
					JOptionPane.showInputDialog("TRIANGLES. \n1. Equilateral triangle\n" + "2. Isosceles triangle\n"
							+ "3. scalene triangle\n" + "4. Exit\n" + "Enter the number of sides: "));

			switch (optionTriangle) {
			case 1:
				side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the side: "));
				break;
			case 2:
				side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the repeated side: "));
				side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the other side: "));
				break;
			case 3:
				side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the first side: "));
				side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the second side: "));
				side3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the third side: "));
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "This option does not exist.\n");
				break;
			}

		} while (optionTriangle != 3);
	}

	public static void quadrilaterals() {
		double side1, side2;

		side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the first side: "));
		side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of the second side: "));

		if (side1 == side2) {

			Quadrilateral sq = new Quadrilateral(4, side1);
			System.out.println("You are studying a square.");
			System.out.println(sq.perimeterS(side1) + "u.");
			System.out.println(sq.areaS(side1) + "u2.");
			JOptionPane.showMessageDialog(null, "You are studying a squared." + "\nThe perimeter of the square is "
					+ sq.perimeterS(side1) + "u." + "\nThe area of the square is " + sq.areaS(side1) + "u2.");

		} else {
			Quadrilateral re = new Quadrilateral(4, side1, side2);
			System.out.println("You are studying a rectangle.");
			System.out.println(re.perimeterR(side1, side2) + "u.");
			System.out.println(re.areaR(side1, side2) + "u2.");
			JOptionPane.showMessageDialog(null,
					"You are studying a rectangle." + "\nThe perimeter of the rectangle is "
							+ re.perimeterR(side1, side2) + "u." + "\nThe area of the rectangle is "
							+ re.areaR(side1, side2) + "u2.");
		}
	}

	public static void results(String str, double sum, double mean) {
		System.out.println("The elements entered were: [" + "" + str + "]");
		System.out.println("  The sorted elements are: [" + "" + str + "]");
		System.out.println("The sum of the elements is " + sum);
		System.out.println("*---- CENTRAL TENDENCY ----*");
		System.out.println("The mean is " + mean);
		System.out.println("The median is ");
		System.out.println("The mode is ");
		System.out.println("*---- DISPERSION ----*");
		System.out.println("The range is: ");
		System.out.println("The variance is: ");
		System.out.println("The standard deviation is: ");
		System.out.println("Average absolute deviation is: ");
	}
}
