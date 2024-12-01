import java.util.Scanner;

public class Num5{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, какое будет кол-во чисел (n): ");
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " числа(чисел): ");
        double arrElem[] = new double[n];

        // ввод и изменение элементов
        for (int i = 0; i < n; i++) {
            double digit = scanner.nextDouble();
            if (digit < 0) {
                arrElem[i] = digit + 0.5;
            } else {
                arrElem[i] = 0.1;
            }

        }

        // вывод посл - ти
        for (int i = 0; i < n; i++) {
            System.out.print(arrElem[i] + " ");
        } 

        scanner.close();
    }


}
