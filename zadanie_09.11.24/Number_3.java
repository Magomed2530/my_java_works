import java.util.Scanner;

public class Number_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите вещественных 2 числа: ");


		double Num1 = scanner.nextDouble();
		double Num2 = scanner.nextDouble();

		if (Num1 <= Num2) {
			Num1 = 0;
			System.out.println("теперь первое число равно: " + Num1);
		} else {
			System.out.println("хорошо, первое всё ещё равно: " + Num1);
		}
	}
}