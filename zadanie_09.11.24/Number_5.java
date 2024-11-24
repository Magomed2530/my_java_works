import java.util.Scanner;

public class Number_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите положительное целое число: ");

		int number = scanner.nextInt();

		int sum = 0;

		while (number > 0) {
			sum += (number % 10);  // прибавляем последнюю цифру числа
			number /= 10;      // т.к. тип int, то деление будет целочисленное
		}
		System.out.println(sum);
	}
}