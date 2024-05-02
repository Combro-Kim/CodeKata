import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int arr[] = new int[28];
        HashSet<Integer> set = new HashSet<>();
        int result[] = new int[2];

        for (int i = 0; i < 28; i++) {
            set.add(sc.nextInt());
        }

        for(int i = 1; i <=30; i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}