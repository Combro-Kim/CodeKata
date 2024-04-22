import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
/*        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        int result = h * 60 + m + time;

        h = (result / 60) %24;
        m = result%60;

        System.out.printf("%d %d",h, m);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        int result = h * 60 + m + time;

        h = (result / 60) %24;
        m = result%60;

        System.out.printf("%d %d",h, m);

    }
}