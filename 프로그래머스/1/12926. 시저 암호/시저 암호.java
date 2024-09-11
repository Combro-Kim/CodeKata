class Solution {
	public String solution(String s, int n) {
		String answer = "";

		for (char str : s.toCharArray()) {
			answer += shiftChar(str, n);
		}
		return answer;
	}

	public static char shiftChar(char c, int n) {
		if (c >= 'a' && c <= 'z') {
			return (char) ((c - 'a' + n) % 26 + 'a');
		} else if (c >= 'A' && c <= 'Z') {
			return (char) ((c - 'A' + n) % 26 + 'A');
		} else {
			return c;
		}
	}
}