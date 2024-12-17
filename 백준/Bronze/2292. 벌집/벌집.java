import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int cnt = 1;
		int range = 2;

		if (input == 1) {
			System.out.println(1);
		} else {
			while (range <= input) {
				range = range + (6 * cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}