import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			System.out.printf("#%d\n", tc);

			int[] arr = new int[n];
			arr[0] = 1;

			for (int i = 0; i < n; i++) {
				for (int j = i; j > 0; j--) {
					arr[j] += arr[j - 1];
				}
				arr[i] = 1;

				for (int k = 0; k <= i; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}

		}
		sc.close();

	}
}