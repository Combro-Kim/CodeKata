import java.util.*;

class Solution {
	public int solution(int k, int[] tangerine) {
		int sum = 0;
		int cnt = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : tangerine) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
		for (int v : valueList) {
			if (sum + v >= k) {
				cnt++;
				break;
			} else {
				sum += v;
				cnt++;
			}
		}

		return cnt;
	}
}