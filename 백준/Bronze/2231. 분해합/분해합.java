import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strN = sc.nextLine();
		int n = Integer.parseInt(strN);
		int result = 0;
		

		for(int i = n-(strN.length() * 9); i< n; i++) {
			int number = i;
			int sum = 0;
			
			while(number !=0) {
				sum += number % 10;
				number /=10;
			}
			
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		sc.close();
	}
}