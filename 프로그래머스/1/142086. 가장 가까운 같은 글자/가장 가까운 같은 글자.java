import java.util.*;

class Solution {
    public static int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        List<Character> arr = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (arr.contains(c)) {
                for (int j = arr.size() - 1; j >= 0; j--) {
                    if (c == arr.get(j)) {
                        answer.add(arr.size() - j);
                        break;
                    }
                }
            } else {
                answer.add(-1);
            }
            arr.add(c);
        }

        // List를 int[] 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}