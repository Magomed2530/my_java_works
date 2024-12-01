import java.util.Scanner;

public class Num9 {

	public static void main(String[] args) {
		// new Scanner(сюда передаем место, где будут считываться данные)
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите вещественное число (a): ");

		double a = scanner.nextDouble();

		System.out.println(func1(a));
		System.out.println(func2(a));
	}



	static double func1(double x) {
		if (x <= 0) {
			return 0;
		} else if (0 < x && x <= 1) {
			return x;
		} else {
			return Math.pow(x, 4);
		}
	}

	static double func2(double x) {
		if (x <= 0) {
			return 0;
		} else if (0 < x && x <= 1) {
			return Math.pow(x, 2) - x;
		} else {
			return Math.pow(x, 2) - Math.sin(Math.PI * Math.pow(x, 2));
		}
	}

}