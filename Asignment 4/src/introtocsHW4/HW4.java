//assignment 4
//author: Daniel Sasson ID:318885167
package introtocsHW4;


public class HW4 {
    public static void main(String[] args) {
        

    }

    /**
     *
     * @param arr array of ints
     * @return the second maximum elemnt in the array
     */
    public static int  findSecondMax(int[] arr)
    {
        int firstMax = findFirstMax(arr,1,arr[0]);
        int secondMax = findSecondMax(arr,1,arr[0],firstMax);
        return secondMax;
    }

    /**
     *
     * @param arr array of ints
     * @param idx - index
     * @param lastMax the max from the other recursion stacks
     * @param firstMax
     * @return second largest element in the int array
     */
    private static int findSecondMax(int[] arr, int idx, int lastMax, int firstMax)
    {
        if(idx == arr.length - 1)
        {
            return arr[idx] >= lastMax? arr[idx]: lastMax;
        }
        int currentMax = arr[idx] >= lastMax? arr[idx]: lastMax;
        int upperLayerMax = findSecondMax(arr,idx + 1, currentMax, firstMax);
        if(upperLayerMax >= currentMax && upperLayerMax != firstMax)
        {
            return upperLayerMax;
        }
        else
        {
            return currentMax;
        }


    }
    private static int findFirstMax(int[] arr, int idx, int lastMax)
    {
        if(idx == arr.length - 1)
        {
            return arr[idx] >= lastMax? arr[idx]: lastMax;
        }
        int currentMax = arr[idx] >= lastMax? arr[idx]: lastMax;
        int upperLayerMax = findFirstMax(arr,idx + 1, currentMax);
        return upperLayerMax >= currentMax? upperLayerMax : currentMax;

    }
    public static boolean isPalindrome(String str)
    {
        return isPalindromeWrapper(str,0);
    }
    private static boolean isPalindromeWrapper(String str, int idx)
    {
        if(idx == str.length() / 2)
        {
            return true;
        }
        boolean upperLayerBoolean=isPalindromeWrapper(str,idx + 1);
        return upperLayerBoolean && (str.charAt(idx) == str.charAt(str.length() - idx - 1));


    }

    public static boolean searchWord(String text, String word)
    {
        word = word.toLowerCase();
        return searchWordW(text, word, "", 0);
    }
    private static boolean searchWordW(String text, String word , String buffer , int idx)
    {
        if(buffer.equals(word))
        {
            return true;
        }
        if(idx == text.length())
        {
            return false;
        }
        char currentChar = text.charAt(idx);
        if (currentChar >=  'A' && currentChar <= 'Z')
        {
           currentChar= (char)(currentChar += 32);
        }
        buffer += currentChar;
        if(text.charAt(idx) == ' ')
        {
            buffer = "";
        }
        return searchWordW(text, word, buffer, idx + 1);


    }
    public static String getOddIndexLetters(String s)
    {
        String res = getOddIndexLettersHelper(s, 0);
        return res;
    }
    public static String getOddIndexLettersHelper(String s, int idx)
    {
        if(idx == s.length()-1)
        {
            if(idx % 2 == 0)
            {
                return "";
            }
            else
            {
                String returned = "";
                returned += s.charAt(idx);
                return returned;
            }
        }
        String currentLetter = "";
        if(idx % 2 ==1)
        {
            currentLetter += s.charAt(idx);
        }
        String currValue = "";
        currValue = currentLetter += getOddIndexLettersHelper(s,idx +1);
        return currValue;

    }
    public static int determinant(int[][] arr)
    {
        return determinantHelper(arr,0,0);
    }
    public static int determinantHelper(int[][] arr,int i, int j)
    {
        if(j == arr.length)
        {
            return 0;
        }
        if(arr.length ==2)
        {
            int res = arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];
            return res;
        }

