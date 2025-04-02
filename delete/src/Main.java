import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       int num = 15;
       String s = toBinary(14);
        System.out.println(s);

        int[] arr = new int[]{4,5,6,3,7,8};
        bubbleSort(arr);
        pan(arr,2);
        for(int i : arr)
        {
            System.out.print(i + ", ");
        }


        //System.out.println(bSearch(arr,10));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }

    static void pancake(int[] arr, int start)
    {
        int lastIndex = arr.length - 1;
        if(start >= arr.length - 1)
        {
            return;
        }
        int offset = 0;
        int mIdx = (lastIndex - start)/2 + start+1;
        for (int i = start; i < mIdx ; i++) {
            int temp = arr[i];
            arr[i] = arr[lastIndex-offset];
            arr[lastIndex - offset] = temp;
            offset++;
        }
    }
    static void pan(int[] arr, int start)
    {
        int right = arr.length - 1;
        while(start < right)
        {
            int temp = arr[start];
            arr[start] = arr[right];
            arr[right] = temp;
            start++;right--;

        }
    }

    static void bubbleSort(int[] arr)
    {
        int len = arr.length;
        for(int i = 0; i < len - 1; i++)
        {
            for(int j = 0; j < len - 1 -i; j++)
            {
                if(arr[j+1] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



    static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }


    public static String toBinary(int num)
    {
        int qoitenet = num / 2;
        int rem = num % 2;
        if(qoitenet == 0)
        {
            return (char)(rem + '0') + "";
        }
        return toBinary(qoitenet) + (char)(rem + '0');
    }
    public static boolean isPrem(int[] arr)
    {
        int[] flags = new int[arr.length + 1];
        for(int i: arr) {
            if (i > arr.length || i < 1 || flags[i] == 1) {
                {
                    return false;
                }
            }
            flags[i] = 1;
        }
        return true;
    }
    public static boolean bSearch(int[] arr, int val)
    {
        return bSearch(arr, 0, arr.length -1, val);
    }
    public static boolean bSearch(int[] arr, int low, int high, int val)
    {
        int m = (high - low)/2 + low;
        if(low > high)
        {
            return false;
        }
        if(arr[m] == val)
        {
            return true;
        }
        if(arr[m] > val)
        {
            return bSearch(arr, low , m -1, val);
        }
        return bSearch(arr,m+1,high,val);


    }

    static void mergeSort(int[] arr, int l , int r)
    {
        int m  =  l + (r-l)/2;
        int[] leftSide = new int[m- l + 1];
        int[] rightSide = new int[r-m];

        //copy
        for (int i = 0; i < leftSide.length; i++) {
            leftSide[i] = arr[l + i];
        }
        for (int i = 0; i < rightSide.length; i++) {
            rightSide[i] = arr[m+1+i];
        }

        //indices for subarryas
        int i = 0, j = 0;
        int k = l;

        while (i < leftSide.length && j < rightSide.length)
        {
            if(leftSide[i] <= rightSide[j])
            {
                arr[k] = leftSide[i];
                i++;
            }
            else
            {
                arr[k] = rightSide[j];
                j++;
            }
            k++;
        }
        while (i < leftSide.length)
        {
            arr[k] = leftSide[i];
            i++;
            k++;
        }
        while( j  < rightSide.length)
        {
            arr[k] = rightSide[j];
            j++; k++;
        }





    }

    static void merge(int[] arr, int l, int r)
    {
        if(l < r)
        {
            int m = (r-l)/2 + l;
            merge(arr,l,m);
            merge(arr,m+1,r);
            mergeSort(arr,l,r);
        }
    }
}