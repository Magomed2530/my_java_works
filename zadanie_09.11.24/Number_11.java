import java.util.Scanner;

public class Number_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 действительных числа:");

        // создание и наполнение массива
        double[] arrayValuesNumbers = new double[3];
        for (int i = 0; i < 3; i++) {
            arrayValuesNumbers[i] = scanner.nextDouble();
        }
        double a = arrayValuesNumbers[0];
        double b = arrayValuesNumbers[1];
        double c = arrayValuesNumbers[2];

        if (a != 0) {

            double discriminant = Math.pow(b, 2) - (4 * a * c);
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant) / (2*a));
                double x2 = (-b - Math.sqrt(discriminant) / (2*a));
                System.out.println("x1=" + x1 + " x2=" + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
            } else {
                System.out.println("Корней нет");
            }
            
        } else {
            System.out.print("A равно 0, уравнение решаться не будет");
        }

    }
}    