        int currSign = j % 2 == 0? 1: -1;
        int[][] subMat = getSubMatrixWithoutRowIandColJ(arr,i,j);
        return currSign * arr[i][j]*determinantHelper(subMat,i,0) + determinantHelper(arr,i,j+1);
    }
    public static int[][] getSubMatrixWithoutRowIandColJ(int[][] matrix, int row, int col)
    {
        int[][] subMatrix = new int[matrix.length -1][matrix.length-1];
        populateSubMatrixWithoutRowIAndColJ(matrix, 0, 0, row, col, subMatrix, 0 ,0);
        return subMatrix;
    }

    /**
     * for every matrix n*n this will take as  arg matrix n-1*n-1 and populate it without the said row and col.
     * edge case: this dunction is for all n*n matrices when n>=3
     * @param srcMatrix matrix that will be populated across the recursion stacks, must be square
     * @param i index for iteration over rows
     * @param j index for iteration over columns
     * @param row - row that will be removed from the original matrix
     * @param col - col that will be removed` from the original matrix
     */
    public static void populateSubMatrixWithoutRowIAndColJ(int[][] srcMatrix, int i, int j, int row, int col, int[][] dstMatrix, int dstMatrixIIndex, int dstMatrixJIndex)
    {
        if(i == srcMatrix.length)
        {
            return;

        }
        else if(j == srcMatrix.length)
        {
            j = 0;
            populateSubMatrixWithoutRowIAndColJ(srcMatrix,i+1,j,row,col, dstMatrix,dstMatrixIIndex,dstMatrixJIndex);
        }
        else
        {
            if(i != row && j != col)
            {
                dstMatrix[dstMatrixIIndex][dstMatrixJIndex] = srcMatrix[i][j];
                dstMatrixJIndex++;
                if(dstMatrixJIndex == dstMatrix.length)
                {
                    dstMatrixJIndex = 0;
                    dstMatrixIIndex++;
                }
            }
            populateSubMatrixWithoutRowIAndColJ(srcMatrix,i,j+1,row,col,dstMatrix,dstMatrixIIndex,dstMatrixJIndex);
        }

    }


    public static boolean isPower(int a, int b)
    {
        return isPowerHelper(a, b, b);
    }
    public static boolean isPowerHelper(int a, int b, int num)
    {
        if(num > a)
        {
            return false;
        }
        else if(num == a)
        {
            return true;
        }
        return isPowerHelper(a,b, num * b);
    }
    public static boolean subsetSum(int[] arr, int sum)
    {
        if (sum == 0)
        {
            return true;
        }
        return subsetSum(arr, sum,0,arr[0],1);
    }

    public static boolean subsetSum(int[] arr, int sum,int idx, int currentSum, int idxOffset)
    {
        if(idx + idxOffset >= arr.length)
        {
            return false;
        }
        if(currentSum == sum)
        {
            return true;
        }
        else if(currentSum > sum)
        {
            return false;
        }
        if(idx == arr.length-1) {
            return currentSum == sum;
        }
        int midCalc = currentSum + arr[idx+idxOffset];
        if(midCalc == sum)
        {
            return true;
        }
        boolean isCurrentSubsuetEqualsSum= subsetSum(arr, sum,idx ,midCalc, idxOffset +1);

        if(isCurrentSubsuetEqualsSum)
        {
            return isCurrentSubsuetEqualsSum;
        }
        else
        {
            midCalc -= arr[idx + idxOffset];
            boolean isNextSubsetEqualsSum = subsetSum(arr, sum,idx ,midCalc, idxOffset + 1);
            if(isNextSubsetEqualsSum) {
                return isNextSubsetEqualsSum;
            }
        }
        return subsetSum(arr, sum,idx + 1 ,arr[idx + 1], 1);




    }
    public static int tribonacciElement(int n)
    {
        if(n == 1 || n == 0)
        {
            return 0;
        }
        if(n == 2)
        {
            return 1;
        }
        return tribonacciElement(n-1) + tribonacciElement(n-2) + tribonacciElement(n-3);
    }


    public static int[] tribonacciSequence(int n)
    {
        int[] cache = new int[n];
         tribonacciSequence(n,cache, 0);
         return cache;
    }
    public static int tribonacciSequence(int n, int[] cache, int currIdx)
    {
        if(currIdx >= cache.length)
        {
            return -1;
        }

        if(currIdx == 0)
        {
            cache[currIdx] = HW4.tribonacciElement(currIdx);
        }
        else if (currIdx == 1)
        {
            cache[currIdx] = cache[currIdx-1];

        }
        else if (currIdx == 2)
        {
            cache[currIdx] = HW4.tribonacciElement(currIdx);

        }
        else
        {
            cache[currIdx] = cache[currIdx -1] + cache[currIdx -2] + cache[currIdx -3];
        }
        return HW4.tribonacciSequence(n, cache,currIdx +1 );







    }

    public static int primeFactors(int  n)
    {
        System.out.print("the prime factors of " + n + " are:");
        int numOfPrimeFactors = primeFactors(n,2,0);
        return numOfPrimeFactors;
    }
    public static int primeFactors(int  n,int divider,int counter)
    {
        if(n  == 1)
        {
            System.out.println();
            return counter;
        }
        if(n % divider == 0)
        {
            int quotient = n / divider;
            System.out.print(divider);
            if (n != divider)
            {
                System.out.print(", ");
            }
            return primeFactors(n / divider,2,counter + 1);
        }
        return primeFactors(n, divider + 1, counter);
    }
}