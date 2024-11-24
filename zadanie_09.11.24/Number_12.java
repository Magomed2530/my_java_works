import java.util.Scanner;

public class Number_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");

        int number = scanner.nextInt(); // число для перевода

        String binary = toBinary(number);
        System.out.println("Число " + number + " в двоичной системе равно: " + binary);
    }

    // метод возвращает String, принимает int
    public static String toBinary(int number) {
        // при иниициализации переменной типа String, ей надо задать значение хотя бы пустой строки
        String binary_num = "";

        // Пока число больше 0, вычисляем остатки от деления на 2
        while (number > 0) {
            // String remainder = String.valueOf(number % 2); - приводит к строке все примитаивные типы данных
            String remainder = String.valueOf(number % 2); // Остаток от деления на 2 
            binary_num += remainder;  // Добавляем остаток в строку
            number /= 2;       // Делим число на 2
        }


        // Разворачиваем строку, так как биты добавлялись в обратном порядке
        // Создаём объект StringBuilder на основе строки binary_num,
        // применяем метод reverse() для разворота строки
        // и преобразуем результат обратно в String с помощью toString().
        binary_num = new StringBuilder(binary_num).reverse().toString();
        return binary_num;
    }    

    
}    

