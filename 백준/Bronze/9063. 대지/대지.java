import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;

		for (int tc = 0; tc < t; tc++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			maxX = Math.max(maxX, x);
			maxY = Math.max(maxY, y);
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
		}

		System.out.println((maxX - minX) * (maxY - minY));
	}
}