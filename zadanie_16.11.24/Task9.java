import java.util.Scanner;

public class Task9{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("какое будет кол-во чисел: ");

		int length = scanner.nextInt();

		System.out.println("Какие будут числа: ");

		int number; // число (каждый раз новое)

		int sumNumbers = 0; // сумма подходящих чисел
		int quantityNumbers = 0; // кол-во подходящих чисел

		for (int i = 0; i < length; i++) {
			number = scanner.nextInt();
			if (number % 5 == 0 && number % 7 != 0) {
				quantityNumbers++;
				sumNumbers += number;
			}
		}

		System.out.println("кол-во чисел кратных 5 и не кратных 7: " + quantityNumbers);
		System.out.println("сумма этих чисел: " + sumNumbers);
	}
}