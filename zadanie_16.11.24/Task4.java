import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		System.out.println("Введите любую букву от a до f: ");
		Scanner scanner = new Scanner(System.in);

		// nextInt() - принимает int, nextDouble() - double
		// next() - принимает String
		String letter = scanner.next();

		// length() - длина строки
		if (letter.length() == 1) {
			// letter.toUpperCase() - приводит строку к верх регистру
			System.out.println(letter.toUpperCase());
			// строки в Java неизменяемы, и вызов toUpperCase создаёт новую строку
		} else {
			System.out.println("Введена не одна буква");
		}

		scanner.close();
	}
}
