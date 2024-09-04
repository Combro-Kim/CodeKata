import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) {
                sb.append(n);
                list.add(n);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }

        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(answer);
        return answer;
    }
}