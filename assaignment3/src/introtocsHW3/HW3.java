// Assignment: 3
// Author: Daniel Sasson, ID: 318885167
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
        int secondMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < max && array[i] > secondMax)
                secondMax = array[i];
        }
        return secondMax;
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
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
           int currentLength = array[i].length;
            for (int j = 0; j < currentLength; j++) {
                if(isPerfectNum(array[i][j]))
                {
                    array[i][j] = 0;
                    counter++;
                }
            }
        }
        return counter;
    }

    // 8. numCells
    public static int  numCells(int initialNumberOfCells, int life, int numGenerations)  {

        int arraySize = initialNumberOfCells * Pow(2,numGenerations);
        int cells[] = new int[arraySize];
        //life +1 is a numeric representation of an invalid cell - dead cell.
        for (int i = 0; i < arraySize; i++) {
            cells[i] = life + 1;
        }
        /*lastPopulatedIdx and lastPopulatedIdxCpy is variables that hold the idx of the last populated cell in one
        based index*/
        int lastPopulatedIdx = initialNumberOfCells;
        int lastPopulatedCellCpy = lastPopulatedIdx;
        int numberOfLiveCells = initialNumberOfCells;

        for (int i = 0; i < initialNumberOfCells; i++) {
            cells[i] = 0;
        }
        for (int i = 0; i < numGenerations - 1; i++) {
            for (int j = 0; j <lastPopulatedIdx ; j++) {
                cells[j] += 1;
            }
            lastPopulatedCellCpy = lastPopulatedIdx;
            for (int j = 0; j < lastPopulatedCellCpy; j++) {
                if(cells[j] <= life)
                {
                    cells[lastPopulatedIdx] = 0;
                    lastPopulatedIdx++;
                    numberOfLiveCells++;
                }
                if(cells[j] == life)
                {
                    numberOfLiveCells--;
                }
            }


        }





        return numberOfLiveCells;
    }

    // 9. return the product of num1 and num2, also represented as a string.
    public static String multiplyStrings(String num1, String num2) {
        int sum = 0;
        int midSum = 0;
        int mainMultiplier = 1;
        int secondaryMultiplier = 1;
        int num1Length = num1.length();
        int num2Length = num2.length();
        for (int i = num1Length-1; i >=0 ; i--) {
            secondaryMultiplier = 1;
            for (int j = num2Length - 1; j >= 0 ; j--) {
                int num1Curr = num1.charAt(i) - '0';
                int num2Curr = num2.charAt(j) - '0';
                midSum += num1Curr * num2Curr * secondaryMultiplier;
                secondaryMultiplier *= 10;
            }

            sum += midSum * mainMultiplier;
            midSum = 0;
            mainMultiplier *= 10;

        }
        String res = "";
        while(sum > 0)
        {
            res += (char)((sum % 10) + '0');
            sum /= 10;
        }
        String reversed = "";
        for (int i = res.length()-1; i >= 0; i--) {
            reversed = reversed + res.charAt(i);
        }
        return reversed;
    }

    // 10. Check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if(str.length() == 2)
        {
            return str.charAt(0) == str.charAt(1);
        }
        else if(str.length() == 1)
        {
            return true;
        }

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Running tests...");
        HW3tests.tests();
        System.out.println("All tests completed.");
        System.out.println(Pow(10,2));


    }
    static boolean isUpper(char c)
    {
        return c >= 'A' && c <= 'Z';
    }

    static boolean isLower(char c) {
        return c >= 'a' && c <= 'z';
    }


    static boolean isPerfectNum(int num)
    {
        int sum = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        return sum == num;
    }

    static int Pow(int num,int power)
    {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }
}


