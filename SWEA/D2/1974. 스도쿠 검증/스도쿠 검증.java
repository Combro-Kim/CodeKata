import java.util.*;

class Solution
{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int[][] arr = new int[9][9];
			// 배열 채우기
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.printf("#%d %d\n", tc, sudoqu(arr));
		}
	}

	public static int sudoqu(int[][] arr) {

		// 가로
		for (int i = 0; i < 9; i++) {
			Set<Integer> rowSet = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (!rowSet.add(arr[i][j])) {
					return 0;
				}
			}
		}
		// 세로
		for (int i = 0; i < 9; i++) {
			Set<Integer> colSet = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (!colSet.add(arr[j][i])) {
					return 0;
				}
			}
		}
		// 3*3
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				Set<Integer> boxSet = new HashSet<>();
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						if (!boxSet.add(arr[i + k][j + l])) {
							return 0;
						}
					}
				}
			}
		}
		return 1;
	}
}