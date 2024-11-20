import my.first.package1.Hello;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int foo = s.nextInt();
    System.out.println(sum(5,4));

    }
     static int sum(int a ,int b )
    {
        return a+b;
    }
}