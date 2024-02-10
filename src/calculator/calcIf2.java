package calculator;
import java.util.Scanner;
public class calcIf2 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введитье число a:");
        int a = in.nextInt();
        System.out.println("Введитье число b:");
        int b = in.nextInt();
        if ((a<=0 || a>10) || (b<=0 || b>10) ) {
            System.out.println("ошибка");
        }
        System.out.println("введитье выражние:");
        Scanner in1 = new Scanner (System.in);
        String action = in1.nextLine();
        int result = 0;
        if (action.equals("+")) {
            result = a + b;
        }
        else if (action.equals("-")) {
            result = a - b;
        }
        else if (action.equals("*")) {
            result = a * b;
        }
        else if (action.equals("/")) {
            result =  a / b;
        }
        else {
            System.out.println("ошибка");
        }
        System.out.println("Результат: " + result );
        in.close ();
    }
}
