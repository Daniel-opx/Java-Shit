//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       for(int i = 100; i < 1000; i++)
       {
           if(IsPalindrome(i))
               System.out.print(i + ",");
       }
    }
    public static boolean IsPalindrome(int number)
    {
        return number == ReverseNum(number);
    }
    public static int ReverseNum(int num)
    {
        int reversedNum = 0;
        for(int i = GetNumLength(num)-1; i >-1;i--)
        {
            reversedNum += (int)((num%10) *Power(10,i));
            num = num/10;
        }
        return reversedNum;
    }
    public static double Power(double base, double exponent)
    {
        double res = 1;
        while(exponent >= 1)
        {
            res = res * base;
            exponent--;
        }
        return res;
    }
    public static int GetNumLength(int a)
    {
        int counter = 0;
        while (a > 0)
        {
            a =a/10;
            counter++;
        }
        return counter;
    }


}