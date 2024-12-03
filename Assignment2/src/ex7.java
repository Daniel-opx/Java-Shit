import java.util.Scanner;

public class ex7 {
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
        MoveEachRowUp(matrix);
        for(int i = 0; i < matrix.length; i++)
        {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("],");
        }

    }
    static void SwapRows(int[][] matrix,int r1Idx,int r2Idx)
    {
        int numOfRows = matrix.length;
        if(!((r2Idx >= 0  && r2Idx < matrix.length) && (r1Idx >= 0  && r1Idx < matrix.length)))
            return;
        int[] temp = new int[matrix.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = matrix[r2Idx][i];
        }
        for (int i = 0; i < temp.length; i++) {
            matrix[r2Idx][i] = matrix[r1Idx][i];
        }
        for (int i = 0; i < temp.length; i++) {
            matrix[r1Idx][i] = temp[i];
        }
    }
    static void MoveEachRowUp(int[][] matrix)
    {
        for (int i = 0; i < matrix.length - 1; i++) {
            int r1 = i;
            int r2 = mod(i-1, matrix.length);
            SwapRows(matrix,i, mod(i-1,matrix.length));
        }
    }
    static int mod(int num,int divider)
    {
        while (num < 0 || num > divider - 1)
        {
            if(num < 0)
                num += divider;
            if(num > divider - 1)
                num -= divider;
        }
        return num;
    }
}
