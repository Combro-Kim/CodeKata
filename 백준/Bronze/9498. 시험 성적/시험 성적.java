import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String score = "";
        if (n >= 90) {
            score = "A";
        } else if (n >= 80) {
            score = "B";
        } else if (n >= 70) {
            score = "C";
        } else if (n >= 60) {
            score = "D";
        } else {
            score = "F";
        }
        System.out.printf(score);
    }
}