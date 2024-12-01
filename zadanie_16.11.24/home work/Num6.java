import java.util.Scanner;

public class Num6{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вещественное число a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите натуральное число n: ");
        int n = scanner.nextInt();

        // проверка корректности n (0 считаем натуральным)
        if (n < 0) {
            System.out.println(n + " - не натуральное");
            return;
        }

        System.out.println(func1(a, n));
        System.out.println(func2(a, n));
    }


    static double func1(double a, int n) {
        // должна вернуть 1/a + 1/a^2 + 1/a^4 + ... + 1/a^2^n
        double sumNums = 0; // здесь добавляется по 1 слагаемому каждую итерацию
        for (int i = 0; i<=n; i++) {
            sumNums += 1 / (Math.pow(a, Math.pow(2, n)));
        }
        return sumNums;
    }


    static double func2(double a, int n) {
        // должна вернуть a(a-n)(a-2n)...(a-n^n) = (a-0*n)(a-1*n)(a-2*n)...(a-n*n)
        double mulNums = 1; // здесь добавляется по 1 множителю каждую итерацию
        for (int i=0; i <=n; i++) {
            mulNums *= (a-i*n);
        }
        return mulNums;
    }


}
