import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'A']++;
        }

        int max = 0;
        char ch = '?';

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                ch = (char) (j + 65);
            } else if (arr[j] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
