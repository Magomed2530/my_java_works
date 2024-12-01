import java.util.Scanner;

public class Task7{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите целое число a: ");
		int a = scanner.nextInt();

		System.out.println("Введите целое число b: ");
		int b= scanner.nextInt();

		System.out.println("Введите вещественное число z: ");
		double z = scanner.nextDouble();
		
		int x = a % b;
		if (a % b == 0) {
			z *= x;
		} else {
			z /= x;
		}

		System.out.println("z = " + z);


		scanner.close();


	}
}