import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			String[] arr = new String[5];
			Arrays.fill(arr, "+");
			arr[i] = "#";
			String result = Arrays.toString(arr).replaceAll("[\\[\\], ]", "");
			System.out.println(result);
		}
	}
}