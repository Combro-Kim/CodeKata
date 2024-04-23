import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%d\n", a + b);
        }
    }
}