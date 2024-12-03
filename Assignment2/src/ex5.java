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
        FindSeatInMatrix(matrix);

    }

    static void GetRowsMin(int[][] matrix, int[] rowsMin)
    {
        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;

        for (int i = 0; i < numOfRows; i++) {
            rowsMin[i] = matrix[i][0];
            for (int j = 1; j < numOfColumns; j++) {
                rowsMin[i] = rowsMin[i] > matrix[i][j]? matrix[i][j] : rowsMin[i];
            }
        }

    }
    static void GetColsMaxes(int[][] matrix, int[] colsMax)
    {
        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;

        for (int j = 0; j < numOfColumns; j++) {
            colsMax[j] = matrix[0][j];
            for (int i = 1; i < numOfRows; i++) {
                colsMax[j] = colsMax[j] <= matrix[i][j]? matrix[i][j] : colsMax[j];
            }
        }

    }
    static void FindSeatInMatrix(int[][] matrix)
    {
        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;

        int[] rowsMins = new int[numOfRows] , colsMaxes = new int[numOfColumns];
        GetColsMaxes(matrix,colsMaxes);
        GetRowsMin(matrix, rowsMins);

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                if(matrix[i][j] == rowsMins[i] && matrix[i][j] == colsMaxes[j])
                {
                    System.out.println("th seat is " + matrix[i][j]);
                    return;
                }

            }
        }
        System.out.println("there is no seats");
    }
}
