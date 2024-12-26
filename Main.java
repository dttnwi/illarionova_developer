import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четыре целых числа:");
        System.out.print("Число 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Число 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Число 3: ");
        int num3 = scanner.nextInt();
        System.out.print("Число 4: ");
        int num4 = scanner.nextInt();
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        System.out.println("Максимальное число: " + max);

        scanner.close();
    }
}
