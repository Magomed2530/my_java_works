import java.util.Scanner;
 

public class Number_8 {
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 4 вещественных числа: ");

		// создание и наполнение массива
		double[] array = new double[4];
		for (int i = 0; i < 4; i++) {
			array[i] = scanner.nextDouble();
		} 

		
		// поиск макс элемента массива
		double max = Double.NEGATIVE_INFINITY;  //  Double.NEGATIVE_INFINITY - минус бесконечность типа double
		for (int i = 0; i < 4; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		
		// если условие истина, то заменим все элементы массива на макс элемент
		if (array[0] <= array[1] && array[1] <= array[2] && array[2] <= array[3]) {
			for (int i = 0; i < 4; i++) {
				array[i] = max;
			}
		} else if (array[0] > array[1] && array[1] > array[2] && array[2] > array[3]) {
			// Оставляем числа без изменений (ничего делать не нужно)
		} else {
			for (int i = 0; i < 4; i++) {
				array[i] = Math.pow(array[i], 2);
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}


	}
}