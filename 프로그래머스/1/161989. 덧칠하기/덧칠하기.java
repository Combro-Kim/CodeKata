class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;

        for (int i : section) {
            if (i > last) {
                last = i + m - 1;
                answer++;
            }
        }
        return answer;
    }
}