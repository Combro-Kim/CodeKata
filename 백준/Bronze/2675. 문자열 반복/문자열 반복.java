import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for (int k = 0; k < s.length(); k++) {
                for (int j = 0; j < r; j++) {
//                    System.out.print(s.charAt(k));
                    sb.append(s.charAt(k));
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}