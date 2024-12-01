import java.util.Scanner;

public class Num10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите возраст (n<=100): ");

		int n = scanner.nextInt();

		int lastDigit = n % 10;

		if (lastDigit == 0 || (lastDigit >= 5 && lastDigit <= 9)) {
			System.out.println(n + " лет");
		} else if (lastDigit >= 2 && lastDigit <= 4) {
			System.out.println(n + " года");
		} else {
			System.out.println(n + " год");
		}

	}

}