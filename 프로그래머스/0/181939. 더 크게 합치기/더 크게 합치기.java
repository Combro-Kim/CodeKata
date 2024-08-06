class Solution {
    public int solution(int a, int b) {
        String s_a = Integer.toString(a);
        String s_b = Integer.toString(b);
        
        int sumA = Integer.parseInt(s_a + s_b);
        int sumB = Integer.parseInt(s_b + s_a);
        
        return (Math.max(sumA, sumB));
    }
}