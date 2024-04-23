import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a != b && a != c && b != c) { //3개 다 다를 경우
            System.out.printf("%d", Math.max(a, Math.max(b, c)) * 100);
        } else {
            if (a == b && b == c) { //3개 다 같을 경우
                System.out.printf("%d", 10000 + a * 1000);
            } else { //2개만 같을 경우 -> a,b / b,c / a,c
                if (a == b || a == c) { //(a,b) (a,c)
                    System.out.printf("%d", 1000 + a * 100);
                } else { // b,c
                    System.out.printf("%d", 1000 + b * 100);
                }
            }
        }
    }
}