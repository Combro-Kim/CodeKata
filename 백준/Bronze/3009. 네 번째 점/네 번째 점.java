import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer, Integer> heightMap = new HashMap<>();
		Map<Integer, Integer> widthMap = new HashMap<>();

		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			heightMap.put(a, heightMap.getOrDefault(a, 0) + 1);
			widthMap.put(b, widthMap.getOrDefault(b, 0) + 1);
		}
		sc.close();
		int x = 0, y = 0;

		for (Integer a : heightMap.keySet()) {
			if (heightMap.get(a) == 1) {
				x = a;
			}
		}
		for (Integer a : widthMap.keySet()) {
			if (widthMap.get(a) == 1) {
				y = a;
			}
		}

		System.out.printf("%d %d\n", x, y);
	}
}