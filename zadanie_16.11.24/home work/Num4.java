import java.util.Scanner;

public class Num4{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, какое будет кол-во чисел (n): ");
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " числа(чисел): ");

        int cnt = 0; // кол-во чисел, подходящих критериям

        for (int i = 0; i < n; i++) {
            // перебираем все числа
            int digit = Math.abs(scanner.nextInt()); // abs - т.к. могут ввести отриц число
            int lengthDigit = String.valueOf(digit).length(); // длина digit, приведенного к строке
            //     ||-укороченное логическое ИЛИ
            if (lengthDigit == 3 || lengthDigit == 5) {
                // все четные или все нечетные
                if (allDigitsEven(digit) || allDigitsOdd(digit)) {
                    cnt++;

                }
            } 
        }

        if (cnt == 2) {
            System.out.println("Кол-во подходящих чисел равно 2");
        } else {
            System.out.println("Кол-во подходящих чисел не равно 2");
        }

        scanner.close();
    }



    // Метод для проверки, что все цифры числа четные
    static boolean allDigitsEven(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) { // Если хоть одна цифра нечетная
                return false;
            }
            num /= 10; // Убираем последнюю цифру
        }
        return true; // Все цифры четные
    }


    // Метод для проверки, что все цифры числа нечетные
    static boolean allDigitsOdd(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) { // Если хоть одна цифра четная
                return false;
            }
            num /= 10; // Убираем последнюю цифру
        }
        return true; // Все цифры нечетные
    }

}
