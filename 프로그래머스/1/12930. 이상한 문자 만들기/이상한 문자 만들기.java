class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		int idx = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				idx = 0;
				answer.append(c);
				continue;
			}
			if (idx % 2 == 0) {
				answer.append(Character.toUpperCase(c));
			} else {
				answer.append(Character.toLowerCase(c));
			}
			idx++;
		}
		return answer.toString();
	}
}