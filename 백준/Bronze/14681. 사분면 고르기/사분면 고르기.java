import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;
        if(a>0 && b>0){
            answer = 1;
        } else if (a<0&& b>0) {
            answer = 2;
        } else if (a < 0 && b < 0) {
            answer = 3;
        }else {
            answer = 4;
        }
        System.out.printf("%d",answer);

    }
}