import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex3 {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter number");
        a = s.nextInt();
        System.out.println("enter the second number");
        b = s.nextInt();
        while (a == b)
        {
            System.out.println("the second and first number is equal, please enter new number for the second number");
            b = s.nextInt();
        }

        if (SumOfDigits(a) == SumOfDigits(b))
        {
            System.out.printf("the numbers %d and %d have the same sum of digits",a,b);
        }
        else
        {
            System.out.printf("the numbers %d and %d do not have the same sum of digits",a,b);
        }


    }
    public static int SumOfDigits(int num)
    {
        if (num < 0)
            return num;
        int sum = 0;
        for(int i = 0;i < GetNumLength(num);i++)
        {
            sum += (num%10);
            num = num / 10;
        }
        return sum;

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