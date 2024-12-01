import java.util.Scanner;

public class Task8{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите длину последовательности >=3: ");
		int length = scanner.nextInt();

		int arrElem[] = new int[length];

		System.out.println("Вводите саму последовательность: ");
		// current - текущий
		for (int numCurrentElement=0; numCurrentElement < length; numCurrentElement++) {
			arrElem[numCurrentElement] = scanner.nextInt();
		}

		boolean localMax = false;

		// проходим по элементам от 2 от предпоследнего
		for (int i = 1; i < length-1; i++) {
			if (arrElem[i] % 2 == 0 && arrElem[i] > arrElem[i-1] && arrElem[i] > arrElem[i+1]) {
				localMax = true;  
				break;  // выход из цикла, если найдено локальное максимум
			}
		}
	

		if (localMax == true) {
		  	System.out.println("У последовательности есть четный по значению локальный максимум");
		} else {
			System.out.println("У последовательности нет четного по значению локального максимума");
		}


		scanner.close();

	}
}
