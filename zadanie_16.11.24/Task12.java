import java.util.Scanner;

public class Task12{

	// главный метод
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите действительное число a: ");

		double a = scanner.nextDouble();

		System.out.println("func1: " + func1(a));
		System.out.println("func2: " + func2(a));
	}

	// первая функция
	static double func1(double x) {
		if (x >= -2 && x < 2) {
			return Math.pow(x, 2);
		} else {
			return 4;
		}
	}

	// вторая функция
	static double func2(double x) {
		if (x <= 2) {
			return Math.pow(x, 2) + 4 * x + 5;
		} else {
			return 1 / (Math.pow(x, 2) + 4 * x + 5);
		}		
	}


}