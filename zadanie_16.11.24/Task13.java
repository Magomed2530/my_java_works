import java.util.Scanner;

public class Task13{

	// главный метод
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите действительное число a: ");
		double a = scanner.nextDouble();
		System.out.println("Введите натуральное число n: ");
		int n = scanner.nextInt();

		System.out.println("func1: " + func1(a, n));
		System.out.println("func2: " + func2(a, n));
		System.out.println("func3: " + func3(a, n));

		scanner.close();
	}

	// первая функция
	static double func1(double a, int n) {
		return Math.pow(a, n);
	} 
	

	// вторая функция
	static double func2(double a, int n) {
		// должна вернуть a(a+1)...(a+n-1)
		double productResult = 1;
        for (int i = 0; i < n; i++) {
            productResult *= (a + i);
        }
		return productResult;
	}

	// третья функция
	static double func3(double a, int n) {
		// должна вернуть 1/a + 1/(a+1) + ... + 1/(a(a+1)...(a+n))

		// denominatorNumber - знаменатель числа (знаменатель новой дроби больше предыдущего)
		double denominatorNumber = 1;

		// generalResult - сумма (новая сумма дробей больше предыдущей, так как кол-во дробей растет)
		double generalResult = 0;

		for (int i = 0; i <= n; i++) {
			denominatorNumber *= (a+i); // в каждом слагаемом знаменатель всё больше
			generalResult += 1 / denominatorNumber; // добавляем дробь к посл-ти
		}

		return generalResult;
	}


}
    
        

        