import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		// new Scanner(сюда передаем место, где будут считываться данные)
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите размер массива (n): ");

		int lenArrays = scanner.nextInt();
		// int[] arrays - создается массив int-ов, ссылка хранится в arrays
		// new int[lenArrays] - выделяется память для массива int-ов длиной 5 в динамическая памяти
		int[] arrays = new int[lenArrays];

		/*
		если значения известны при создании массива
		int[] numbers = {1, 2, 3, 4, 5};
		*/

		for (int i = 0; i < lenArrays; i++) {
			if (i % 2 == 1) {
				arrays[i] = (i*2+1)*(-1);
			} else {
				arrays[i] = (i*2+1);
			}
			System.out.print(arrays[i] + " ");
		}

	}
}