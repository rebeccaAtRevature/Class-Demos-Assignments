// Assignments on arrays - process/logic should reside in a separate method

package arrays;

// import java.util.Scanner;

public class ArrayPractice {
	
	public static int findTheSum(int[] array) {
		// 1) find the sum of n numbers taken as input from user/ hard coded values
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	
		}
		return sum;
	}
	
	
	public static String howManyOfAnElement(int[] array) {
		// 2) print the number of times an element is present in an array
	    // int[] numbers = { 10, 20, 30, 10, 40, 50, 20, 10}
	
		// expected output
	    //	10 - 3
	    //	20 - 2
	    //	30 - 1
	    //	40 - 1
	    //	50 - 1		
		String output = "";
		// create variable to store how many times a number is repeated
		int[] repetitions = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			// for each element of an array, compare to all other elements to determine repeats
			for(int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					// for each element j that matches element i, increment the repetitions variable by 1
					repetitions[i] += 1;
				}	
			}
			output += "\n" + array[i] + " - " + repetitions[i];
		}
		return output;
	}
	
	public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB) {
		// 3) Matrix Addition 
		
		// Determine matrix dimensions {row, column}
		int[] dimensionsA = {matrixA.length, matrixA[0].length};
		int[] dimensionsB = {matrixB.length, matrixB[0].length};
		// Create an instance of a matrix object
		int[][] matrixSum = new int[dimensionsA[0]][dimensionsA[1]];
		// Check whether the dimensions of the matrix are the same
		if(dimensionsA[0] != dimensionsB[0] || dimensionsA[1] != dimensionsB[1]) {
			// if either of the dimensions are not the same, print error
			System.out.println("ERROR! Dimensions must be equal for matrix addition and subtraction!");
		}else {
			for (int i = 0; i < dimensionsA[0]; i++) {
				for (int j = 0; j < dimensionsA[1]; j++) {
					// Perform element by element addition
					matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}
		}
		return matrixSum;
		
	}	
	
	public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB) {
		// 4) Matrix Multiplication
		
		// Determine matrix dimensions {row, column}
		int[] dimensionsA = {matrixA.length, matrixA[0].length};
		int[] dimensionsB = {matrixB.length, matrixB[0].length};
		// Create an instance of a matrix object
		int[][] matrixMult = new int[dimensionsA[0]][dimensionsA[1]];
		// Check whether the number of rows in the first matrix matches the number of columns in the second
		if(dimensionsA[1] != dimensionsB[0]) {
			// if the number of rows in the first matrix matches the number of columns in the second, print error
			System.out.println("ERROR! Rows in matrix A must be equal to the number of columns in matrix B!");
		}else {
			for (int i = 0; i < dimensionsA[1]; i++) {
				// i determines the row of the matrix solution
				for (int j = 0; j < dimensionsA[1]; j++) {
					// j determines the column of matrix solution
					for (int k = 0; k < dimensionsA[1]; k++) {
						// for a fixed position on the solution matrix determine the dot product by
						// iterating through the columns if row i in matrix A and the rows of column j in matrix B
						matrixMult[i][j] += matrixA[i][k] * matrixB[k][j];
					}
				}
			}
		}
		return matrixMult;	
	}
	
	public static void printMatrix(int[][] matrix) {
		// Determine matrix dimensions {row, column}
		int[] dimensionsA = {matrix.length, matrix[0].length};
		System.out.print("\n");
		for (int i = 0; i < dimensionsA[0]; i++) {
			// Iterate through each row and start a new line for each row
			System.out.print("\n");
			for (int j = 0; j < dimensionsA[1]; j++) {
				// Iterate through each column and print each element of array
				System.out.print(matrix[i][j] + "  ");
			}
		}
	}
	
	
	public static void irregularMarix(int[][] matrix){
		// 5) Not sure what was asked for here but will print jagged array
		System.out.print("\n");
		for (int i = 0; i < matrix.length; i++) {
			// Iterate through each row and start a new line for each row
			System.out.print("\n");
			for (int j = 0; j < matrix[i].length; j++) {
				// Iterate through each column and print each element of array
				System.out.print(matrix[i][j] + "  ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		// Input
		
		/*	//	CODE TO RECEIVE INPUTS FROM USER
		Scanner sc = new Scanner(System.in);
		// Ask user to provide the size of the array
		System.out.println("Please enter size of 1D array : ");
		int length1D = sc.nextInt();
		// Instantiate the 1D array
		int[] times = new int[length1D];
		// Ask user to input an integer and continue to ask until array is full
		System.out.println("Please enter integers for array until array is full.");
		for (int i = 0; i < length1D; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("1D array is full.\n");
		
		// Ask user to provide the dimensions of matrix A
		System.out.println("Please enter the number of rows in matrix A : ");
		int rowsA = sc.nextInt();
		System.out.println("Please enter the number of columns in matrix A : ");
		int colA = sc.nextInt();
		// Instantiate the 1D array
		int[][] times = new int[rowsA][colA];
		// Ask user to input an integer and continue to ask until array is full
		System.out.println("Please enter integers for matrix until full.");
		for (int i = 0; i < rowsA; i++){
			for (int j = 0; j < colA; j++){
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix A is full.\n");
		
				// Ask user to provide the dimensions of matrix B
		System.out.println("Please enter the number of rows in matrix B : ");
		int rowsB = sc.nextInt();
		System.out.println("Please enter the number of columns in matrix B : ");
		int colB = sc.nextInt();
		// Instantiate the 1D array
		int[][] times = new int[rowsB][colB];
		// Ask user to input an integer and continue to ask until array is full
		System.out.println("Please enter integers for matrix until full.");
		for (int i = 0; i < rowsB; i++){
			for (int j = 0; j < colB; j++){
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix B is full.\n");
		*/
		
		// hard code initial array values
		int[] array = {12,22,36,4,89,22,4};
		int[][] matrixA = {{4,1},{2,3}};
		int[][] matrixB = {{2,8},{5,4}};
		int[][] irregularMatrix = {{12,3,45,5},{2},{4,56,87},{6,63}};
		
		
		// Method Invocation
		int arraySum = findTheSum(array);
		String output = howManyOfAnElement(array);
		int[][] matrixSum = matrixAddition(matrixA, matrixB);
		int[][] matrixMult = matrixMultiplication(matrixA, matrixB);
		
		// Output
		System.out.println("1) The sum of the values of the array is: " + arraySum);
		System.out.println("\n2) The values in the array are repeated as follows: " + output);
		printMatrix(matrixSum);
		printMatrix(matrixMult);
		irregularMarix(irregularMatrix);
		
	}

}
