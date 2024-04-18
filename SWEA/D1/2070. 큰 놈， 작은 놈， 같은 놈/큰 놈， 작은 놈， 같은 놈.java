import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int tc= 1; tc<=T;tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            String result = "";
            if(a>b){
                result = ">";
            }else if(a<b){
                result = "<";
            }else{
                result = "=";
            }
            System.out.printf("#%d %s\n",tc,result);
        }
    }
}