// Assignment: 2
// Author: Daniel Sasson ID:318885167

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("enter the number of rows in the matrix: ");
        int numOfMatrixRows = reader.nextInt();
        System.out.print("enter the number of columns in the matrix: ");
        int numOfMatrixColumns = reader.nextInt();
        int[][] matrix = new int[numOfMatrixRows][numOfMatrixColumns];

        for (int i = 0; i < numOfMatrixRows; i++) {
            System.out.printf("Insert the line elements %d(separated by space): ", i+1);
            for (int j = 0; j < numOfMatrixColumns; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }

        int sum = 0;

        for (int m = 0; m < numOfMatrixColumns; m++) {
            sum += matrix[0][m];
            sum += matrix[numOfMatrixRows - 1][m];
        }
        for (int n = 1; n < numOfMatrixRows - 1; n++) {
            sum += matrix[n][numOfMatrixColumns - 1];
            sum += matrix[n][0];
        }

        System.out.println("thr sum of is: " + sum);
    }
}
