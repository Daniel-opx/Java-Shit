import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex4 {
    public static void main(String[] args) {
        String dayACE = "9:00-14:00";
        String dayB = "9:00-13:00";
        String dayD = "9:00-13:00, 16:00-19:00";
        String dayF = "08:00- 12:00";
        String dayG = "closed";

        Scanner scanner = new Scanner(System.in);
        char day = scanner.findInLine(".").charAt(0);
        if (day >= 'a' && day <= 'z')
        {
            day = (char)(day - 32);
        }
        switch (day)
        {
            case 'A':
                System.out.println("call center hours:" + dayACE);
                break;
            case 'B':
                System.out.println("call center hours:" + dayB);
            case 'C':
                System.out.println("call center hours:" + dayACE);
            case 'D':
                System.out.println("call center hours:" + dayD);
            case 'E':
                System.out.println("call center hours:" + dayACE);
            case 'F':
                System.out.println("call center hours:" + dayF);
            case 'G':
                System.out.println("call center hours:" + dayG);




        }

    }
}