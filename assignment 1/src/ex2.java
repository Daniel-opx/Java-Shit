import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive numbers with at least 4 digits: ");
        int num = scanner.nextInt();
        while(num > 9999 || num <1000)
        {
            System.out.print("please try again\nEnter a positive numbers with at least 4 digits: ");
            num = scanner.nextInt();
        }
        int reversedNum = 0;
        while(num > 0)
        {
            reversedNum = reversedNum * 10 + (num % 10);
            num /= 10;
        }
//        int reversedNum = 0;
//        for(int i = GetNumLength(num)-1; i >-1;i--)
//        {
//            reversedNum += (int)((num%10) *Math.pow(10,i));
//            num = num/10;
//        }
        System.out.println("The reversed number is: " + reversedNum);
        scanner.close();

    }

}