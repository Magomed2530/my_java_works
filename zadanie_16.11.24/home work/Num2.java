import java.util.Scanner;

public class Num2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // для наличия 2 локальных максимумов, длина посл-ти должна быть не меньше 5
        System.out.println("Введите длину последовательности >=5: ");
        int length = scanner.nextInt();

        // Проверка корректности length
        if (length < 5) {
            System.out.println("длина " + length + " слишком маленькая");
            return;
        }

        int arrElem[] = new int[length];

        System.out.println("Вводите саму последовательность: ");
        // current - текущий
        for (int numCurrentElement=0; numCurrentElement < length; numCurrentElement++) {
            arrElem[numCurrentElement] = scanner.nextInt();
        }

        int quantityLocalMax = 0; // кол-во локальных максимумов

        // проходим по элементам от 2 от предпоследнего
        for (int i = 1; i < length-1; i++) {
            if (arrElem[i] % 2 == 0 && arrElem[i] > arrElem[i-1] && arrElem[i] > arrElem[i+1]) {
                quantityLocalMax++;  
            }
        }
    

        if (quantityLocalMax == 2) {
            System.out.println("У последовательности ровно 2 четных по значению локальных максимума");
        } else {
            System.out.println("У последовательности не 2 четных по значению локального максимума");
        }


        scanner.close();

    }
}
