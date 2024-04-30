import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        // StringTokenizer은 한 번 사용되며 모든 토큰을 소진하게 되므로, 추가해야 함

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value < x) {
                sb.append(value).append(' ');
            }
        }
        System.out.println(sb);
    }
}