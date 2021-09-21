package calcu;

import javax.swing.JOptionPane;

public class Matrix {

	private int rows;
	private int columns;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	public static void fillMatrix(int rows, int columns) {
		String strM1 = "";
		JOptionPane.showMessageDialog(null, "Enter the matrix:");
		double matrix[][]=new double[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = Double
						.parseDouble(JOptionPane.showInputDialog("Enter the element [" + i + "][" + j + "]"));
				strM1 += String.valueOf(matrix[i][j] + "  ");
			}
			strM1 += "\n";
		}
		showMatrix(rows,columns,strM1);
	}
	
	public static void showMatrix(int rows, int columns, String strM1) {
		double matrix[][]=new double[rows][columns];
		JOptionPane.showMessageDialog(null, "The matrix entered was:\n" + strM1 + "\n");
		System.out.println("The matrix entered was:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void addition(Matrix m) {
		//m.fillMatrix(rows, columns);
	}
	
}
