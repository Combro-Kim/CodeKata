import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			String s = Integer.toString(i);
			int cnt = 0;

			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (ch == '3' || ch == '6' || ch == '9') {
					cnt++;
				}
			}

			if (cnt > 0) {
				for (int k = 0; k < cnt; k++) {
					System.out.print("-");
				}
			} else {
				System.out.print(i);
			}
			
			if(i<n) {
				System.out.print(" ");
			}

		}
	}
}