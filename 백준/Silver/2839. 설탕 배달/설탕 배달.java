import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(count(n));
	}

	public static int count(int n) {
		int cnt = 0;
		while (n > 0) {
			if (n % 5 == 0) {
				cnt += n / 5;
				n = 0;
				break;
			}
			n -= 3;
			cnt++;
		}
		if (n == 0)
			return cnt;
		else
			return -1;
	}
}
