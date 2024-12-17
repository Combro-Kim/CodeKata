import java.util.*;

public class Main {

	public static boolean[] era(int n, int m) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (arr[i]) {
				for (int j = i * i; j <= n; j += i) {
					arr[j] = false;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		boolean[] arr = era(n, m);

		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = m; i <= n; i++) {
			if (arr[i]) {
				sum += i;
				if (min > i) {
					min = i;
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
