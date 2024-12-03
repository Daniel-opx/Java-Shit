import java.sql.Array;

public class ex8 {
    public static void main(String[] args)
    {
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                CalcSumOfNeighbors(matrix, i, j, newMatrix);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ",");
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
