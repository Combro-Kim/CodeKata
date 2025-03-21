import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		List<Integer> answerList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum <= m) {
						answerList.add(sum);
					}
				}
			}
		}
		System.out.println(Collections.max(answerList));
	}
}