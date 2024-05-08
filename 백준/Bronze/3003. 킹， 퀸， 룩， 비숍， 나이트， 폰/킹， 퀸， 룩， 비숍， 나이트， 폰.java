import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = arr[i]-n;
        }
        String result = Arrays.toString(arr).replaceAll("[\\[\\],]","");
        System.out.println(result);
    }
}