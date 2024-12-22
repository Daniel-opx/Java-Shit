import java.util.Scanner;

// Assignment: 2
// Author: Daniel Sasson ID:318885167
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter length of arrays: ");
        int arrLength = scanner.nextInt();
        int[] arr1 , arr2;
        arr1 = new int[arrLength];
        arr2 = new int[arrLength];
        getUserIntsForArrays(arr1, arr2,arrLength);
        System.out.println(GetWeightedSum(arr1, arr2));




    }
    public static int GetWeightedSum(int[] arr1, int[] arr2)
    {
        int sum = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            sum += (arr1[i] * arr2[i]) * (i+1);
        }
        return sum;
    }
    public static void getUserIntsForArrays(int[] arr1, int[] arr2,int length)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbers for the first arr");
        for(int i = 0; i < length; i++)
        {
            arr1[i] = s.nextInt();
        }
        System.out.println("enter the numbers for the second arr");
        for(int i = 0; i < length; i++)
        {
            arr2[i] = s.nextInt();
        }


        s.close();
    }
}