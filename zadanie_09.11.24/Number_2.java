import java.util.Scanner;

public class Number_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите 2 вещественных числа: ");

		double Num1 = scanner.nextDouble();
		double Num2 = scanner.nextDouble();

		if (Num1 == Num2) {
			System.out.println("числа равны");
		} else {
			System.out.println("числа не равны");
		}
	}
}