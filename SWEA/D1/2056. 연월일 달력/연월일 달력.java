import java.util.Scanner;

// 20210102
public class Solution {
	public static void main(String[] args) {
		int arr[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tc = 1; tc < t + 1; tc++) {
			String s = sc.next();
//			int year = Integer.parseInt(s.substring(0, 4));
//			int month = Integer.parseInt(s.substring(4, 6));
//			int day = Integer.parseInt(s.substring(6, 8));

			String year = s.substring(0, 4);
			String month = s.substring(4, 6);
			String day = s.substring(6, 8);

			String result = "-1";

//			if (day > arr[month] && month < 1 && month>12 && day < 1) {
			if (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= arr[Integer.parseInt(month)]) {
				result = (year + "/" + month + "/" + day);
			}
			System.out.println("#" + tc + " " + result);

		}
		sc.close();
	}
}