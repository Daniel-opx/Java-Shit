import java.util.Scanner;

public class ex5 {
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

    }
    static int[] GetRowsMaxes(int[][] matrix, int[] rowsMaxes)
    {
        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;

        for (int i = 0; i < numOfRows; i++) {
            rowsMaxes[i] = matrix[i][0];
            for (int j = 1; j < numOfColumns; j++) {
                rowsMaxes[i] = rowsMaxes[i] <= matrix[i][j]? matrix[i][j] : rowsMaxes[i];
            }
        }

    }
    static int[] GetRowsMaxes(int[][] matrix, int[] colsMaxes)
    {
        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;

        for (int j = 0; j < numOfColumns; j++) {
            colsMaxes[j] = matrix[j][0];
            for (int i = 1; i < numOfRows; i++) {
                colsMaxes[i] = colsMaxes[i] <= matrix[j][i]? matrix[j][i] : colsMaxes[j];
            }
        }

    }
}
