import java.util.Scanner;

public class Task2 {
	public static  void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите, сколько сейчас часов одним числом и без минут: ");

		// ввод времени в часах
		int hours = scanner.nextInt();

		toGreet(hours);

		scanner.close();
	}

	// метод для приветствия
	public static void toGreet (int houreTime) {
		if (houreTime >= 0 && houreTime < 6) {
			System.out.println("Night");
		} else if (houreTime >= 6 && houreTime < 12) {
			System.out.println("Morning");
		} else if (houreTime >= 12 && houreTime < 18) {
			System.out.println("Afternoon");
		} else if (houreTime >= 18 && houreTime < 24) {
			System.out.println("Evening");
		}
	}

}
