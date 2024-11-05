import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[][] snail = new int[n][n];
			int num = 1;
			int x = 0, y = 0;
			int direction = 0;
			int[] dx = { 0, 1, 0, -1 };
			int[] dy = { 1, 0, -1, 0 };

			while (num <= n * n) {
				snail[x][y] = num++;
				int nx = x + dx[direction];
				int ny = y + dy[direction];

				if (nx < 0 || nx >= n || ny < 0 || ny >= n || snail[nx][ny] != 0) {
					direction = (direction + 1) % 4;
					nx = x + dx[direction];
					ny = y + dy[direction];
				}
				x = nx;
				y = ny;
			}
			System.out.printf("#%d\n", tc);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}