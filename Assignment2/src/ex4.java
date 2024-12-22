// Assignment: 2
// Author: Daniel Sasson ID:318885167

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("enter the size of the matrix: ");
        int matrixSize = reader.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            System.out.printf("Insert the line elements %d(separated by space): ", i+1);
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }
        System.out.println("the matrix is symettric: " + IsMatrixSymmetric(matrix));



    }
    static boolean IsMatrixSymmetric(int[][] matrix)
    {
        for(int  i = 0; i < matrix.length;i++)
        {
            for (int j = 0; j < matrix[0].length; j++) {
                //skip the check for the main diagonal.
                if(i == j)
                    continue;
                if(matrix[i][j] != matrix[j][i])
                    return false;
            }
        }
        return true;
    }
}
