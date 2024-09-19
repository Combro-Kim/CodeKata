class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;
		int rest = n;
		int num = 0;

		while (rest >= a) {
			num = rest / a * b;
			answer += num;
			rest = rest % a + num;
		}

		return answer;
	}
}