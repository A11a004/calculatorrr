package calculator;
import java.util.Scanner;

public class calculatorJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение в формате <число> <операция> <число>: ");
        String expression = in.nextLine();
        String[] parts = expression.split(" ");
        if (parts.length != 3) {
            System.out.println("Ошибка: Неправильный формат выражения");
            return;
        }
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String action = parts[1];
        if ((a <= 0 || a > 10) || (b <= 0 || b > 10)) {
            System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 10 включительно");
            return;
        }
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
