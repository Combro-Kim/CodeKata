import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int answer = 0;
        sc.close();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            answer = 1;
        }
        System.out.printf("%d", answer);
    }
}