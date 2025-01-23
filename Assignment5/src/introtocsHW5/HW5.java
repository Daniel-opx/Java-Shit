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
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,7,11,5};
        int [] res = sumIndex(arr, 9);
        System.out.println("bla");
    }
}
