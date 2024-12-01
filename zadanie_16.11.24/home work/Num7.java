/* перебор элементов строки
String s = "Techie Delight";
for (int i = 0; i < s.length(); i++) {
    System.out.print(s.charAt(i));
*/

import java.util.Scanner;

public class Num7{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число n<=100: ");
        int n = scanner.nextInt();

        // проверка корректности n (0 считаем натуральным)
        if (n < 1 || n > 100) {
            System.out.println(n + " - не подходит критериям");
            return;
        }

        String strN = String.valueOf(n); // привиденное к строке n


        int digitCount = strN.length(); // а) кол-во цифр в числе


        int sumOfDigits = 0; // b) сумма цифр числа
        int copyN = n;
        while (copyN > 0) {
            sumOfDigits += copyN % 10;
            copyN /= 10;
        }
        // Метод charAt() в Java возвращает СИМВОЛ, расположенный по указанному индексу строки( поэтому firstDigit - тип данных char)
        // НАДО CHAR, А НЕ STRING (строка состоит из символов, а здесь только 1 символ)
        char firstDigit = strN.charAt(0); // c) первая цифра числа

        String secondLastDigit = "";; // d) предпоследняя цифра числа
        if (n >= 10) {
            // digitCount-2  - это индекс предпоследнего элемента
            secondLastDigit = String.valueOf(strN.charAt(digitCount-2));
        }

        System.out.println("кол-во цифр: " + digitCount);
        System.out.println("сумма цифр: " + sumOfDigits);
        System.out.println("первая цифра: " + firstDigit);
        System.out.println("предпоследняя цифра: " + secondLastDigit);
    }

}

