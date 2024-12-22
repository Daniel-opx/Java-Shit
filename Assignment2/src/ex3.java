// Assignment: 2
// Author: Daniel Sasson ID:318885167

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("array size:  ");
        int length = scanner.nextInt();
        int[] arr = InnitIntArray(length);
        int invalidValue = arr[0] - 1;

        int numOfDuplicates = RemoveDuplicate(arr,invalidValue);

        System.out.print("the unique numbers int the array: ");
        for(int i = 0; i < arr.length; i++)
        {
            if(!(arr[i] == invalidValue))
                System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("number of unique values: " + (arr.length - numOfDuplicates));


    }


    public static int RemoveDuplicate(int[] arr, int invalidValue)
    {
        int defaultValue = arr[0]-1;

        boolean isDuplicate = false;
        int duplicateCounter = 0;

        for(int i = 0; i < arr.length; i ++)
        {
            isDuplicate = false;
            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    isDuplicate = true;
                    duplicateCounter++;
                    break;
                }

            }
            arr[i] = isDuplicate? invalidValue: arr[i];

        }


        for (int i = 0; i < arr.length; ) {
            if(arr[i] == invalidValue)
            {
                for (int j = i ; j < arr.length-1 ; j++) {
                    arr[j] = arr[j +1];
                }
            }
            if(arr[i] != invalidValue || i >= (arr.length - duplicateCounter))
                i += 1;
        }
        for (int i = arr.length - duplicateCounter; i < arr.length; i++) {
            arr[i] = invalidValue;
        }

        return duplicateCounter;
    }
    public static int[] InnitIntArray(int length)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter numbers for array: ");
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        return arr;

    }
}
