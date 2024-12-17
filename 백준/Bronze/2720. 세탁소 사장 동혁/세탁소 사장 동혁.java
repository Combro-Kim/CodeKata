import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[] { 25, 10, 5, 1 };

		for (int tc = 0; tc < t; tc++) {
			int[] answer = new int[4];
			int c = sc.nextInt();
			int n = 0;

			for (int i = 0; i < arr.length; i++) {
				answer[i] = c / arr[i];
				c = c % arr[i];
			}
			String result = Arrays.stream(answer).mapToObj(String::valueOf).collect(Collectors.joining(" "));
			System.out.println(result);
		}
	}
}