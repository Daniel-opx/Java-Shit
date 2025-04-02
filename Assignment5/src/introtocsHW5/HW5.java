//Author: Daniel Sasson Id:318885167
package introtocsHW5;

public class HW5 {

    public static int[] sumIndex(int[] nums, int target)
    {
        int indexesArrPtr = 0;
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(i != 0)
            {
                for (int j = 0; j < indexesArrPtr; j++) {
                    indexes[j] = 0;
                }
            }
            indexesArrPtr = 0;
            indexes[indexesArrPtr++] = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                {
                    indexes[indexesArrPtr] = j;
                    return indexes;
                }
            }
        }





        return new int[]{-1, -1};
    }


    public  int rearrangeArray(int[] nums,int val)
    {
        int temp;
        int valOccurenceCounter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length- i - 1; j++) {
                if( nums[j] == val ||(nums[j] > nums[j+1] && nums[j+1] != val))
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val)
            {
                valOccurenceCounter++;
            }
        }
        return valOccurenceCounter;
    }

    public  int lengthOfLongestSubstring(String s)
    {
        int max = -1;
        boolean[] charsMap = new boolean[26];
        int currentCount = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j <s.length(); j++) {
                int currentCharIndex = s.charAt(j) - 'a';
                if(charsMap[currentCharIndex])
                {
                    break;
                }
                charsMap[currentCharIndex] = true;
                currentCount++;
            }
            charsMap = new boolean[26];
            max = Math.max(max,currentCount);
            currentCount = 0;

        }
        return max;
    }

    public  String  longestCommonPrefix(String[] strs)
    {
        String longestCommonPrefix = "";

        int minLength = 1000;

        for (int i = 0; i <strs.length ; i++) {
            int currentLength = strs[i].length();
            minLength = Math.min(currentLength, minLength);
        }

        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            boolean isCharCommon = true;
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != currentChar)
                {
                    isCharCommon = !isCharCommon;
                    break;
                }


            }
            if(!isCharCommon)
            {
                break;
            }
            longestCommonPrefix += currentChar;
        }
        return longestCommonPrefix;
    }
    public  boolean findIndexSortedMat(int[][] mat, int val) {
        int rows = mat.length;
        int cols = mat[0].length;
        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / cols;  // Calculate row index
            int col = mid % cols;  // Calculate column index

            if (mat[row][col] == val) {
                return true;
            }
            if (mat[row][col] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }



   public  boolean findMultiSortedArray(int [] arr, int k) {
       for (int i = 0; i < arr.length - 1; i++) {
           int product = arr[i] * arr[i + 1];
           if (product == k) {
               return true;
           } else if (product > k) {
               return false;

           }
       }
       return false;
   }

    static void merge(char arr[], int left, int mid, int right)
    {
        // Find sizes of two subarrays to be merged
        int rightLength = mid - left + 1;
        int leftLength = right - mid;

        // Create temp arrays
        char leftTemp[] = new char[rightLength];
        char rightTemp[] = new char[leftLength];

        // Copy data to temp arrays
        for (int i = 0; i < rightLength; ++i)
            leftTemp[i] = arr[left + i];
        for (int j = 0; j < leftLength; ++j)
            rightTemp[j] = arr[mid + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int tempArrIndexer = left;
        while (i < rightLength && j < leftLength) {
            if (leftTemp[i] <= rightTemp[j]) {
                arr[tempArrIndexer] = leftTemp[i];
                i++;
            }
            else {
                arr[tempArrIndexer] = rightTemp[j];
                j++;
            }
            tempArrIndexer++;
        }

        // Copy remaining elements of L[] if any
        while (i < rightLength) {
            arr[tempArrIndexer] = leftTemp[i];
            i++;
            tempArrIndexer++;
        }

        // Copy remaining elements of R[] if any
        while (j < leftLength) {
            arr[tempArrIndexer] = rightTemp[j];
            j++;
            tempArrIndexer++;
        }
    }

    public  void mergeSort(char[] array) {

        // For current size of subarrays to
        // be merged curr_size varies from
        // 1 to n/2
        int curr_size;

        int n = array.length;

        // For picking starting index of
        // left subarray to be merged
        int left_start;


        // Merge subarrays in bottom up
        // manner. First merge subarrays
        // of size 1 to create sorted
        // subarrays of size 2, then merge
        // subarrays of size 2 to create
        // sorted subarrays of size 4, and
        // so on.
        for (curr_size = 1; curr_size <= n-1;
             curr_size = 2*curr_size)
        {

            // Pick starting point of different
            // subarrays of current size
            for (left_start = 0; left_start < n-1;
                 left_start += 2*curr_size)
            {
                // Find ending point of left
                // subarray. mid+1 is starting
                // point of right
                int mid = Math.min(left_start + curr_size - 1, n-1);

                int right_end = Math.min(left_start
                        + 2*curr_size - 1, n-1);

                // Merge Subarrays arr[left_start...mid]
                // & arr[mid+1...right_end]
                merge(array, left_start, mid, right_end);
            }
        }
    }

    public  int orangesRotting(int[][] grid)
    {


        //square matrix- num of rows=nums of cols
        int matDimension = grid.length;

        boolean allTwoFlag = true;
        int zeroAroundCounter = 0;







        boolean isChanged = false;
        int counter = 0;
        int[][] directionMatrix = new int[][]{
                {0,1}, {0, -1}, {1,0}, {-1,0}
        };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j] != 2)
                {
                    continue;
                }
                isChanged = false;

                for (int k = 0; k < directionMatrix.length; k++) {
                    int iWithOffset = i + directionMatrix[k][0], jWithOffset = j + directionMatrix[k][1];
                    if(iWithOffset< matDimension && iWithOffset >=0 &&
                            jWithOffset < matDimension && jWithOffset >= 0)
                    {
                        if (grid[iWithOffset][jWithOffset] == 1)
                        {
                            grid[iWithOffset][jWithOffset] = 2;
                            isChanged = true;
                        }
                    }
                }
               if(isChanged)
               {
                   counter++;
               }
            }
        }
        for (int i = 0; i < matDimension; i++) {
            for (int j = 0; j < matDimension; j++) {
                if(grid[i][j] == 1)
                {
                    return -1;
                }
            }
        }
        return counter;
    }











}
