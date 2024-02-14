package calculator;
import java.util.Scanner;
public class calcIf2 {
    public static void main (String[] args) {
        int a=-1, b=0;
        if (( a<=0 || a>10) || (b<=0 || b>10) ) {
            System.out.println("error");
        }

        Scanner in = new Scanner (System.in);
        System.out.println("havasarun:");
        a = in.nextInt();
        b = in.nextInt();
        String action = in.nextLine();
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
