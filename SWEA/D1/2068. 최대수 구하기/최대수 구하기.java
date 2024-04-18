
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[10];

        for (int tc = 1; tc <= T; tc++) {
            int max = 0;
            //case.1
            /*
           for(int i = 0; i<10;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.printf("#%d %d",tc,arr[9]);
            */
            //case.2
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (max < num) {
                    max = num;
                }
            }
            System.out.printf("#%d %d\n", tc, max);
        }
    }
}