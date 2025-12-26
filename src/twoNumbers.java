import java.util.Scanner;

public class twoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение для 'a': ");
        int a = scanner.nextInt();
        System.out.print("Введите значение для 'b': ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Результат сравнения: " + a + " > " + b);
        } else if (a < b) {
            System.out.println("Результат сравнения: " + a + " < " + b);
        }else{
            System.out.println("Результат сравнения: " + a + " = " + b);
        }

        int sum  = a + b;
        System.out.println("Сумма чисел: " + sum);
        int sub = a - b;
        System.out.println("Разность чисел: " + sub);
        int multi = a * b;
        System.out.println("Произведение чисел: " + multi);

        if (b == 0) {
            System.out.print("Делить на ноль нельзя.");
        }else{
            int div = a / b;
        System.out.println("Деление чисел: " + div);
        }
        scanner.close();
    }
}