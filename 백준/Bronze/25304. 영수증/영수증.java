import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int allPrice = sc.nextInt();
        int cnt = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <cnt;i++){
            int eachPrice = sc.nextInt();
            int eachCnt = sc.nextInt();
            sum += eachPrice*eachCnt;
        }
        String result = "";
        if(allPrice == sum){
            result = "Yes";
        }else{
            result = "No";
        }
        System.out.printf(result);
    }
}
