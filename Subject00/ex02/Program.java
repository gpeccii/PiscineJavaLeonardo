import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int counter_coffee = 0;

		while (num != 42) {
			if(PrimeNumber(SumDigit(num)) == true) {
				counter_coffee++;
			}
			num = scanner.nextInt();
		}
		System.out.println("Count of coffee-request -" + counter_coffee);
	}

	private static int SumDigit(int num) {
		int res = 0;

		while (num > 0) {
			res += num % 10;
			num = num / 10;
		}
		return (res);
	}

	private static boolean isPrime(int num) {
		boolean prime = true;

		int i = 2;

		while (i <= num / 2) {
			if (num % i == 0) {
				prime = false;
				break;
			}
			i++;
		}
		return (prime);
	}
}

