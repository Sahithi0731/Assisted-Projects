package assistedproject25;
import java.util.Scanner;

class Matrix_Division {
	
	Scanner scan;
	int matrix1[][], matrix2[][], div[][];
	int row, column;
 
	void create() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Matrix Division");
		
		// First Matrix Creation..
		System.out.println("\nEnter number of rows & columns");
		row = Integer.parseInt(scan.nextLine());
		column = Integer.parseInt(scan.nextLine());
		
		matrix1 = new int[row][column];
		matrix2 = new int[row][column];
		div = new int[row][column];
 
		System.out.println("Enter the data for first matrix :");
 
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		// Second Matrix Creation..
		System.out.println("Enter the data for second matrix :");
 
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				matrix2[i][j] = scan.nextInt();
			}
		}
	}
	
	void display() {
		
		System.out.println("\nThe First Matrix is :");
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("\t" + matrix1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\nThe Second Matrix is :");
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("\t" + matrix2[i][j]);
			}
			System.out.println();
		}
	}
	
	void div() {
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				div[i][j] = matrix1[i][j] / matrix2[i][j];
			}
		}
		
		System.out.println("\n\nThe Division is :");
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("\t" + div[i][j]);
			}
			System.out.println();
		}
	}
}
 
public class matrixdivision {
	
	public static void main(String args[]) {
		
		Matrix_Division obj = new Matrix_Division();
		
		obj.create();
		obj.display();
		obj.div();
	}
}
