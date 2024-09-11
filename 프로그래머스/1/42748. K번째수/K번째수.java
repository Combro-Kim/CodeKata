import java.util.*;
class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int n = 0; n < commands.length; n++) {
			int i = commands[n][0]-1, j = commands[n][1], k = commands[n][2]-1;
			int arr[] = Arrays.copyOfRange(array, i, j);
            Arrays.sort(arr);
			answer[n] = arr[k];

		}
		return answer;
	}
}