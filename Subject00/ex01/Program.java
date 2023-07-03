import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		if (num <= 1) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}

		boolean prime = true;

		int iterations = 0;

		int i = 2;

		while (i <= num / 2) {
			iterations++;
			if (num % i == 0) {
				prime = false;
				break;
			}
			i++;
		}
		System.out.print(prime + " ");
		System.out.println(iterations);
	}
}
