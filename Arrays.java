
import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        // Ввод массива с консоли
        System.out.println("Введите элементы массива");
        for (int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
        }

        Random random = new Random();
        // Заполнение массива случайными числами
        for (int i = 0; i < length; i++){
            array[i] = random.nextInt(100);
        }

        // Вывод массива
        for (int i = 0; i < length; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // Вывод массива
        for (int arr : array){
            System.out.println(arr);
        }

        // Вывод массива в обратном порядке
        for (int i = length - 1; i >= 0; i--){
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // Ввод элементов массива и их вывод
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("array[" + i + "] = " + array[i]);
        }

        int sum = 0;
        // Сумма элементов массива
        for (int i = 0; i < length; i++){
            sum += array[i];
        }

//        Минимальный и максимальный элемент массива
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++){
            if (array[i] < min){
                min = array[i];
            }

            if (array[i] > max){
                max = array[i];
            }
        }

//        Минимальный и максимальный элемент массива
        for (int number : array) {

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }
        // Вывод результата
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        scanner.close();
    }
}
