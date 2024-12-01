import java.util.Scanner;

public class Task5{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите порядковый номер месяца: ");
		int numOfMonth = scanner.nextInt();
		int quantityMonthInYear = 12 - numOfMonth;

		System.out.println("Кол-во месяцев, оставшихся до конца года: " + quantityMonthInYear);

		scanner.close();


	}
}