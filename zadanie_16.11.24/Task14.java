import java.util.Scanner;

public class Task14{

	// главный метод
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите, какое будет кол-во чисел (n): ");
		int n = scanner.nextInt();
		System.out.println("Введите, какое число по индексу не будем учитывать(i<=n): ");
		int i = scanner.nextInt();

		double a[] = new double[n]; // массив int-ов длиной n
		double sumNums = 0; // сумма всех чисел

		System.out.println("Введите вещественные числа: ");
		for (int j = 0; j < n; j++) {
			a[j] = scanner.nextDouble();
			sumNums += a[j];
		}

		double answer = (sumNums - a[i]) / (n - 1);

		System.out.println("среднее ариф всех чисел кроме i-ого: " + answer);		

		scanner.close();
	}


}
    
        

        