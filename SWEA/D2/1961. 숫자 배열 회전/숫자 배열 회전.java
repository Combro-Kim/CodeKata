import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int[][] arr90 = new int[n][n];
			int[][] arr180 = new int[n][n];
			int[][] arr270 = new int[n][n];

			// arr
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// arr90
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr90[i][j] = arr[n - 1 - j][i];
				}
			}
			// 180도 회전
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr180[i][j] = arr90[n - 1 - j][i];
				}
			}

			// 270도 회전
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr270[i][j] = arr180[n - 1 - j][i];
				}
			}

			System.out.printf("#%d\n", tc);
			for (int i = 0; i < n; i++) {

				// 90
				for (int a = 0; a < n; a++) {
					System.out.print(arr90[i][a]);
				}
				System.out.print(" ");
				// 180
				for (int b = 0; b < n; b++) {
					System.out.print(arr180[i][b]);
				}
				System.out.print(" ");
				// 270
				for (int c = 0; c < n; c++) {
					System.out.print(arr270[i][c]);
				}
				System.out.println();
			}
		}
	}
}