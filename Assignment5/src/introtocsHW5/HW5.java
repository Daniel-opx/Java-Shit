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


    public static int rearrangeArray(int[] nums,int val)
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

    public static int lengthOfLongestSubstring(String s)
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

    public static String  longestCommonPrefix(String[] strs)
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
   public static boolean findIndexSortedMat(int[][] mat, int val)
   {
        int low = 0, high = mat.length - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            int[] currentArr = mat[mid];
            boolean isValInCurrentArr = false;

            int currArrLow = 0, currArrHigh = currentArr.length - 1;

            while (currArrLow <= currArrHigh)
            {
                int currArrMid = currArrLow + (currArrHigh - currArrLow) /2;
                if(currentArr[currArrMid] == val)
                {
                    isValInCurrentArr = true;
                    break;
                }
                if(currentArr[currArrMid] < val)
                {
                    currArrLow = currArrMid + 1;
                }
                else
                {
                    currArrHigh = currArrHigh - 1;
                }
            }
            if(isValInCurrentArr)
            {
                return true;
            }
            if (currentArr[0] < val)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return false;
   }

   public static boolean findMultiSortedArray(int [] arr, int k) {
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



    public static void main(String[] args)
    {

        int[] arr = new int[]{5,3,3,8,3,2,1};
        int res = rearrangeArray(arr,3);

        String s = "pwwkew";
        int subStringFoo = lengthOfLongestSubstring(s);
        System.out.println("foo");

        String[] strs = new String[]{"flower","dly","b"};
        System.out.println(longestCommonPrefix(strs));

        int[][] mat = new int[][]{
                {0,1,1},
                {2,4,5},
                {7,8,8}

        };
        System.out.println(findIndexSortedMat(mat,6));
    }
}
