import java.util.Scanner;

public class Task1{
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Ввод числа k
        System.out.println("Введите целое число от 1 до 5: ");
        int k = scanner.nextInt();

        // Переменная для хранения результата
        String description;

        // Проверка значения k
        switch (k) {
            case 1:
                description = "плохо";
                break;
            case 2:
                description = "неудовлетворительно";
                break;
            case 3:
                description = "удовлетворительно";
                break;
            case 4:
                description = "хорошо";
                break;
            case 5:
                description = "отлично";
                break;
            default:
                description = "ошибка";
        }

        // Вывод результата
        System.out.println("Результат: " + description);
        scanner.close();
	}
}