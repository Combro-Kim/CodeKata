class Solution {
	public static int[] solution(int[] sequence, int k) {
		int[] answer = new int[2];
		int left = 0, right = 0;
		int minLength = Integer.MAX_VALUE;
		int sum = sequence[0];

		while (right < sequence.length) {
			if (sum == k) {
				int currentLength = right - left + 1;

				if (currentLength < minLength) {
					minLength = currentLength;
					answer[0] = left;
					answer[1] = right;
				}
				sum -= sequence[left];
				left++;
			} else if (sum < k) {
				right++;
				if (right < sequence.length) {
					sum += sequence[right];
				}
			} else { // sum > k
				sum -= sequence[left];
				left++;
			}
		}

		return answer;
	}
}