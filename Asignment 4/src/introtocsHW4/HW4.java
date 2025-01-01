package introtocsHW4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW4 {
    public static void main(String[] args) {


    }
    public static int  findSecondMax(int[] arr)
    {
        int firstMax = findFirstMax(arr,1,arr[0]);
        int secondMax = findSecondMax(arr,1,arr[0],firstMax);
        return secondMax;
    }


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
        return 1;
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
    public static boolean subsetSum(int[] arr, int a)
    {
        return true;
    }
    public static int tribonacciElement(int a)
    {
        return 5;
    }

    public static int[] tribonacciSequence(int num)
    {
        return new int[]{1,1,1};
    }

    public static int primeFactors(int  a)
    {
        return 5;
    }
}