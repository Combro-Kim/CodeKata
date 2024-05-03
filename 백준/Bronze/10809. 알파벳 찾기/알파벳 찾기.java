import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
        String result = Arrays.toString(arr).replaceAll("[\\[\\],]", "");
        System.out.printf(result);
    }
}