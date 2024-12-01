import java.util.Scanner;

public class Num3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число m: ");
        int m = scanner.nextInt();

        System.out.println("Введите целое число n (n != m): ");
        int n = scanner.nextInt();

        // Проверка корректности n и m
        if (n == m) {
            System.out.println("n не должно быть равно m ");
            return;
        }

        double PI = 3.141592653589793;

        if (Math.abs(m/n - PI) < Math.abs(n/m - PI)) {
            m *= 10;
        } else if (Math.abs(m/n - PI) > Math.abs(n/m - PI)) {
            n *= 2;
        }
        System.out.println("m=" + m + ", n=" + n);


        scanner.close();

    }
}
