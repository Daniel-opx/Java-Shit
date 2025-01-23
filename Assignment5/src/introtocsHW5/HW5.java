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
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if( nums[j] == val ||(nums[j] > nums[j+1] && nums[j+1] != val))
                {
                    if(nums[j] == val)
                    {
                        valOccurenceCounter++;
                    }
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return valOccurenceCounter;
    }


    public static void main(String[] args)
    {
        int[] arr = new int[]{5,3,3,8,3,2,1};
        int res = rearrangeArray(arr,3);
        System.out.println("foo");

    }
}
