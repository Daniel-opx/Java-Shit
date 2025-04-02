public class foo {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,8,9};
        countingSort(arr);

        System.out.println(lengthOfLongestSubstring("abccabcde"));
    }

    //buuble sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }


    static void insrtionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }

    public static int lengthOfLongestSubstring(String s) {

        int counter = 0;
        int currMax = 0;
        for(int i  = 0; i < s.length()-1; i++)
        {
            for(int j = i; j < s.length()-1; j++)
            {
                if(s.charAt(j) != s.charAt(j+1))
                {
                    counter++;
                }
                else {
                    break;
                }
            }
            if(currMax < counter)
            {
                currMax = counter;
            }
            counter = 0;
        }
        return currMax;
    }

    static boolean binarySearch(int[] arr, int l, int r, int val) {
        int m = (r - l) / 2 + l;
        if (l > r) {
            return false;
        }
        if (arr[m] == val) {
            return true;
        }
        if (arr[m] > val) {
            return binarySearch(arr, l, m - 1, val);
        }
        return binarySearch(arr, m + 1, r, val);
    }

    static void countingSort(int[] arr) {
        int len = arr.length;
        int[] output = new int[len];
        int max = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] counts = new int[max + 1];

        for (int i = 0; i < len; i++) {
            counts[arr[i]]++;
        }

        for (int i = 1; i < counts.length ; i++) {
            counts[i] += counts[i-1];
        }

        for(int i = len -1; i >= 0; i--)
        {
            output[counts[arr[i]]-1] = arr[i];
            counts[arr[i]]--;
        }
    }

    static void sort(int[] arr, int l, int r)
    {
        int m = (r - l)/2 + l;

        int leftLen = m - l + 1;
        int rightLen = r - m;
        int[] left = new int[leftLen];
        int[] right = new int[rightLen];

        for (int i = 0; i < leftLen; i++) {
            left[i] = arr[l +i];
        }
        for (int i = 0; i < rightLen; i++) {
            right[i] = arr[m+1+i];
        }

        int j =0, i = 0;
        int k = l;
        while(i < leftLen && j < rightLen)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
            }
        }
        while (i < leftLen)
        {
            arr[k++] = left[i++];
        }
        while (j < rightLen)
        {
            arr[k++] = right[j++];
        }
    }
    static void merge(int[] arr, int l, int r)
    {
        int m = (r - l)/2 + l;
        if(l < r)
        {
            merge(arr,l,m);
            merge(arr, m+1, r);
            sort(arr,l,r);
        }
    }
    static int jumpSearch(int[] arr, int val)
    {
        int len = arr.length;

        int step = (int)Math.sqrt(len);

        int start = 0, end = step;

        for (int i = Math.min(end,len) - 1; arr[i] < val ; i = Math.min(end,len)) {
            start = end;
            end += step;

            if(start >= len)
            {
                return -1;
            }
        }
        while (arr[start] < val)
        {
            start++;

            if(start == Math.min(len, end))
            {
                return -1;
            }
        }
        if(arr[start] == val)
        {
            return start;
        }
        return -1;
    }
}
