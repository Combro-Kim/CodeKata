import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == -1) {
				break;
			} else {
				int[] divisors = aliquot(n);
				int sum = Arrays.stream(divisors).sum() - n;
				if (sum == n) {
					String s = Arrays.stream(divisors).filter(i -> i != n).mapToObj(String::valueOf)
							.collect(Collectors.joining(" + "));
					System.out.printf("%d = %s\n", n, s);
				} else {
					System.out.println(n + " is NOT perfect.");
				}
			}
		}
	}

	public static int[] aliquot(int n) {
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				arr.add(i);
				if (i != n / i) {
					arr.add(n / i);
				}
			}
		}
		Collections.sort(arr);

		int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
		return result;

	}
}