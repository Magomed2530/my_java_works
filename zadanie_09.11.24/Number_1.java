import java.util.Scanner;

public class Number_1 {
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 2 целых числа: ");

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));


	}
}
