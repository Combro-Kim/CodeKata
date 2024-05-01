import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = k + 1;
        }

        for (int tc = 0; tc < m; tc++) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int original_i = arr[i];
            
            arr[i] = arr[j];
            arr[j] = original_i;
        }
        String result = Arrays.toString(arr).replaceAll("[\\[\\],]","");
        System.out.printf(result);
    }
}