import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc = 1; tc<=t;tc++) {
			String s = sc.next();
			
			for(int i = 1; i<s.length();i++) {
				if(s.substring(0,i).equals(s.substring(i,i*2))) {
					System.out.printf("#%d %d\n", tc,i);
					break;
				}
			}
		}
       	sc.close();
		
	}
}