import java.util.Scanner;

public class Task10{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("какое будет кол-во чисел: ");

		int n = scanner.nextInt();

		System.out.println("Какие будут числа: ");

		double number; // числа
		double sumNumbers = 0; // сумма чисел

		for (int i = 0; i < n; i++) {
			number = scanner.nextDouble();
			if (number > 0) {
				sumNumbers += number;
			}
		}
		sumNumbers *= 2;

		System.out.println("удвоенная сумма чисел: " + sumNumbers);
	}
}