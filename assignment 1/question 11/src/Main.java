import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        int tries = 2;
        System.out.println("please eneter number grater than 1");
        num = reader.nextInt();
        while (num < 1) {
            if (tries == 0) {
                System.out.println("Error: the number must be greater than 1, Exiting Program");
                return;
            }
            System.out.println("Error: the number must be greater than 1, please try again");
            System.out.println("please eneter number grater than 1");
            num = reader.nextInt();
            tries--;
        }
        PrintPrimeDivisors(num);
    }




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    public static void PrintPrimeDivisors(int number)
    {
        int divisor;
        while (!(IsPrime(number)))
        {
            divisor = GetSmallestPrimeDivisor(number);
            System.out.print(divisor + "*");
            number /= divisor;
        }
        System.out.print(number);
    }
    public static int GetSmallestPrimeDivisor (int number)
    {

        for(int i = 2; i <number; i++)
        {
            if(IsPrime(i) &&number % i == 0)
            {
                return i;
            }
        }
        return 1;

    }
    public static boolean IsValid(int lower, int upper)
    {
        return ((lower > 0 && upper > 0) && (upper >= lower));
    }
    public static boolean IsPrime(int num)
    {
        if (num == 1)
            return false;
        if(num == 2)
            return true;
        for(int i = 2; i < num; i++)
        {
            if(num % i ==0)
                return false;
        }
        return true;
    }
}