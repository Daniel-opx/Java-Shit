package introtocsHW3;

public class HW3 {
    // 1. Reverse a string
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length()-1; i > -1; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    // 2. Count vowels in a string
    public static int countVowels(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'i'
            ||input.charAt(i) == 'u')
            {
                counter++;
            }
        }
        return counter;
    }

    // 3. Matrix multiplication by substitution
    public static int[][] MatrixMulti(int[][] matrix1, int[][] matrix2) {
        //assuming that the multiplication is done by: matrix1*matrix2 , we will check if the operation is defined
        //and assuming that  the matrix is built in valid way (the shape of rectangle )
        int matrix1Cols = matrix1[0].length;
        int matrix2Rows = matrix2.length;

        int[][] defaultMatrix = new int[0][0];
        if(matrix1Cols != matrix2Rows) {
            return defaultMatrix;
        }

        int[][] res = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int currentSum = 0;
                for (int k = 0; k < matrix1Cols; k++) {
                    currentSum += matrix1[i][k] * matrix2[k][j];
                }
                res[i][j] = currentSum;

            }
        }
        return res;

    }

    // 4. Check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        //for this function we will mimic a sort of dictionary

        // create two array to correspond to the two string respectively
        int[] charsCount1 = new int[26];
        int[] charsCount2 = new int[26];
        int charIndexInABC = 0;

        for (int i = 0; i < str1.length(); i++) {

            char currentChar = str1.charAt(i);
            if(currentChar >= 65 && currentChar <= 90)
            {
                charIndexInABC = currentChar - 'A';
            }
            else
            {
                charIndexInABC = currentChar - 'a';
            }
            charsCount1[charIndexInABC]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char currentChar = str2.charAt(i);
            if(currentChar >= 65 && currentChar <= 90)
            {
                charIndexInABC = currentChar - 'A';
            }
            else
            {
                charIndexInABC = currentChar - 'a';
            }
            charsCount2[charIndexInABC]++;
        }
        for (int i = 0; i < charsCount1.length; i++) {
            if(charsCount1[i] != charsCount2[i])
            {
                return false;
            }
        }
        return true;
    }

    // 5. Find the second largest element in an array
    public static int findSecondLargest(int[] array) {
        int max = array[0];
        int secondMAx = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < max && array[i] > secondMAx)
                secondMAx = array[i];
        }
        return secondMAx;
    }

    // 6. convert Case
    public static String convertCase(String input) {
        String converted = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(isUpper(currentChar))
            {
                converted += (char)(currentChar + ('a' - 'A'));
            }
            else if(isLower(currentChar)){
                converted += (char)(currentChar - ('a' - 'A'));
            }
            else
            {
                converted += currentChar;
            }

        }
        return  converted;

    }

    // 7. changes by the description for perfectNum
    public static int perfectNum(int[][] array) {
        return -1;
    }

    // 8. numCells
    public static int  numCells(int initialNumberOfCells, int life, int numGenerations)  {
        return -1;
    }

    // 9. return the product of num1 and num2, also represented as a string.
    public static String multiplyStrings(String num1, String num2) {
        return "";
    }

    // 10. Check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Running tests...");
        HW3tests.tests();
        System.out.println("All tests completed.");

    }
    static boolean isUpper(char c)
    {
        return c >= 'A' && c <= 'Z';
    }

    static boolean isLower(char c) {
        return c >= 'a' && c <= 'z';
    }



}


