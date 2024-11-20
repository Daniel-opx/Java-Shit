import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int binary1, binary2;
        System.out.println("enter the first binary representation: ");
        binary1 = scanner.nextInt();
        System.out.println("enter the second binary representation: ");
        binary2 = scanner.nextInt();

        int decimal1 = ConvertToBase10(binary1,2);
        int decimal2 = ConvertToBase10(binary2,2);
        int sum = decimal2 + decimal1;

        System.out.println("output: " + ConvertDecimalToBaseN(sum,2));






        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
    public static int ConvertDecimalToBaseN(int decimalNum, int N)
    {
        String binaryNum = "";
        while (decimalNum > 0)
        {
            int whole = decimalNum /N;
            int reminder = decimalNum - whole * N;
            binaryNum += String.valueOf(reminder);
            decimalNum = whole;
        }
        //reverse string logic
        String reversed = "";
        for(int i = 0; i < binaryNum.length(); i++)
        {
            char ch = binaryNum.charAt(i);
            reversed = ch + reversed;
        }
        // return parsed string into int
        return Integer.parseInt(reversed);
    }
    public static int ConvertToBase10(int num, double base)
    {
        double power= 0;
        int Decimal = 0;
        while (num > 0)
        {
            Decimal += (int)((num % 10) * Math.pow(base, power++));
            num /= 10;
        }
        return Decimal;
    }
}