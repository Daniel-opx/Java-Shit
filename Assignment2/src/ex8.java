// Assignment: 2
// Author: Daniel Sasson ID:318885167

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("enter number of rows: ");
        int numOfRows = reader.nextInt();
        System.out.print("enter number of columns: ");
        int numOfColumns = reader.nextInt();

        int[][] matrix = new int[numOfRows][numOfColumns];

        System.out.println("enter the matrix values row by row: ");
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }

        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                CalcSumOfNeighbors(matrix, i, j, newMatrix);
            }
        }
        System.out.println("\n"+"new matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void CalcSumOfNeighbors(int[][] matrix, int i, int j, int[][] newMatrix)
    {

        int avg = 1;
        int sum = 0;
        int counter = 0;
        for (int iOffset = -1; iOffset < 2; iOffset++) {
            for (int jOffset = -1; jOffset < 2; jOffset++) {
                if(IsIndexesValid(i + iOffset, j + jOffset,matrix) && !(iOffset ==0 && jOffset ==0))
                {
                    sum += matrix[i + iOffset][j + jOffset];
                    counter++;
                }
            }
        }
        sum += matrix[i][j];
        avg = sum / (counter + 1);
        newMatrix[i][j] = avg;
    }
    static boolean IsIndexesValid(int i, int j, int[][]matrix)
    {
        return i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length;
    }
}
