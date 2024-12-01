import java.util.Scanner;

public class ex2 {
    public static  void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the length: ");
        int length = scanner.nextInt();
        int[] arr = InnitIntArray(length);

        System.out.print("array values: ");
        PrintArr(arr);

        arr = RemoveDuplicate(arr);
        System.out.print("new array without duplicates: ");
        PrintArr(arr);

        System.out.println();
        int sum = 0 , currSum = 0;
        for(int i = 0; i < arr.length - 1;i++)
        {
            for(int j = i + 1; j <arr.length; j++)
            {
                currSum = arr[i] + arr[j];
                sum += currSum;
                System.out.printf("sum of the pairs %d & %d: %d\n",i+1, j+1 ,currSum);
            }
        }
        System.out.println("the sum of all pairs is: " + sum);



    }
    public static int[] InnitIntArray(int length)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers for array: ");
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        return arr;

    }
    public static int[] RemoveDuplicate(int[] arr)
    {
        boolean isDuplicate = false;
        int duplicateCounter = 0;
        boolean[] duplicateIndexes = new boolean[arr.length];
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
            duplicateIndexes[i] = isDuplicate;

        }
        int newLength = arr.length - duplicateCounter;
        int[] reducedArr = new int[newLength];

        int reducedArrIdx = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(!duplicateIndexes[i])
            {
                reducedArr[reducedArrIdx++] = arr[i];
            }
        }
        return reducedArr;
    }
    public static void PrintArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
