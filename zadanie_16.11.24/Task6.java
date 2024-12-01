import java.util.Scanner;

public class Task6{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите длину прямоугольника: ");
		int length = scanner.nextInt();

		System.out.println("Введите ширину прямоугольника: ");
		int width = scanner.nextInt();

		for (int i=1; i < width+1; i++) {
			for (int j=1; j < length+1; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		scanner.close();


	}
}