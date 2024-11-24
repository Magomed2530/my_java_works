import java.util.Scanner;

public class Number_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 3 вещественных числа: ");

		double[] array = new double[3];

		double num;
		for (int i = 0; i < 3; i++) {
			num = scanner.nextDouble();
			if (num >= 0) {
				array[i] = Math.pow(num, 2);    // num возводится во 2 степень
			} else {
				array[i] = num;
			}
			
		}

		System.out.println("Результат: ");
		for (double value : array){
            System.out.println(value);
        }
		
	}
}