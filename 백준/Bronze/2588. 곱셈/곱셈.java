import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        sc.close();

        System.out.println(n * (str.charAt(2) - '0'));
        System.out.println(n * (str.charAt(1) - '0'));
        System.out.println(n * (str.charAt(0) - '0'));
        System.out.println(n * Integer.parseInt(str));
    }
}