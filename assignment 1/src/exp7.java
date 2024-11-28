import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exp7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int binary1, binary2;
        System.out.print("enter the first binary representation: ");
        binary1 = scanner.nextInt();
        System.out.print("enter the second binary representation: ");
        binary2 = scanner.nextInt();


        int decimal1,decimal2;
        decimal2 =decimal1 = 0;

        int multi= 1;
        while (binary1 > 0)
        {
            decimal1 += (int)((binary1 % 10) * multi);
            binary1 /= 10;
            multi *=2;
        }
        multi = 1;
        while (binary2 > 0)
        {
            decimal2 += (int)((binary2 % 10) * multi);
            binary2 /= 10;
            multi *=2;
        }


        int sum = decimal2 + decimal1;



        String binaryNum = "";
        while (sum > 0)
        {
            int whole = sum /2;
            int reminder = sum - whole * 2;
            binaryNum += String.valueOf(reminder);
            sum = whole;
        }
        //reverse string logic
        String reversed = "";
        for(int i = 0; i < binaryNum.length(); i++)
        {
            char ch = binaryNum.charAt(i);
            reversed = ch + reversed;
        }
        // return parsed string into int



        System.out.println("output: " + reversed);
        scanner.close();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }

}