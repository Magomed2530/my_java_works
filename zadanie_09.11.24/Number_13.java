import java.util.Scanner;

public class Number_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // вводим самый первый элемент
        System.out.print("Введите число a: ");
        // previousNumber - предыдущее число
        int previousNumber = scanner.nextInt();

        while (true) {
            System.out.println("Введите текущее число: ");
            // currentNumber - текущее число
            int currentNumber = scanner.nextInt();

            // если текущее < прыдыдущего, то цикл завершается
            if (currentNumber < previousNumber) {
                System.out.println("Ввод завершен, так как " + currentNumber + " < " + previousNumber);
                break;
            }

            // если же текущее число не меньше предыдущего, текущее станет предыдущим, и в новой итерации мы зададим новое текущее число
            previousNumber = currentNumber;
        } 

        scanner.close();   // СКАННЕР НАДО ЗАКРЫВАТЬ ПОСЛЕ ОКОНЧАНИЯ ИСПОЛЬЗОВАНИЯ
    }

    
}    
