package calcu;

import javax.swing.JOptionPane;

public class Vector {
  
	int len;

	public Vector(int len) {
		this.len = len;
	}

	public int getLen() {
		return len;
	}

	public static double[] fillVector1(int len) {
		double v[] = new double[len];
		String str = "";
		for (int i = 0; i < len; i++) {
			v[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter the element " + (i + 1) + " of vector 1: "));
			str += v[i]+" ";
		}
		System.out.println("The first vector entered was "+str);
		JOptionPane.showMessageDialog(null,"The first vector entered was "+str+"\n");
		return v;
	}
	
	public static double[] fillVector2(int len) {
		double v[] = new double[len];
		String str = "";
		for (int i = 0; i < len; i++) {
			v[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter the element " + (i + 1) + " of vector 2: "));
			str += v[i]+" ";
		}
		System.out.println(" The second vector entered was "+str);
		JOptionPane.showMessageDialog(null,"The second vector entered was "+str+"\n");
		return v;
	}

	public void addVectors() {
		double v1[] = fillVector1(len);
		double v2[] = fillVector2(len);
		double v3[] = new double[len];
		String str = "";
		for (int i = 0; i < v2.length; i++) {
			v3[i] = v1[i] + v2[i];
			str+=v3[i]+" ";
		}
		JOptionPane.showMessageDialog(null,"The resultant vector is: "+str);
	}

	public void substractVectors() {
		double v1[] = fillVector1(len);
		double v2[] = fillVector2(len);
		double v3[] = new double[len];
		String str = "";
		for (int i = 0; i < v2.length; i++) {
			v3[i] = v1[i] - v2[i];
			str+=v3[i]+" ";
		}
		JOptionPane.showMessageDialog(null,"The resultant vector is: "+str);
	}
	
	public boolean compareVectors() {
		double v1[] = fillVector1(len);
		double v2[] = fillVector2(len);
		if (v1.length == v1.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public void scalar(double scalar) {
		double v1[] = fillVector1(len);
		double v2[] = new double[len];
		String str = "";
		for (int i = 0; i < v2.length; i++) {
			v2[i] = scalar*v1[i];
			str+=v2[i]+" ";
		}
		JOptionPane.showMessageDialog(null,"The resultant vector is: "+str);
	}
	
	public void dotProduct() {
		double v1[] = fillVector1(len);
		double v2[] = fillVector2(len);
		double dot;
		double result=0;
		String str = "";
		for (int i = 0; i < v2.length; i++) {
			dot = v1[i] * v2[i];
			result +=dot;
		}
		JOptionPane.showMessageDialog(null,"The dot product vector is: "+result);
	}
	
	public void crossProduct() {
		double v1[] = fillVector1(len);
		double v2[] = fillVector2(len);

		String str = "";
		for (int i = 0; i < v2.length; i++) {
			
		}
		JOptionPane.showMessageDialog(null,"The resultant vector is: "+str);
	}
	
}
