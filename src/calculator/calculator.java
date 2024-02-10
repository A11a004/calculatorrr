package calculator;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();

        System.out.println("Введите число b: ");
        int b = in.nextInt();

        if ((a <= 0 || a > 10) || (b <= 0 || b > 10)) {
            System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 10 включительно");
            return;
        }

        System.out.println("Введите операцию: +, -, *, / ");
        Scanner in1 = new Scanner(System.in);
        String action = in1.nextLine();

        int result = 0;
        switch (action) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Ошибка: Неправильная операция");
                return;
        }
        System.out.println("Результат: " + result);
    }
}