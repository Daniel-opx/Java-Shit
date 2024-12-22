package introtocsHW3;

public class HW3tests {
    public static void tests() {
        // Test 1: Reverse string
        System.out.println("Test 1: Reverse string\n" +
                HW3.reverseString("hello").equals("olleh"));

        // Test 2: Count vowels
        System.out.println("Test 2: Count vowels\n" +
                (HW3.countVowels("hello") == 2));

        //
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] expectedMatrix = {{19, 22}, {43, 50}};
        System.out.println("Test 3: Matrix multiplication\n" +
                java.util.Arrays.deepEquals(HW3.MatrixMulti(matrix1, matrix2), expectedMatrix));

        // Test 4: Anagrams
        System.out.println("Test 4: Anagrams\n" +HW3.areAnagrams("listen", "silent"));
        System.out.println("Test 4: Anagrams\n" + !HW3.areAnagrams("hello", "world"));

        // Test 5: Second largest
        System.out.println("Test 5: Second largest\n" +
                (HW3.findSecondLargest(new int[]{1, 2, 3, 4, 5}) == 4));

        // Test 6: Convert case
        System.out.println("Test 6: Convert case\n" +
                HW3.convertCase("HeLLo").equals("hEllO"));

        // Test 7: Perfect numbers
        int[][] array = {{6, 28}, {1, 12}};
        System.out.println("Test 7: Perfect numbers\n"  +
                (HW3.perfectNum(array) == 2));

        // Test 8: Number of cells
        System.out.println("Test 8: Number of cells\n" +
                (HW3.numCells(2, 2, 3) == 16));

        // Test 9: Multiply strings
        System.out.println("Test 9: Multiply strings\n" +
                HW3.multiplyStrings("123", "456").equals("56088"));

        // Test 10: Palindrome
        System.out.println("Test 10: Palindrome\n" + HW3.isPalindrome("racecar"));
        System.out.println("Test 10: Palindrome\n" + !HW3.isPalindrome("hello"));

    }
}


