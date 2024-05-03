import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = Arrays.stream(arr).max().orElse(0);

        double arg = 0;
        for (int j : arr) {
            arg += (double) j / m * 100;
        }
        arg = arg / n;

        System.out.printf("%f\n", arg);
    }
}