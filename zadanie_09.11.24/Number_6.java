import java.util.Scanner;

public class Number_6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 3 вещественных числа: ");

		double number;

		for (int i = 0; i < 3; i++) {
			number = scanner.nextDouble();
			if (number >= 1 && number <=3) {
				System.out.println("число " + number + " принадлежит (1, 3)");
			} else {
				System.out.println("число " + number + " не принадлежит (1, 3)");
			}
		}

	}
}