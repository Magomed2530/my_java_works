package third_tasks;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {

//        объявление двумерного массива
        int[][] array = new int[2][2];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

//        объявить содержимое массива
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        внешний цикл проходит по строкам, а внутренний — по столбцам.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        for-each
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int columns = scanner.nextInt();

        int[][] matrix2 = new int[rows][columns];

        System.out.println("Введите элементы матрицы построчно:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введённая матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}

