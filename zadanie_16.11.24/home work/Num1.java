import java.util.Scanner;

public class Num1{

	// главный метод
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите целое число k, 2<k<9 (k - СС): ");
		int k = scanner.nextInt();

		// Проверка корректности основания
        if (k < 2 || k >= 9) {
            System.out.println("Основание системы счисления должно быть в диапазоне от 2 до 8.");
            return;
        }

		System.out.println("Введите целое число n (число, в " + k + "-ичной СС): ");
		int n = scanner.nextInt();

		// Перевод числа n из системы счисления с основанием k в десятичную
        int decimalValue = 0; // десятичный вид
        int power = 0; // возводим цифру в эту степень

        while (n > 0) {
            int digit = n % 10; // Последняя цифра числа

            // Проверка корректности цифры в системе счисления
            if (digit >= k) {
                System.out.println("Цифра " + digit + " недопустима для системы счисления с основанием " + k);
                return;
            }

            decimalValue += digit * Math.pow(k, power);
            power++;
            n /= 10; // Убираем последнюю цифру
        }

        // Вывод результата
        System.out.println("Число в десятичной системе счисления: " + decimalValue);

		scanner.close();
	}


}

/*
из 2 СС -> 10 СС:
1101  = 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0
*/
    
        


