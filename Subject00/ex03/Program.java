import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String string = scanner.nextLine();

		long minweek = 0;

		int final_week = 1;

		long temp_minweek = 0;

		long result = 0;

		while (string.equals("42") == false) {
			for (int k = 1; k <= 18; k++) {
				if (string.equals("Week" + " " + k)) {
					minweek = scanner.nextInt();
					for (int i = 1; i < 5; i++) {
						temp_minweek = scanner.nextInt();
						if (temp_minweek < minweek) {
							minweek = temp_minweek;
						}
					}
					result = result + ElevateTen(minweek, k);
				}
				else {
					System.err.println("IllegalArgument");
					System.exit(-1);
				}
			}
			string = scanner.nextLine();
		}

		int k = 1;

		while (result > 0) {
			System.out.print("week" + " " + k);
			for (long j = result % 10; j > 0; j--) {
		System.out.print("=");
			}
			System.out.println(">");
			result = result / 10;
			k++;
		}
	}

	private static long ElevateTen(long num, int k) {
		long dex = 1;
		for (int i = 1; i < k; i++){
			dex = dex * 10;
		}
		num = num * dex;
		return (num);
	}
}
