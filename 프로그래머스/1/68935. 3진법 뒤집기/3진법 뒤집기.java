class Solution {
    public int solution(int n) {
        String str = Integer.toString(n,3);
        String reverseStr = new StringBuilder(str).reverse().toString();
        int answer = Integer.parseInt(reverseStr,3);
        return answer;
    }
}