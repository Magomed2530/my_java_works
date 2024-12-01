import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите число X: ");
		double number = scanner.nextDouble();

		System.out.println("Введите номер действия: ");
		System.out.println("1 - возвести в квадрат: ");
		System.out.println("2 - извлечь корень: ");
		System.out.println("3 - вычислить синус (вводить градус угла): ");
		System.out.println("4 - вычислить косинус (вводить градус угла): ");

		int operation = scanner.nextInt();
		double answer;

		switch (operation) {
			case 1:
				answer = Math.pow(number, 2);
				break;
			case 2:
				answer = Math.sqrt(number);
				break;
			case 3:
				answer = Math.sin(Math.toRadians(number));
				break;
			case 4:
				answer = Math.cos(Math.toRadians(number));
				break;
			default:
				answer = 0;
				break;
		}
		// String.valueOf(...) - приводит примитивные типы данных к строке
		System.out.println("Результат: " + String.valueOf(answer));

		scanner.close();
	}
}
