import java.util.Scanner;
import jVA.util.Random;

public class Arrays {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите длину массива: ");
		int length = scanner.nextInt();
		
		int[] array = new int[length];

		System.out.println("Введите элементы массива: ");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}

		Random random = new Random();

		for (int i = 0; i < length;)
	}
}