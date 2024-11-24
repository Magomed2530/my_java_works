import java.util.Scanner;

public class Number_9 {
	 public static void main(String[] args) {

	 	Scanner scanner = new Scanner(System.in);
	 	System.out.println("Введите 3 положительных действительных числа:");

	 	// создание и наполнение массива
	 	double[] array_values_of_numbers = new double[3];
	 	for (int i=0; i < 3; i++) {
	 		array_values_of_numbers[i] = scanner.nextDouble();
	 	}
	 	double x = array_values_of_numbers[0];
	 	double y = array_values_of_numbers[1];
	 	double z = array_values_of_numbers[2];


	 	// проверка существования треугольника
	 	if ((x + y > z) && (y + z > x) && (x + z > y)) {
	 		System.out.println("Такой треугольник существует");

	 		// проверка остроугольности треугольника
	 		double x2 = x * x;
            double y2 = y * y;
            double z2 = z * z;

            if ((x2 + y2 > z2) && (x2 + z2 > y2) && (y2 + z2 > x2)) {
                System.out.println("Треугольник остроугольный.");
            } else {
                System.out.println("Треугольник не остроугольный.");
            }

	 	} else {
	 		System.out.println("Такой треугольник не существует");
	 	}


	 }
}