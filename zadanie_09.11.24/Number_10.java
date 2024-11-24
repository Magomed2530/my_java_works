import java.util.Scanner;

public class Number_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 положительных действительных числа:");

        // создание и наполнение массива
        double[] array_values_of_numbers = new double[3];
        for (int i = 0; i < 3; i++) {
            array_values_of_numbers[i] = scanner.nextDouble();
        }
        double x = array_values_of_numbers[0];
        double y = array_values_of_numbers[1];
        double z = array_values_of_numbers[2];

        if (x != y && x != z && y != z) {

            if ((x + y + z) < 1) {

                if (x < y && x < z) {
                    x = (y + z) / 2;
                    System.out.println("x=" + x);
                } else if (y < x && y < z) {
                    y = (x + z) / 2;
                    System.out.println("y=" + y);
                } else if (z < x && z < y) {
                    z = (x + y) / 2;
                    System.out.println("z=" + z);
                }

            } else {

                if (x < y && x < z) {
                    x = (y + z) / 2;
                    System.out.println("x=" + x);
                } else if (y < x && y < z) {
                    y = (x + z) / 2;
                    System.out.println("y=" + y);
                }

            }

        } else{
            System.out.println("Числа не попарно различны");
        }

    }
}    