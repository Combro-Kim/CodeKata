import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String a = " ".repeat(n - i);
            String result = "*".repeat(i);
            System.out.println(a + result);
        }
    }
}