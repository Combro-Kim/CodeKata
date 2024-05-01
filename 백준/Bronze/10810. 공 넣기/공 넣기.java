import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int tc = 0; tc < m; tc++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int range = i - 1; range <= j - 1; range++) {
                arr[range] = k;
            }
        }
        String result = Arrays.toString(arr).replaceAll("[\\[\\],]","");

        System.out.printf(result);
    }
}

