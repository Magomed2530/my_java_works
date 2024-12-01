import java.util.Scanner;

public class Task11{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("какое будет кол-во чисел: ");

		int n = scanner.nextInt();

		System.out.println("Какие будут числа: ");

		int number; // числа
		int mulNumbers = 1; // сумма чисел

		for (int i = 0; i < n; i++) {
			number = scanner.nextInt();
			if (number % 7 == 0) {
				mulNumbers *= number;
			}
		}

		System.out.println("произведение чисел кратных 7: " + mulNumbers);
	}
}