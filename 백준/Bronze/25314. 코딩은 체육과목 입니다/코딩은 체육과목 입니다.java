import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";

        for (int i = 0; i < n / 4; i++) {
            str += "long ";
        }

        System.out.printf(str + "int");
    }
}